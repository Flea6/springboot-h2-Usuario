package com.testeUsuario.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Cliente {
    @Id
    @Column
    private int id;
    @Column
    private String nome;
    @Column
    private int idade;
    @Column
    private String email;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setName(String nome) {
        this.nome = nome;
    }
    public int getidade() {
        return idade;
    }
    public void setidade(int idade) {
        this.idade = idade;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

