package org.example.titulos.experiencia_de_ensino;

import org.example.titulos.titulacao_academica.TitulacaoAcademica;

public class InstitutoFederal extends ExperienciaDeEnsino {

    public InstitutoFederal(Integer semestres) {
        super(semestres);
        this.pontuacaoMaxima = 12;
    }

    @Override
    public String toString() {
        return "Instituição: IF, Semestres lecionados: "+semestres;
    }
}
