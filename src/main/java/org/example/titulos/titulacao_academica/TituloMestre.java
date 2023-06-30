package org.example.titulos.titulacao_academica;

public class TituloMestre implements TitulacaoAcademica {
    @Override
    public Integer getPontuacao() {
        return 18;
    }

    @Override
    public String toString() {
        return "Cargo: Mestre";
    }
}
