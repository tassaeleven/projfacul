package com.example.projetoa3;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {ValidacaoCad.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract ValidacaoCadDao validacaoCadDao();

}
