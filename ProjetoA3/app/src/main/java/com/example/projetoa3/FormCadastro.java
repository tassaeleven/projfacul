package com.example.projetoa3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;


public class FormCadastro extends AppCompatActivity {

    private Button cadastrarBTN;
    private TextView textConfirm;
    private EditText edit_nome;
    private EditText edit_email;
    private EditText edit_senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);

        getSupportActionBar().hide();
        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "validacaocad").build();

        cadastrarBTN = findViewById(R.id.cadastrarBTN);
        edit_nome = findViewById(R.id.edit_nome);
        edit_email = findViewById(R.id.edit_email);
        edit_senha = findViewById(R.id.edit_senha);
        textConfirm = findViewById(R.id.textConfirm);

        cadastrarBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = edit_nome.getText().toString();
                String email = edit_email.getText().toString();
                String senha = edit_senha.getText().toString();

                ValidacaoCad usuario = new ValidacaoCad();
                usuario.nome = nome;
                usuario.email = email;
                usuario.senha = senha;

                Observable<ValidacaoCad> observable = Observable.just(usuario);
                Observer<ValidacaoCad> observer = new Observer<ValidacaoCad>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        db.validacaoCadDao().insertAll(usuario);
                    }

                    @Override
                    public void onNext(ValidacaoCad validacaoCad) {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e(e.toString(), "Erro");
                    }

                    @Override
                    public void onComplete() {
                        db.validacaoCadDao().insertAll(usuario);
                    }
                };

                textConfirm.setText("Cadastro realizado!");

                Intent intent = new Intent(FormCadastro.this,FormLogin.class);
                startActivity(intent);
            }
        });




    }
}