package org.example.titulos.experiencia_de_ensino;

public class EnsinoSuperior extends ExperienciaDeEnsino {

    public EnsinoSuperior(Integer semestres) {
        super(semestres);
        this.pontuacaoMaxima = 7;
    }

    @Override
    public String toString() {
        return "Instituição: Ensino superior, Semestres lecionados: "+semestres;
    }
}
