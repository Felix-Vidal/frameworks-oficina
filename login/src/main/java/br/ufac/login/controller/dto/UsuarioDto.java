package br.ufac.login.controller.dto;

import br.ufac.login.models.Usuario;

public record UsuarioDto(
    Long id,
    String nome,
    String email,
    String senha
) {
    public static UsuarioDto toDto(Usuario usuario){
        UsuarioDto dto = new UsuarioDto(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getSenha());
        return dto;
    }

    public static Usuario toEntity(UsuarioDto dto){
        Usuario usuario = new Usuario();
        usuario.setId(dto.id);
        usuario.setNome(dto.nome);
        usuario.setEmail(dto.email);
        usuario.setSenha(dto.senha);
        return usuario;
    }


}
