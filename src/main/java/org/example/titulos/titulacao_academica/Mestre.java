package org.example.titulos.titulacao_academica;

public class Mestre implements TituloAcademico {
    @Override
    public Integer getPontuacao() {
        return 18;
    }

    @Override
    public String toString() {
        return "Cargo: Mestre";
    }
}
