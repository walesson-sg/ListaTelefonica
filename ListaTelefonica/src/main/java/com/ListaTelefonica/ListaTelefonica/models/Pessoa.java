package com.ListaTelefonica.ListaTelefonica.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Pessoa {
    @Id
    @SequenceGenerator(name = "sequence_pessoa", sequenceName = "ID_Sequence")
    @GeneratedValue(generator = "sequence_pessoa", strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String numeroTelefone;
    private String email;

    public Pessoa() {
    }

    public Pessoa(Long id, String nome, String numeroTelefone, String email) {
        this.id = id;
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
