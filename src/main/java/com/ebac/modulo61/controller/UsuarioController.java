package com.ebac.modulo61.controller;

import com.ebac.modulo61.dto.Usuario;
import com.ebac.modulo61.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/usuarios")
    public List<Usuario> obtenerUsuarios() {
        // Devuelve un objeto User que se convertirá automáticamente en JSON/XML en la respuesta.
        return usuarioService.obtenerUsuarios();
    }

    @GetMapping("/usuarios/{id}")
    public ResponseEntity<Usuario> obtenerUsuarioPorId(@PathVariable Long id) {
        // Lógica para obtener el usuario por su ID
        // Devuelve un objeto User que se convertirá automáticamente en JSON/XML en la respuesta.
        Optional<Usuario> usuarioOptional = usuarioService.obtenerUsuarioPorId(id);

        return usuarioOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/usuarios")
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario) throws URISyntaxException {
        // Lógica para crear un nuevo usuario
        // Retorna ResponseEntity con el objeto User en el cuerpo y un código de estado 201 (CREATED) en la respuesta.
        usuarioService.crearUsuario(usuario);

        return ResponseEntity.created(new URI("http://localhost/usuarios")).build();
    }

    @PutMapping("/usuarios/{id}")
    public ResponseEntity<Usuario> actualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuarioActualizado) {
        // Lógica para actualizar el usuario con el ID proporcionado
        // Retorna ResponseEntity con el objeto User actualizado en el cuerpo y un código de estado 200 (OK) en la respuesta.
        Optional<Usuario> usuarioOptional = usuarioService.obtenerUsuarioPorId(id);

        if (usuarioOptional.isPresent()) {
            usuarioActualizado.setIdUsuario(usuarioOptional.get().getIdUsuario());
            usuarioService.actualizarUsuario(usuarioActualizado);

            return ResponseEntity.ok(usuarioActualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/usuarios/{id}")
    public ResponseEntity<Void> eliminarUsuario(@PathVariable Long id) {
        // Lógica para eliminar el usuario con el ID proporcionado
        // Retorna ResponseEntity con un código de estado 204 (NO_CONTENT) en la respuesta.
        usuarioService.eliminarUsuario(id);

        return ResponseEntity.noContent().build();
    }
}
