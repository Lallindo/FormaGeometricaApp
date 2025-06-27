package com.example.figurageometricaapp.Models.FormasConcretas;

import com.example.figurageometricaapp.Interfaces.IForma;
import com.example.figurageometricaapp.Models.FormasAbs.Paralelogramo;
import com.example.figurageometricaapp.R;

import java.io.Serializable;

public class Quadrado extends Paralelogramo implements IForma, Serializable {
    public Quadrado(float[] lados) {
        super(lados);
    }

    @Override
    public String nomeDaForma() {
        return "Quadrado";
    }

    @Override
    public int imgDaForma() { return R.mipmap.quadrado; }

    @Override
    public float calcularArea() {
        return (float) Math.pow(this.lados[0], 2);
    }
}
