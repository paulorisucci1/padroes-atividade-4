package org.example.titulos.experiencia_de_gestao;

public class Coordenacao extends ExperienciaDeGestao {

    public Coordenacao(Integer semestres) {
        super(semestres);
        this.pontuacaoMaxima = 10;
    }

    @Override
    public String toString() {
        return "Cargo: Direção, Períodos de Gestão: "+semestres;
    }
}
