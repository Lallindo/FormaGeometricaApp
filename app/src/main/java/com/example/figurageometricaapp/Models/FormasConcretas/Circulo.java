package com.example.figurageometricaapp.Models.FormasConcretas;

import com.example.figurageometricaapp.Interfaces.IForma;
import com.example.figurageometricaapp.Models.FormaGeometrica;
import com.example.figurageometricaapp.R;

import java.io.Serializable;

public class Circulo extends FormaGeometrica implements IForma, Serializable {
    public Circulo(float[] lados) {
        super(lados);
    }

    @Override
    public String nomeDaForma() {
        return "Círculo";
    }

    @Override
    public int imgDaForma() { return R.mipmap.circulo; }

    @Override
    public float calcularArea() {
        return (float) (Math.PI * Math.pow(this.lados[0], 2));
    }

    @Override
    public float calcularPerimetro() {
        return (float) (2 * Math.PI * this.lados[0]);
    }
}
