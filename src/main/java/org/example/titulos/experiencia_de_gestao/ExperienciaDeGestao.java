package org.example.titulos.experiencia_de_gestao;

import org.example.titulos.Titulo;

public abstract class ExperienciaDeGestao implements Titulo {
    protected Integer semestres;

    protected Integer pontosPorSemestre;

    protected Integer pontuacaoMaxima;

    public ExperienciaDeGestao(Integer semestres) {
        this.semestres = semestres;
        this.pontosPorSemestre = 1;
    }

    @Override
    public Integer getPontuacao() {
        return Math.min(semestres * pontosPorSemestre, pontuacaoMaxima);
    }
}
