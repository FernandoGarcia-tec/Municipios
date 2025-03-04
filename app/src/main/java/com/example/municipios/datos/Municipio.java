package com.example.municipios.datos;

public class Municipio {
    //atributos ce la clase
    private String nombre;
    private String extension;
    private String poblacion;
    private String escudo;
    private String url;

    //lista de constructores, metodos get , metodos set


    public Municipio() {
    }

    public Municipio(String nombre, String extension, String poblacion, String escudo, String url) {
        this.nombre = nombre;
        this.extension = extension;
        this.poblacion = poblacion;
        this.escudo = escudo;
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
