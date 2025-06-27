package com.example.figurageometricaapp.Models.FormasAbs;

import com.example.figurageometricaapp.Models.FormaGeometrica;

public abstract class Paralelogramo extends FormaGeometrica {

    // Abstração de um paralelogramo, estrutura base para o quadrado e o retangulo

    public Paralelogramo(float[] lados) {
        super(lados);
    }

    @Override
    public float calcularPerimetro() {
        float perimetro = 0;
        for (float i : this.lados) {
            perimetro += i;
        }
        return perimetro * 2;
    }
}
