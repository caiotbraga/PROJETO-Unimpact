package com.Unimpact.Unimpact.Security;

import com.Unimpact.Unimpact.model.TipoUsuario;
import com.Unimpact.Unimpact.model.Usuario;
import com.Unimpact.Unimpact.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthorizationService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public boolean isAuthorized(String email, TipoUsuario requiredRole) {
        Usuario usuario = usuarioRepository.findByEmail(email);
        return usuario != null && usuario.getTipoUsuario() == requiredRole;
    }

    public boolean isAuthorized(String email, TipoUsuario[] requiredRoles) {
        Usuario usuario = usuarioRepository.findByEmail(email);
        if (usuario == null)
            return false;

        for (TipoUsuario role : requiredRoles) {
            if (usuario.getTipoUsuario() == role) {
                return true;
            }
        }
        return false;
    }
}
