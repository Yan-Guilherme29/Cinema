package org.cinema.model;

public class Sala {
    private String numero;
    private int capacidade;

    public Sala() {
        this.numero = "";
        this.capacidade = 0;
    }

    public Sala(String numero, int capacidade) {
        this.numero = numero;
        this.capacidade = capacidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
