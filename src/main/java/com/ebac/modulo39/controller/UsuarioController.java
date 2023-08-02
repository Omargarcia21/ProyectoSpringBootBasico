package com.ebac.modulo39.controller;

import com.ebac.modulo39.dto.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @GetMapping("/usuarios")
    public List<Usuario> obtenerUsuarios() {
        // Devuelve un objeto User que se convertirá automáticamente en JSON/XML en la respuesta.
        return List.of(new Usuario());
    }

    @GetMapping("/usuarios/{id}")
    public Usuario obtenerUsuarioPorId(@PathVariable Long id) {
        // Lógica para obtener el usuario por su ID
        // Devuelve un objeto User que se convertirá automáticamente en JSON/XML en la respuesta.
        System.out.println("Id recibido: " + id);
        return new Usuario();
    }

    @PostMapping("/usuarios")
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario) {
        // Lógica para crear un nuevo usuario
        // Retorna ResponseEntity con el objeto User en el cuerpo y un código de estado 201 (CREATED) en la respuesta.
        System.out.println("Usuario recibido: " + usuario);
        return ResponseEntity.ok(usuario);
    }

    @PutMapping("/usuarios/{id}")
    public ResponseEntity<Usuario> actualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuarioActualizado) {
        // Lógica para actualizar el usuario con el ID proporcionado
        // Retorna ResponseEntity con el objeto User actualizado en el cuerpo y un código de estado 200 (OK) en la respuesta.
        System.out.println("Id recibido: " + id);
        System.out.println("Usuario recibido: " + usuarioActualizado);
        return ResponseEntity.ok(usuarioActualizado);
    }

    @DeleteMapping("/usuarios/{id}")
    public ResponseEntity<Void> eliminarUsuario(@PathVariable Long id) {
        // Lógica para eliminar el usuario con el ID proporcionado
        // Retorna ResponseEntity con un código de estado 204 (NO_CONTENT) en la respuesta.
        System.out.println("Id recibido: " + id);
        // Si el usuario se eliminó exitosamente, respondemos con un código de estado 204 (NO_CONTENT) sin cuerpo de respuesta.
        return ResponseEntity.noContent().build();
    }
}
