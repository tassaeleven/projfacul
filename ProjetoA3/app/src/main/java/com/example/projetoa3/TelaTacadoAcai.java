package com.example.projetoa3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaTacadoAcai extends AppCompatActivity {

    private Button bt_voltarMain2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_tacado_acai);

        bt_voltarMain2.findViewById(R.id.bt_voltarMain2);
        bt_voltarMain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaTacadoAcai.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}