package com.example.figurageometricaapp.Models.FormasConcretas;

import com.example.figurageometricaapp.Interfaces.IForma;
import com.example.figurageometricaapp.Models.FormasAbs.Triangulo;
import com.example.figurageometricaapp.R;

import java.io.Serializable;
import java.util.Arrays;

public class Equilatero extends Triangulo implements IForma, Serializable {
    public Equilatero(float[] lados) {
        super(lados);
    }

    @Override
    public String nomeDaForma() {
        return "Triângulo Equilátero";
    }

    @Override
    public int imgDaForma() { return R.mipmap.triangulo_equilatero; }

    @Override
    public void calcularAltura() {
        this.altura = this.lados[0];
    }

    @Override
    public float calcularArea() {
        Arrays.sort(this.lados);
        this.calcularAltura();
        return (this.altura * this.lados[2]) / 2;
    }
}
