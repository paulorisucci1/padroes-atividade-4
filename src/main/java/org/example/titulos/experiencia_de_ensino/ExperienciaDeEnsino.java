package org.example.titulos.experiencia_de_ensino;

import org.example.titulos.Titulacao;

public abstract class ExperienciaDeEnsino implements Titulacao {
    protected Integer semestres;

    protected Integer pontosPorSemestre;

    protected Integer pontuacaoMaxima;

    public ExperienciaDeEnsino(Integer semestres) {
        this.semestres = semestres;
        this.pontosPorSemestre = 1;
    }

    @Override
    public Integer getPontuacao() {
        return Math.min(semestres * pontosPorSemestre, pontuacaoMaxima);
    }
}
