package com.example.projetoa3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Casquinha extends AppCompatActivity {

    private Button bt_voltarMain4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casquinha);

        bt_voltarMain4.findViewById(R.id.bt_voltarMain4);
        bt_voltarMain4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Casquinha.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }
}