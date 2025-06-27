package com.example.figurageometricaapp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.figurageometricaapp.R;

public class ErroActivity extends AppCompatActivity {

    Button btnVoltarErro;

    TextView erroDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_erro);

        btnVoltarErro = findViewById(R.id.btnVoltarErro);
        erroDescription = findViewById(R.id.erroDescription);

        if (!getIntent().getStringExtra("erro_description").isEmpty()) {
            erroDescription.setText(getIntent().getStringExtra("erro_description"));
        }

        btnVoltarErro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inicia a EntradaActivity
                Intent intent = new Intent(ErroActivity.this, EntradaActivity.class);
                startActivity(intent);
            }
        });
    }
}