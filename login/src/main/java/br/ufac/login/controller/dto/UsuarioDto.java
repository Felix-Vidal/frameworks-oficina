package br.ufac.login.controller.dto;

import br.ufac.login.models.Usuario;
import lombok.Getter;

@Getter
public class UsuarioDto {
    private Long id;
    private String nome;
    private String email;
    private String senha;
    
    public Usuario transformaParaObjeto(){
        return new Usuario(nome, email, senha);
    }

}
