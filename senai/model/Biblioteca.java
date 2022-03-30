package br.com.senai.model;

public class Biblioteca {
    private String nome_bibli;
    private String id_bibli;
    private Livro livros;

    public Biblioteca (String nome_bibli, String id_bibli,Livro livros) {
        this.nome_bibli = nome_bibli;
        this.id_bibli = id_bibli;
        this.livros = livros;
    }

    public String getNome_bibli() {
        return nome_bibli;
    }

    public void setNome_bibli(String nome_bibli) {
        this.nome_bibli = nome_bibli;
    }

    public Livro getLivros() {
        return livros;
    }

    public void setLivros(Livro livros) {
        this.livros = livros;
    }

    public String getId_bibli() {
        return id_bibli;
    }

    public void setId_bibli(String id_bibli) {
        this.id_bibli = id_bibli;
    }
}
