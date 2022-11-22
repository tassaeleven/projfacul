package com.example.projetoa3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Milktops extends AppCompatActivity {

    private Button bt_voltarMain5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milktops);

        bt_voltarMain5.findViewById(R.id.bt_voltarMain5);
        bt_voltarMain5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Milktops.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}