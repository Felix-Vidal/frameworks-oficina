package br.ufac.login.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Usuario implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true, updatable = false)
    private Long id;

    @Column(nullable = false)
    private String nome;

    private String email;

    @Column(nullable = false)
    private String senha;

    private boolean admin = false;

   public Usuario (String nome, String email, String senha){
    this.nome = nome;
    this.email = email;
    this.senha = senha;

   }
}
