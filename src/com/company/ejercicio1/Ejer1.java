package com.company.ejercicio1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Ejer1 {
    public static void main(String[] args) {
        //cargo el archivo que voy a leer
        File archivo = new File ("fichero.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(archivo);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(fr);
        try {
            //leo una linea del fichero
            String linea = br.readLine();
            List<Persona> lista = new ArrayList<Persona>();

            while (linea!=null){
                //hago un split de la linea y voy guardando los datos en un objeto Persona
                String [] atributosPersona = linea.split(":");
                //creo una persona (le meto los atributos) y la meto al Arraylist
                Persona p = new Persona();
                p.setNombre(atributosPersona[0]);
                if(Objects.equals(atributosPersona[1], "")){
                    atributosPersona[1]=null;
                }
                p.setPoblacion(Optional.ofNullable(atributosPersona[1]).orElse("Desconocida"));
                if(atributosPersona.length>2){
                    p.setEdad(Integer.parseInt(Optional.ofNullable(atributosPersona[2]).orElse("0")));
                }
                lista.add(p);
                linea = br.readLine();
            }

           lista.stream().filter(persona->persona.getEdad()<25 && persona.getEdad()>0).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
