package org.example;

import java.util.ArrayList;
import java.util.List;

class Libro {
    private String nombre;
    public String autor;
    public String editorial;
    public boolean disponibilidad;
    private int id;
    private int cantidad;
    private String ubicacion;

    public Libro(String nombre, String autor, String editorial, int id, int cantidad, String ubicacion) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.disponibilidad = true;
        this.id = id;
        this.cantidad = cantidad;
        this.ubicacion = ubicacion;
    }

    public void agregar() {
        this.cantidad++;
    }

    public void eliminar() {
        if (this.cantidad > 0) {
            this.cantidad--;
        }
    }
    public String getNombre(){
        return nombre;
    }
    public String getUbicacion(){
        return ubicacion;
    }
    public int getCantidad(){
        return cantidad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Autor: " + this.autor);
        System.out.println("Editorial: " + this.editorial);
        System.out.println("ID: " + this.id);
        System.out.println("Cantidad: " + this.cantidad);
        System.out.println("Ubicación: " + getUbicacion());
    }

    public void mostrarDisponibilidad() {
        if (this.disponibilidad) {
            System.out.println("El libro está disponible.");
        } else {
            System.out.println("El libro no está disponible.");
        }
    }
}


