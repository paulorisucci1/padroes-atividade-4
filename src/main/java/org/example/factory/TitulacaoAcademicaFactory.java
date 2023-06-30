package org.example.factory;

import org.example.titulos.titulacao_academica.TituloAcademico;
import org.example.titulos.titulacao_academica.Doutor;
import org.example.titulos.titulacao_academica.Especialista;
import org.example.titulos.titulacao_academica.Mestre;

import java.util.Objects;

public class TitulacaoAcademicaFactory {

    public static TituloAcademico getTitulacaoAcademica(String titulacaoDesejada) {
        titulacaoDesejada = titulacaoDesejada.toUpperCase();

        if(Objects.equals("DOUTOR", titulacaoDesejada)) {
            return new Doutor();
        } else if(Objects.equals("MESTRE", titulacaoDesejada)) {
            return new Mestre();
        } else {
            return new Especialista();
        }
    }
}
