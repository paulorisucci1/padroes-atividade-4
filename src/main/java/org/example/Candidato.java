package org.example;

import org.example.titulos.Titulacao;

import java.util.HashSet;
import java.util.Set;

public class Candidato {

    private String nome;

    private String RG;

    private Integer pontuacaoProvaDesempenho;

    private Set<Titulacao> titulos;

    public Candidato() {
        this.titulos = new HashSet<>();
    }

    public Candidato(String nome, String RG, Set<Titulacao> titulos) {
        this.nome = nome;
        this.RG = RG;
        this.titulos = titulos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public Integer getPontuacaoProvaDesempenho() {
        return pontuacaoProvaDesempenho;
    }

    public void setPontuacaoProvaDesempenho(Integer pontuacaoProvaDesempenho) {
        this.pontuacaoProvaDesempenho = pontuacaoProvaDesempenho;
    }

    public Set<Titulacao> getTitulos() {
        return new HashSet<>(titulos);
    }

    public void addTitulo(Titulacao titulacao) {
        this.titulos.add(titulacao);
    }

    public void removeTitulo(Titulacao titulacao) {
        this.titulos.remove(titulacao);
    }

    public Integer getPontuacaoTotal() {
        return pontuacaoProvaDesempenho + getPontuacaoTitulos();
    }

    public Integer getPontuacaoTitulos() {
        Integer pontuacaoTotal = 0;
        for(Titulacao titulacao: this.titulos) {
            pontuacaoTotal += titulacao.getPontuacao();
        }
        return pontuacaoTotal;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "nome='" + nome + '\'' +
                ", RG='" + RG + '\'' +
                ", pontuacaoProvaDesempenho=" + pontuacaoProvaDesempenho +
                ", titulos=" + titulos +
                '}';
    }
}
