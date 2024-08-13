package edu.mateus.morioh.modelos;

public class Candidato {
    private String nome;
    private double salarioPretendido;

    // Construtor ------------------------------------------------------------------------------------------------------
    public Candidato(String nome, double salarioPretendido) {
        this.nome = nome;
        this.salarioPretendido = salarioPretendido;
    }

    // Getters ---------------------------------------------------------------------------------------------------------
    public double getSalarioPretendido() {
        return salarioPretendido;
    }

    public String getNome() {
        return nome;
    }
}
