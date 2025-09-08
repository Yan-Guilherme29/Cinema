package org.cinema.model;

import java.time.LocalDateTime;

public class Ingresso {
    private Sessao sessao;
    private Cliente cliente;
    private boolean meia; // true = meia, false = inteira
    private Funcionario vendedor;
    private LocalDateTime dataCompra;

    public Ingresso() {
        this.sessao = null;
        this.cliente = null;
        this.meia = false;
        this.vendedor = null;
        this.dataCompra = null;
    }

    public Ingresso(Sessao sessao, Cliente cliente, boolean meia, Funcionario vendedor, LocalDateTime dataCompra) {
        this.sessao = sessao;
        this.cliente = cliente;
        this.meia = meia;
        this.vendedor = vendedor;
        this.dataCompra = dataCompra;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isMeia() {
        return meia;
    }

    public void setMeia(boolean meia) {
        this.meia = meia;
    }

    public Funcionario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }

    public LocalDateTime getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDateTime dataCompra) {
        this.dataCompra = dataCompra;
    }
}
