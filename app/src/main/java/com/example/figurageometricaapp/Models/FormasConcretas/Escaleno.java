package com.example.figurageometricaapp.Models.FormasConcretas;

import com.example.figurageometricaapp.Interfaces.IForma;
import com.example.figurageometricaapp.Models.FormasAbs.Triangulo;
import com.example.figurageometricaapp.R;

import java.io.Serializable;

public class Escaleno extends Triangulo implements IForma, Serializable {
    public Escaleno(float[] lados) {
        super(lados);
    }

    final private float semiPer = this.calcularPerimetro() / 2;

    @Override
    public String nomeDaForma() {
        return "Triângulo Escaleno";
    }

    @Override
    public int imgDaForma() { return R.mipmap.triangulo_escaleno; }

    @Override
    public void calcularAltura() {
        // Não há necessidade de calcular a altura do triângulo escaleno
    }

    @Override
    public float calcularArea() {
        // Fórmula de Heron
        // Disponível em: https://mundoeducacao.uol.com.br/matematica/formula-heron.ht
        return (float) Math.sqrt(semiPer * (semiPer - this.lados[0]) * (semiPer - this.lados[1]) * (semiPer - this.lados[2]));
    }
}
