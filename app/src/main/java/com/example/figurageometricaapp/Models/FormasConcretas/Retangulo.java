package com.example.figurageometricaapp.Models.FormasConcretas;

import com.example.figurageometricaapp.Interfaces.IForma;
import com.example.figurageometricaapp.Models.FormasAbs.Paralelogramo;
import com.example.figurageometricaapp.R;

import java.io.Serializable;

public class Retangulo extends Paralelogramo implements IForma, Serializable {
    public Retangulo(float[] lados) {
        super(lados);
    }

    @Override
    public String nomeDaForma() {
        return "Retângulo";
    }

    @Override
    public int imgDaForma() { return R.mipmap.retangulo; }

    @Override
    public float calcularArea() {
        return this.lados[0] * this.lados[1];
    }
}
