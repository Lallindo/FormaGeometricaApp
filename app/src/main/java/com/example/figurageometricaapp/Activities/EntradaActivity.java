package com.example.figurageometricaapp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.figurageometricaapp.Controllers.FormaGeometricaController;
import com.example.figurageometricaapp.Interfaces.IForma;
import com.example.figurageometricaapp.R;

import java.util.ArrayList;
import java.util.List;

public class EntradaActivity extends AppCompatActivity {

    private EditText editLado1, editLado2, editLado3;
    private Button btnCalcular;
    private FormaGeometricaController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrada);

        editLado1 = findViewById(R.id.editLado1);
        editLado2 = findViewById(R.id.editLado2);
        editLado3 = findViewById(R.id.editLado3);
        btnCalcular = findViewById(R.id.btnCalcular);
        
        controller = new FormaGeometricaController();

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processarEntrada();
            }
        });
    }

    private float[] checarLados (String[] lados) {
        List<Float> ladosEmInput = new ArrayList<>();

        for (String i : lados) {
            Log.d("Valor", "checarLados: " + i);
            if (!i.isEmpty()) {
                if (Float.parseFloat(i) > 0) {
                    ladosEmInput.add(Float.parseFloat(i));
                }
            }
        }

        float[] returnArray = new float[ladosEmInput.size()];

        for (int i = 0; i < ladosEmInput.size(); i++) returnArray[i] = ladosEmInput.get(i);

        return returnArray;
    }

    private void processarEntrada() {
        String strLado1 = editLado1.getText().toString();
        String strLado2 = editLado2.getText().toString();
        String strLado3 = editLado3.getText().toString();

        // Verifica quantos lados foram informados
        float[] lados = checarLados(new String[]{strLado1, strLado2, strLado3});

        IForma forma = controller.instanciarFormaGeometrica(lados);

        Intent intent = new Intent(EntradaActivity.this, ResultadoActivity.class);
        intent.putExtra("nome_forma", forma.nomeDaForma());
        intent.putExtra("perimetro_forma", forma.calcularPerimetro());
        intent.putExtra("area_forma", forma.calcularArea());
        intent.putExtra("img_forma", forma.imgDaForma());
        startActivity(intent);
    }
}
