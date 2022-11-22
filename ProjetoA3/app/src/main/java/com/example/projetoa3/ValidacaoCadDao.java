package com.example.projetoa3;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ValidacaoCadDao {
    @Query("select * from ValidacaoCad")
    List<ValidacaoCad> getAll();

    @Query("SELECT * FROM validacaocad WHERE email LIKE :email AND " +
            "senha LIKE :senha LIMIT 1")
    ValidacaoCad findByName(String email, String senha);

    @Insert
    void insertAll(ValidacaoCad ... validacaoCad);
}
