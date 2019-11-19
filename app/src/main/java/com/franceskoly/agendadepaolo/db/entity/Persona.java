package com.franceskoly.agendadepaolo.db.entity;

import com.franceskoly.agendadepaolo.constantes.Constantes;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = Constantes.NAME_TABLE_PERSONA)
public class Persona {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "nombres")
    private String noombres;

    @ColumnInfo(name = "apellidos")
    private String apellidos;

    @ColumnInfo(name = "dni")
    private int dni;

    @ColumnInfo(name = "telefono")
    private String telefono;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoombres() {
        return noombres;
    }

    public void setNoombres(String noombres) {
        this.noombres = noombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
