package com.desafio.repository.entity;

import jakarta.persistence.*;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    /// Funcionalidade Faltando, ALterar e Redirecionar a Imagem
    /// Solução : Vai salvar como String o caminho da imagem e quando for POST a imagem vai dar um DELETE na antiga
    private String nome;
    private int idade;
    private String endereco;
    private String biografia;

    @Lob
    private byte[] imagem;

    public long getId() {
        return id;
    }
    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
}
