package com.example.figurageometricaapp.Models.FormasAbs;

import com.example.figurageometricaapp.Models.FormaGeometrica;

import java.util.Arrays;

public abstract class Triangulo extends FormaGeometrica {

    // Abstração de um triângulo, define a condição de existência de um triângulo

    // A "base" de um triângulo sempre é o maior lado dele. Para isso, podemos usar Arrays.sort([]) que faz que
    // o maior valor fique sempre no último ìndice, que, como o array tem tamanho definido em 3, será o ìndice 2

    public float altura = 0;

    protected abstract void calcularAltura();
    protected abstract float calcularArea();

    public Triangulo(float[] lados) {
        super(lados);
        if (!this.podeExistir()) {
            throw new RuntimeException("Triângulo não pode existir");
        }
    }

    @Override
    public float calcularPerimetro() {
        float perimetro = 0;
        for (float i : this.lados) {
            perimetro += i;
        }
        return perimetro;
    }

    private boolean podeExistir() {
        // Caso a soma dos dois lados menores for maior que o lado maior, o triângulo pode existir
        Arrays.sort(this.lados);
        return this.lados[0] + this.lados[1] > this.lados[2];
    }
}
