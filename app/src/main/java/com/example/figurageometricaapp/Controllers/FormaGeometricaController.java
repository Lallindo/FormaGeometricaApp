package com.example.figurageometricaapp.Controllers;

import android.util.Log;

import com.example.figurageometricaapp.Models.FormasConcretas.*;

import java.io.Serializable;
import java.util.Arrays;

import com.example.figurageometricaapp.Interfaces.IForma;

public class FormaGeometricaController {

    public IForma instanciarFormaGeometrica(float[] lados) {
        /*
         1 lado -> Caso levássemos em conta as figuras de lados iguais, esse valor seria ambiguo, podendo ser tanto um quadrado quanto
         um triângulo equilátero. Por isso, foi criado uma classe Círculo, para haver um tipo de forma geométrica que possa existir apenas
         com 1 input

         2 lados -> Pode produzir um quadrado ou um retângulo. Poderíamos pensar que, com apenas dois lados, seria possível instânciar um
         triângulo isósceles, porém, isso produziria, novamente, ambiguidade. Por exemplo: tendo como inputs {4, 5}, poderiamos criar os
         triângulos 4/4/5 e 4/5/5. Portanto, não é possível definir de modo absoluto a forma criada.

         3 lados -> Produz um dos triângulos. Dependendo da relação entre os lados, vai decidir qual tipo de triângulo será instânciado
        */

        Log.d("valor", "Valor: " + Arrays.toString(lados));

        Arrays.sort(lados); // Organiza os lados de menor para maior

        // É um círculo
        if (lados.length == 1) { // Caso apenas um lado for enviado, instancia um Círculo
            return new Circulo(lados);
        }

        // É um paralelogramo
        else if (lados.length == 2 && lados[0] == lados[1]) { // Caso tenha 2 lados e eles sejam iguais, instancia um Quadrado
            return new Quadrado(lados);
        } else if (lados.length == 2 && lados[0] != lados[1]) { // Caso tenha 2 lados e eles sejam diferentes, instancia um Retângulo
            return new Retangulo(lados);
        }

        // É um triângulo
        else if (lados.length == 3 && lados[0] == lados[1] && lados[0] == lados[2]) { // Caso tenha 3 lados e eles sejam iguais, instancia um Equilátero
            return new Equilatero(lados);
        } else if (lados.length == 3 &&
                (
                        (lados[0] == lados[1] && lados[0] != lados[2]) ||
                        (lados[0] != lados[1] && lados[1] == lados[2])
                )) { // Caso tenha 3 lados e dois deles sejam iguais, instancia um Isósceles
            return new Isosceles(lados);
        } else if (lados.length == 3 && lados[0] != lados[1] && lados[1] != lados[2]) { // Caso tenha 3 lados e eles sejam diferentes, instancia um Escaleno
            return new Escaleno(lados);
        }

        // Não é nenhuma forma definida
        else {
            throw new RuntimeException("Não foi possível formar nenhuma forma geométrica!");
        }
    }
}
