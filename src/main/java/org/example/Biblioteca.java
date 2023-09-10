package org.example;
import java.util.*;
class Biblioteca {
    private int codigoPrestamo;
    private List<Libro> listaDeLibros;


public  Biblioteca() {
        this.codigoPrestamo = 1;
        this.listaDeLibros = new ArrayList<>();
        }

public void prestar(Libro libro) {
        if (libro.disponibilidad && libro.getCantidad() > 0) {
        libro.disponibilidad = false;
        System.out.println("Se prestó el libro " + libro.getNombre() + " con código de préstamo " + codigoPrestamo);
        codigoPrestamo++;
        } else {
        System.out.println("El libro no está disponible para préstamo.");
        }
        }

public void devolver(Libro libro) {
        if (!libro.disponibilidad) {
        libro.disponibilidad = true;
        System.out.println("Se devolvió el libro " + libro.getNombre());
        } else {
        System.out.println("Este libro ya está disponible en la biblioteca.");
        }
        }

public void buscarInformacion(String nombre) {
        for (Libro libro : listaDeLibros) {
        if (libro.getNombre().equalsIgnoreCase(nombre)) {
        libro.mostrarInformacion();
        return;
        }
        }
        System.out.println("No se encontró información para el libro con nombre " + nombre);
        }

public void mostrarLista() {
        System.out.println("Lista de libros en la biblioteca:");
        for (Libro libro : listaDeLibros) {
        System.out.println("Nombre: " + libro.getNombre());
        }
        }

public void poblarBiblioteca(List<Libro> libros) {
        this.listaDeLibros.addAll(libros);
        }

public Libro buscarLibro(String nombre) {
        for (Libro libro : listaDeLibros) {
        if (libro.getNombre().equalsIgnoreCase(nombre)) {
        return libro;
        }
        }
        return null;
        }
    }

