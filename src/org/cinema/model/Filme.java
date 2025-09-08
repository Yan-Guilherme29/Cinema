package org.cinema.model;

public class Filme {
    private String titulo;
    private int duracaoMinutos;

    public Filme() {
        this.titulo = "";
        this.duracaoMinutos = 0;
    }

    public Filme(String titulo, int duracaoMinutos) {
        this.titulo = titulo;
        this.duracaoMinutos = duracaoMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
}
