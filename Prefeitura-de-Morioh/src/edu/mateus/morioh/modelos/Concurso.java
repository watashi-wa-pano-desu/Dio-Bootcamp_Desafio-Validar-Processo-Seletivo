package edu.mateus.morioh.modelos;

public class Concurso {
    private String areaDoConcurso;
    private double salarioBase;

    // Construtor ------------------------------------------------------------------------------------------------------
    public Concurso(String areaDoConcurso, double salarioBase) {
        this.areaDoConcurso = areaDoConcurso;
        this.salarioBase = salarioBase;
    }

    // Getters ---------------------------------------------------------------------------------------------------------
    public double getSalarioBase() {
        return salarioBase;
    }
}
