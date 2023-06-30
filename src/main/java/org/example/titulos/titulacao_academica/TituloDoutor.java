package org.example.titulos.titulacao_academica;

public class TituloDoutor implements TitulacaoAcademica {
    @Override
    public Integer getPontuacao() {
        return 25;
    }

    @Override
    public String toString() {
        return "Cargo: Doutor";
    }
}
