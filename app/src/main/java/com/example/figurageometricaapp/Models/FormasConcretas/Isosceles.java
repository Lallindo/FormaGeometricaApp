package com.example.figurageometricaapp.Models.FormasConcretas;

import com.example.figurageometricaapp.Interfaces.IForma;
import com.example.figurageometricaapp.Models.FormasAbs.Triangulo;
import com.example.figurageometricaapp.R;

import java.io.Serializable;
import java.util.Arrays;

public class Isosceles extends Triangulo implements IForma, Serializable {
    public Isosceles(float[] lados) {
        super(lados);
    }

    @Override
    public String nomeDaForma() {
        return "Triângulo Isósceles";
    }

    @Override
    public int imgDaForma() { return R.mipmap.triangulo_isosceles; }

    @Override
    public void calcularAltura() {
        Arrays.sort(this.lados);
        this.altura = (float) Math.sqrt(Math.pow(this.lados[0], 2) - Math.pow((this.lados[2] / 2), 2));
    }

    @Override
    public float calcularArea() {
        Arrays.sort(this.lados);
        this.calcularAltura();
        return (this.altura * this.lados[2]) / 2;
    }
}
