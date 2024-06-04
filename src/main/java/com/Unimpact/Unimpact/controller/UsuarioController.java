package com.Unimpact.Unimpact.controller;

import com.Unimpact.Unimpact.Security.AuthorizationService;
import com.Unimpact.Unimpact.model.TipoUsuario;
import com.Unimpact.Unimpact.model.Usuario;
import com.Unimpact.Unimpact.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private AuthorizationService authorizationService;

    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getUsuario(@PathVariable Long id) {
        String email = SecurityContextHolder.getContext().getAuthentication().getName();
        TipoUsuario requiredRole = TipoUsuario.valueOf("DIRETOR".toUpperCase());
        if (authorizationService.isAuthorized(email, requiredRole)) {
            return usuarioRepository.findById(id)
                .map(usuario -> ResponseEntity.ok(usuario))
                .orElse(ResponseEntity.notFound().build());
        }
        return ResponseEntity.status(403).build();
    }

    @PostMapping
    public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario) {
        String email = SecurityContextHolder.getContext().getAuthentication().getName();
        TipoUsuario requiredRole = TipoUsuario.valueOf("DIRETOR".toUpperCase());
        if (authorizationService.isAuthorized(email, requiredRole)) {
            Usuario savedUsuario = usuarioRepository.save(usuario);
            return ResponseEntity.ok(savedUsuario);
        }
        return ResponseEntity.status(403).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> updateUsuario(@PathVariable Long id, @RequestBody Usuario usuarioDetails) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        if (usuario.isPresent()) {
            Usuario usuarioToUpdate = usuario.get();
            usuarioToUpdate.setNome(usuarioDetails.getNome());
            usuarioToUpdate.setCpf(usuarioDetails.getCpf());
            usuarioToUpdate.setRg(usuarioDetails.getRg());
            usuarioToUpdate.setTelefone1(usuarioDetails.getTelefone1());
            usuarioToUpdate.setTelefone2(usuarioDetails.getTelefone2());
            usuarioToUpdate.setCep(usuarioDetails.getCep());
            usuarioToUpdate.setRua(usuarioDetails.getRua());
            usuarioToUpdate.setEstado(usuarioDetails.getEstado());
            usuarioToUpdate.setBairro(usuarioDetails.getBairro());
            usuarioToUpdate.setNumero(usuarioDetails.getNumero());
            usuarioToUpdate.setComplemento(usuarioDetails.getComplemento());
            usuarioToUpdate.setEmail(usuarioDetails.getEmail());
            usuarioToUpdate.setSenha(usuarioDetails.getSenha());
            usuarioToUpdate.setTipoUsuario(usuarioDetails.getTipoUsuario());
            Usuario updatedUsuario = usuarioRepository.save(usuarioToUpdate);
            return ResponseEntity.ok(updatedUsuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Long id) {
        if (usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
