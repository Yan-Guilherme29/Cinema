package org.cinema.model;

import java.time.LocalDateTime;

public class Sessao {
    private Filme filme;
    private Sala sala;
    private LocalDateTime horario;
    private boolean encerrada;

    public Sessao() {
        this.filme = null;
        this.sala = null;
        this.horario = null;
        this.encerrada = false;
    }

    public Sessao(Filme filme, Sala sala, LocalDateTime horario, boolean encerrada) {
        this.filme = filme;
        this.sala = sala;
        this.horario = horario;
        this.encerrada = encerrada;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public boolean isEncerrada() {
        return encerrada;
    }

    public void setEncerrada(boolean encerrada) {
        this.encerrada = encerrada;
    }
}
