package com.example.figurageometricaapp.Interfaces;

public interface IForma {
    // Define uma interface para fazer o contrato na instanciação do metodo
    // "instanciarFormaGeometrica" no FormaGeometricaController em Main

    String nomeDaForma();
    int imgDaForma();
    float calcularPerimetro();
    float calcularArea();
}
