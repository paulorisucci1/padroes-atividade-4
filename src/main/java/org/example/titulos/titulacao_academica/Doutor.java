package org.example.titulos.titulacao_academica;

public class Doutor implements TituloAcademico {
    @Override
    public Integer getPontuacao() {
        return 25;
    }

    @Override
    public String toString() {
        return "Cargo: Doutor";
    }
}
