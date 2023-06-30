package org.example.titulos.titulacao_academica;

public class Especialista implements TituloAcademico {
    @Override
    public Integer getPontuacao() {
        return 10;
    }

    @Override
    public String toString() {
        return "Cargo: Especialista";
    }
}
