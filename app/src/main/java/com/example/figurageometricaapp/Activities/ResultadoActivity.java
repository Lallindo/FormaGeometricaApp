package com.example.figurageometricaapp.Activities;

import android.os.Bundle;
import android.renderscript.Allocation;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.figurageometricaapp.R;

public class ResultadoActivity extends AppCompatActivity {

    private TextView tipoText;
    private TextView perimetroText;
    private TextView areaText;
    private ImageView imgForma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        tipoText = findViewById(R.id.tipoText);
        perimetroText = findViewById(R.id.perimetroText);
        areaText = findViewById(R.id.areaText);
        imgForma = findViewById(R.id.imgForma);

        // Processa o resultado
        tipoText.append(
                "Tipo: " + getIntent().getStringExtra("nome_forma")
        );
        perimetroText.append(
                "Perímetro: " + getIntent().getFloatExtra("perimetro_forma", 0) + " m"
        );
        areaText.append(
                "Área: " + getIntent().getFloatExtra("area_forma", 0) + " m²"
        );
        imgForma.setImageResource(getIntent().getIntExtra("img_forma", 0));
    }
    
    public void onVoltarClick(View view) {
        finish();
    }
}
