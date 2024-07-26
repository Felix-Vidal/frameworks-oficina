package br.ufac.login.controller.dto;

import br.ufac.login.models.Usuario;

public record UsuarioRespostaDto(
    Long id,
    String nome,
    String email,
    boolean admin
) {

    public static UsuarioRespostaDto toDto(Usuario usuario){
        UsuarioRespostaDto dto = new UsuarioRespostaDto(
            usuario.getId(), 
            usuario.getNome(),
            usuario.getEmail(), 
            usuario.isAdmin());
        
        return dto;
    }

}
