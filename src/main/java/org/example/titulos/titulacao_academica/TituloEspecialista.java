package org.example.titulos.titulacao_academica;

public class TituloEspecialista implements TitulacaoAcademica {
    @Override
    public Integer getPontuacao() {
        return 10;
    }

    @Override
    public String toString() {
        return "Cargo: Especialista";
    }
}
