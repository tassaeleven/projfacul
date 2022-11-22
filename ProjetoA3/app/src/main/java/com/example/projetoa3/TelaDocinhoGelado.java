package com.example.projetoa3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaDocinhoGelado extends AppCompatActivity {

    private Button bt_voltarMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_docinho_gelado);

        bt_voltarMain = findViewById(R.id.bt_voltarMain);
        bt_voltarMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TelaDocinhoGelado.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }
}