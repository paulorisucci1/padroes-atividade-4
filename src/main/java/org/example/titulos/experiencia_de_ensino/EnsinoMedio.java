package org.example.titulos.experiencia_de_ensino;

public class EnsinoMedio extends ExperienciaDeEnsino {

    public EnsinoMedio(Integer semestres) {
        super(semestres);
        this.pontuacaoMaxima = 6;
    }

    @Override
    public String toString() {
        return "Instituição: Ensino médio, Semestres lecionados: "+semestres;
    }
}
