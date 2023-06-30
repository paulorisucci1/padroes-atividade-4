package org.example;

import org.example.titulos.Titulacao;

public class RegistroDePontuacao {

    public static String getRegistroPontuacaoDiscriminada(Candidato candidato) {
        StringBuilder registro = new StringBuilder();

        addCabecalho(registro, candidato);
        addPontuacaoProvaDesempenho(registro, candidato);
        addPontuacaoProvaTitulos(registro, candidato);
        addPontuacaoTotal(registro, candidato);

        return registro.toString();
    }

    private static void addCabecalho(StringBuilder registro, Candidato candidato) {
        registro
                .append("Registro da participação do candidato: ")
                .append(candidato)
                .append("\n");
    }

    private static void addPontuacaoProvaDesempenho(StringBuilder registro, Candidato candidato) {
        registro
                .append("Pontuação da Prova de Desempenho: ")
                .append(candidato.getPontuacaoProvaDesempenho())
                .append("\n");
    }

    private static void addPontuacaoProvaTitulos(StringBuilder registro, Candidato candidato) {
        registro
                .append("Pontuação da Prova de Títulos: \n");

        for (Titulacao titulo : candidato.getTitulos()) {
            addTitulo(registro, titulo);
        }

        registro
                .append("Pontuação total da prova de Títulos:")
                .append(candidato.getPontuacaoTitulos())
                .append("\n");
    }

    private static void addTitulo(StringBuilder registro, Titulacao titulo) {
        registro
                .append("\tTítulo: ")
                .append(titulo)
                .append(" - ");
        registro
                .append("Pontuação: ")
                .append(titulo.getPontuacao())
                .append("\n");
    }

    private static void addPontuacaoTotal(StringBuilder registro, Candidato candidato) {
        registro
                .append("Pontuação total do candidato: ")
                .append(candidato.getPontuacaoTotal());
    }
}
