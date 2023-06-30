package org.example;

import org.example.factory.ExperienciaDeEnsinoFactory;
import org.example.factory.ExperienciaDeGestaoFactory;
import org.example.factory.TitulacaoAcademicaFactory;
import org.example.titulos.experiencia_de_ensino.ExperienciaDeEnsino;
import org.example.titulos.experiencia_de_gestao.ExperienciaDeGestao;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Candidato> candidatos = new ArrayList<>();

        Candidato candidatoA = new Candidato();
        candidatoA.setNome("A");
        candidatoA.setRG("123");
        candidatoA.addTitulo(TitulacaoAcademicaFactory.getTitulacaoAcademica("ESPECIALISTA"));

        Candidato candidatoB = new Candidato();
        candidatoB.setNome("B");
        candidatoB.setRG("456");
        candidatoB.addTitulo(TitulacaoAcademicaFactory.getTitulacaoAcademica("DOUTOR"));
        candidatoB.addTitulo(ExperienciaDeEnsinoFactory.getExperienciaDeEnsino("IF", 10));

        Candidato candidatoC = new Candidato();
        candidatoC.setNome("C");
        candidatoC.setRG("789");
        candidatoC.addTitulo(TitulacaoAcademicaFactory.getTitulacaoAcademica("MESTRE"));
        candidatoC.addTitulo(ExperienciaDeGestaoFactory.getExperienciaDeGestao("DIRETOR", 4));

        candidatos.add(candidatoA);
        candidatos.add(candidatoB);
        candidatos.add(candidatoC);

        System.out.println("CANDIDATOS CADASTRADOS: ");

        candidatos.forEach(System.out::println);
        System.out.println("============================================================================================" +
                "================================================");

        candidatoA.setPontuacaoProvaDesempenho(80);
        candidatoB.setPontuacaoProvaDesempenho(60);
        candidatoC.setPontuacaoProvaDesempenho(90);

        System.out.println("RESULTADO DO PROCESSO SELETIVO: ");

        Comparator<Candidato> candidatoComparator = Comparator.comparing(Candidato::getPontuacaoTotal).reversed();
        candidatos.sort(candidatoComparator);

        candidatos.forEach(candidato -> {
            System.out.println(RegistroDePontuacao.getRegistroPontuacaoDiscriminada(candidato));
            System.out.println("============================================================================================" +
                    "================================================");
        });
    }
}