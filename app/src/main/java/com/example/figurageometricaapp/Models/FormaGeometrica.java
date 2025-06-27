package com.example.figurageometricaapp.Models;

public abstract class FormaGeometrica {

    /*
     Classe mais abstrada criada. Representa uma forma geométrica bidimensional que possua até 4 lados.
     Define a assinatura de dois métodos e define a condição de existência de uma forma geométrica processável
     (ter entre 1 e 3 lados recebidos no construtor).
    */

    protected abstract float calcularArea();
    protected abstract float calcularPerimetro();

    protected float[] lados; // Forma pode ter, no máximo, trés lados

    protected FormaGeometrica(float[] lados) {
        if (lados.length > 3) {
            throw new RuntimeException("Forma tem mais de 3 lados");
        } else if (lados.length < 1) {
            throw new RuntimeException("Forma não possui nenhum lado");
        } else {
            this.lados = lados;
        }
    }
}
