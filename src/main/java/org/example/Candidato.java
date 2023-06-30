package org.example;

import org.example.titulos.Titulo;

import java.util.HashSet;
import java.util.Set;

public class Candidato {

    private String nome;

    private String RG;

    private Integer pontuacaoProvaDesempenho;

    private Set<Titulo> titulos;

    public Candidato() {
        this.titulos = new HashSet<>();
    }

    public Candidato(String nome, String RG, Set<Titulo> titulos) {
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

    public Set<Titulo> getTitulos() {
        return new HashSet<>(titulos);
    }

    public void addTitulo(Titulo titulo) {
        this.titulos.add(titulo);
    }

    public void removeTitulo(Titulo titulo) {
        this.titulos.remove(titulo);
    }

    public Integer getPontuacaoTotal() {
        return pontuacaoProvaDesempenho + getPontuacaoTitulos();
    }

    public Integer getPontuacaoTitulos() {
        Integer pontuacaoTotal = 0;
        for(Titulo titulo : this.titulos) {
            pontuacaoTotal += titulo.getPontuacao();
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
