package br.ufac.webacademy.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.websocket.server.ServerEndpointConfig;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Teacher implements Serializable{
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true, updatable = false)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String email;

    @Column(columnDefinition = "CHAR(11)", nullable = false, unique = true)
    private String cpf;
    
}
