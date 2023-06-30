package org.example.factory;

import org.example.titulos.experiencia_de_ensino.EnsinoMedio;
import org.example.titulos.experiencia_de_ensino.EnsinoSuperior;
import org.example.titulos.experiencia_de_ensino.ExperienciaDeEnsino;
import org.example.titulos.experiencia_de_ensino.InstitutoFederal;

import java.util.Objects;

public class ExperienciaDeEnsinoFactory {
    public static ExperienciaDeEnsino getExperienciaDeEnsino(String experiencaDesejada, Integer periodosDeMagisterio) {
        experiencaDesejada = experiencaDesejada.toUpperCase();

        if(Objects.equals("IF", experiencaDesejada)) {
            return new InstitutoFederal(periodosDeMagisterio);
        } else if(Objects.equals("SUPERIOR", experiencaDesejada)) {
            return new EnsinoSuperior(periodosDeMagisterio);
        } else {
            return new EnsinoMedio(periodosDeMagisterio);
        }
    }
}
