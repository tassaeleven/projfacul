package com.example.projetoa3;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class ValidacaoCad{

    @PrimaryKey
    public int id;

    @ColumnInfo(name = "Nome")
    public String nome;

    @ColumnInfo(name = "Email")
    public String email;

    @ColumnInfo(name = "Senha")
    public String senha;


}
