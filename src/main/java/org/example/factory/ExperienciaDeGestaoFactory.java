package org.example.factory;

import org.example.titulos.experiencia_de_gestao.Coordenacao;
import org.example.titulos.experiencia_de_gestao.Direcao;
import org.example.titulos.experiencia_de_gestao.ExperienciaDeGestao;

import java.util.Objects;

public class ExperienciaDeGestaoFactory {

    public static ExperienciaDeGestao getExperienciaDeGestao(String experiencaDesejada, Integer periodosDeGestao) {
        experiencaDesejada = experiencaDesejada.toUpperCase();

        if(Objects.equals("DIRECAO", experiencaDesejada)) {
            return new Direcao(periodosDeGestao);
        } else {
            return new Coordenacao(periodosDeGestao);
        }
    }
}
