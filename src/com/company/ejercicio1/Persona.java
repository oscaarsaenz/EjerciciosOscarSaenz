package com.company.ejercicio1;

public class Persona {
    private String nombre;
    private String poblacion;
    private Integer edad;

    //constructor con todos los datos
    public Persona(String nombre, String poblacion, Integer edad) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.edad = edad;
    }
    //constructor vacio
    public Persona() {
        nombre="";
        poblacion="";
        edad=0;
    }

    //getter
    public String getNombre() {
        return nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public Integer getEdad() {
        return edad;
    }

    //setter
    public void setNombre(String nombre) {
        if(nombre == null || nombre.equals(" ")){
            this.nombre = "Desconocido";
        }else{
            this.nombre = nombre;
        }
    }

    public void setPoblacion(String poblacion) {
        if(poblacion==null || poblacion.equals(" ")){
            this.poblacion = "Desconocida";
        }else{
            this.poblacion = poblacion;
        }
    }

    public void setEdad(Integer edad) {
        this.edad=edad;
    }

    //toString

    @Override
    public String toString() {
        return "Nombre: " + nombre + ". Poblacion: " + poblacion +  ". Edad: " + edad;
    }
}
