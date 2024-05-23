package com.idnp2024a.listener;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String nombres;
    private String apellidos;
    private String correo;
    private String telefono;
    private String contrasena;

    public Usuario(String nombres, String apellidos, String correo, String telefono, String contrasena) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.contrasena = contrasena;
    }

    public String getNombres() { return nombres; }
    public String getApellidos() { return apellidos; }
    public String getCorreo() { return correo; }
    public String getTelefono() { return telefono; }
    public String getContrasena() { return contrasena; }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", contrasena='" + contrasena + '\'' +
                '}';
    }
}
