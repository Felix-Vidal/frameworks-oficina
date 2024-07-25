package br.ufac.login.controller.dto;

import br.ufac.login.models.Usuario;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class UsuarioRespostaDto {
    
    private Long id;
    private String nome;
    private String email;
    private boolean admin;

    public static UsuarioRespostaDto transformaEmDto(Usuario usuario){
        return new UsuarioRespostaDto(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.isAdmin());
    }
}
