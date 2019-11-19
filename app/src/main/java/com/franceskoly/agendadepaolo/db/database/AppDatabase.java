package com.franceskoly.agendadepaolo.db.database;

import android.content.Context;

import com.franceskoly.agendadepaolo.constantes.Constantes;
import com.franceskoly.agendadepaolo.db.dao.PersonaDAO;
import com.franceskoly.agendadepaolo.db.entity.Persona;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Persona.class}, version = 1,exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase INSTANCE; //sirve para acceder a la bd
    public abstract PersonaDAO personaDAO();

    public static AppDatabase getAppDatabase(Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),AppDatabase.class, Constantes.NAME_DATABASE).build();

        }
        return INSTANCE;
    }

    public static void destroyInstance(){
        INSTANCE = null;
    }
}
