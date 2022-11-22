package com.example.projetoa3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaCantoFrio extends AppCompatActivity {

    private Button bt_voltarMain3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_canto_frio);

        bt_voltarMain3.findViewById(R.id.bt_voltarMain3);
        bt_voltarMain3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaCantoFrio.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}