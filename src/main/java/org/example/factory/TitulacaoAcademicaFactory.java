package org.example.factory;

import org.example.titulos.Titulacao;
import org.example.titulos.titulacao_academica.TitulacaoAcademica;
import org.example.titulos.titulacao_academica.TituloDoutor;
import org.example.titulos.titulacao_academica.TituloEspecialista;
import org.example.titulos.titulacao_academica.TituloMestre;

import java.util.Objects;

public class TitulacaoAcademicaFactory {

    public static TitulacaoAcademica getTitulacaoAcademica(String titulacaoDesejada) {
        titulacaoDesejada = titulacaoDesejada.toUpperCase();

        if(Objects.equals("DOUTOR", titulacaoDesejada)) {
            return new TituloDoutor();
        } else if(Objects.equals("MESTRE", titulacaoDesejada)) {
            return new TituloMestre();
        } else {
            return new TituloEspecialista();
        }
    }
}
