package org.example.titulos.experiencia_de_gestao;

import org.example.titulos.Titulacao;

public class Direcao extends ExperienciaDeGestao {

    public Direcao(Integer semestres) {
        super(semestres);
        this.pontuacaoMaxima = 15;
    }

    @Override
    public String toString() {
        return "Cargo: Direção, Períodos de Gestão: "+semestres;
    }
}
