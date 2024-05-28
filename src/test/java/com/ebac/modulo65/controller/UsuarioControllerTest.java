package com.ebac.modulo65.controller;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;

//@ExtendWith(MockitoExtension.class)
class UsuarioControllerTest {

    /*@Mock
    UsuarioService usuarioService;

    @InjectMocks
    UsuarioController usuarioController;

    @Test
    void obtenerUsuarios() {
        int usuarios = 5;
        List<Usuario> usuariosListExpected = crearUsuarios(usuarios);

        // Configuramos el comportamiento del mock
        when(usuarioService.obtenerUsuarios()).thenReturn(usuariosListExpected);

        // Ejecutamos el metodo del controlador
        List<Usuario> usuariosListActual = usuarioController.obtenerUsuarios();

        // Validamos el resultado
        assertEquals(usuarios, usuariosListActual.size());
        assertEquals(usuariosListExpected, usuariosListActual);
    }

    @Test
    void obtenerUsuariosCuandoNoExisten() {
        // Configuramos el comportamiento del mock
        when(usuarioService.obtenerUsuarios()).thenReturn(List.of());

        // Ejecutamos el metodo del controlador
        List<Usuario> usuarioListActual = usuarioController.obtenerUsuarios();

        // Validamos el resultado
        assertTrue(usuarioListActual.isEmpty());

        verify(usuarioService, times(1)).obtenerUsuarios();
    }

    @Test
    void obtenerUsuarioPorId() {
        long idUsuario = 1;
        Optional<Usuario> usuarioExpected = Optional.of(crearUsuarios(1).get(0));

        // Configuramos el comportamiento del mock
        when(usuarioService.obtenerUsuarioPorId(idUsuario)).thenReturn(usuarioExpected);

        // Ejecutamos el metodo del controlador
        ResponseEntity<Usuario> usuarioResponseEntity = usuarioController.obtenerUsuarioPorId(idUsuario);
        Usuario usuarioActual = usuarioResponseEntity.getBody();

        // Validamos el resultado
        assertEquals(200, usuarioResponseEntity.getStatusCode().value());
        assertNotNull(usuarioActual);
        assertEquals("Nombre1", usuarioActual.getNombre());
    }

    @Test
    void obtenerUsuarioPorIdCuandoNoExiste() {
        long idUsuario = 1;

        // Configuramos el comportamiento del mock
        when(usuarioService.obtenerUsuarioPorId(idUsuario)).thenReturn(Optional.empty());

        // Ejecutamos el metodo del controlador
        ResponseEntity<Usuario> usuarioResponseEntity = usuarioController.obtenerUsuarioPorId(idUsuario);
        Usuario usuarioActual = usuarioResponseEntity.getBody();

        // Validamos el resultado
        assertEquals(404, usuarioResponseEntity.getStatusCode().value());
        assertTrue(Objects.isNull(usuarioActual));
    }

    @Test
    void crearUsuario() throws Exception {
        Usuario usuarioExpected = crearUsuarios(1).get(0);

        // Configuramos el comportamiento del mock
        when(usuarioService.crearUsuario(usuarioExpected)).thenReturn(usuarioExpected);

        // Ejecutamos el metodo del controlador
        ResponseEntity<Usuario> usuarioResponseEntity = usuarioController.crearUsuario(usuarioExpected);
        Usuario usuarioActual = usuarioResponseEntity.getBody();

        // Validamos el resultado
        assertEquals(201, usuarioResponseEntity.getStatusCode().value());
        assertTrue(Objects.isNull(usuarioActual));
    }

    @Test
    void actualizarUsuario() {
        int idUsuario = 5;
        String nombreActualizado = "Beatriz";
        int edadActualizada = 25;

        Usuario usuarioAntiguo = new Usuario();
        usuarioAntiguo.setIdUsuario(idUsuario);
        usuarioAntiguo.setNombre("Julieta");
        usuarioAntiguo.setEdad(28);

        Usuario usuarioActualizado = new Usuario();
        usuarioActualizado.setNombre(nombreActualizado);
        usuarioActualizado.setEdad(edadActualizada);

        // Configuramos el comportamiento del mock
        when(usuarioService.obtenerUsuarioPorId((long) idUsuario)).thenReturn(Optional.of(usuarioAntiguo));
        doNothing().when(usuarioService).actualizarUsuario(usuarioActualizado);

        // Ejecutamos el metodo del controlador
        ResponseEntity<Usuario> usuarioResponseEntity = usuarioController.actualizarUsuario((long) idUsuario, usuarioActualizado);
        Usuario usuarioActual = usuarioResponseEntity.getBody();

        // Validamos el resultado
        assertEquals(200, usuarioResponseEntity.getStatusCode().value());
        assertNotNull(usuarioActual);
        assertEquals(idUsuario, usuarioActual.getIdUsuario());
        assertEquals(nombreActualizado, usuarioActual.getNombre());
        assertEquals(edadActualizada, usuarioActual.getEdad());
    }

    @Test
    void actualizarUsuarioCuandoElUsuarioNoExiste() {
        long idUsuario = 5;
        String nombreActualizado = "Beatriz";
        int edadActualizada = 25;

        Usuario usuarioActualizado = new Usuario();
        usuarioActualizado.setNombre(nombreActualizado);
        usuarioActualizado.setEdad(edadActualizada);

        // Configuramos el comportamiento del mock
        when(usuarioService.obtenerUsuarioPorId(idUsuario)).thenReturn(Optional.empty());

        // Ejecutamos el metodo del controlador
        ResponseEntity<Usuario> usuarioResponseEntity = usuarioController.actualizarUsuario(idUsuario, usuarioActualizado);
        Usuario usuarioActual = usuarioResponseEntity.getBody();

        // Validamos el resultado
        assertEquals(404, usuarioResponseEntity.getStatusCode().value());
        assertNull(usuarioActual);
        verify(usuarioService, never()).actualizarUsuario(usuarioActualizado);
    }

    @Test
    void eliminarUsuario() {
        long idUsuario = 1;

        // Configuramos el comportamiento del mock
        doNothing().when(usuarioService).eliminarUsuario(idUsuario);

        // Ejecutamos el metodo del controlador
        ResponseEntity<Void> responseEntity = usuarioController.eliminarUsuario(idUsuario);

        // Validamos el resultado
        assertEquals(204, responseEntity.getStatusCode().value());
        verify(usuarioService, atLeastOnce()).eliminarUsuario(idUsuario);
    }

    @Test
    void crearUsuarioCuandoSeaMenorA18() throws Exception {
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(1);
        usuario.setNombre("Nombre");
        usuario.setEdad(10);

        // Configuramos el comportamiento del mock
        doThrow(Exception.class).when(usuarioService).crearUsuario(usuario);

        // Ejecutamos el metodo del controlador
        ResponseEntity<Usuario> responseEntity = usuarioController.crearUsuario(usuario);
        Usuario usuarioActual = responseEntity.getBody();

        assertEquals(400, responseEntity.getStatusCode().value());
        assertNull(usuarioActual);
    }

    private List<Usuario> crearUsuarios(int elementos) {
        return IntStream.range(1, elementos+1)
                .mapToObj(i -> {
                    Usuario usuario = new Usuario();
                    usuario.setIdUsuario(i);
                    usuario.setNombre("Nombre" + i);
                    usuario.setEdad(15 + i);
                    return usuario;
                }).collect(Collectors.toList());
    }*/
}