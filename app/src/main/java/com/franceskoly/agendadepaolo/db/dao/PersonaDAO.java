package com.franceskoly.agendadepaolo.db.dao;

import com.franceskoly.agendadepaolo.db.entity.Persona;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

//me define todos los metodos que van a acceder a la bd
@Dao
public interface PersonaDAO {

    @Insert
    void insertarPersona(Persona persona);

    @Query("SELECT * FROM persona")
    List<Persona> findAllPersona();

    @Query("SELECT * FROM persona where nombres like :id")
    Persona findPersonaById(String id);

    @Query("SELECT * FROM persona where nombres like :nombres")
    Persona findPersonaByNombres(String nombres);

    @Query("SELECT * FROM persona where apellidos like :apellidos")
    Persona findPersonaByApellidos(String apellidos);

    @Query("SELECT * FROM persona where apellidos like :dni")
    Persona findPersonaByDNI(String dni);

    @Update
    void UpdatePersonaById(Persona persona);

    @Query("DELETE FROM persona")
    void deleteAllPersona();// borra toda la tabla

    @Delete
    void deletePersonaById(Persona persona); // borra por id una persona

}
