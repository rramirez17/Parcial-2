package com.example.parcial_n2_grupo4;

public class Culebra {

    private String titulo, descripcion;
    private int miniatura;
    public Culebra(){

    }

    public Culebra(String titulo, String descripcion, int miniatura){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.miniatura = miniatura;
    }

    public String getTitulo() { return titulo; }
    public String getDescripcion() { return descripcion; }
    public int getMiniatura() { return miniatura; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setDescripcion(String descripcion) { this.titulo = descripcion; }
    public void setMiniatura(int miniatura) { this.miniatura = miniatura; }


}
