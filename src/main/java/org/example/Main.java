package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("Harry Potter", "J.K. Rowling", "Editorial A", 1, 30, "Estante 1");
        Libro libro2 = new Libro("1984", "George Orwell", "Editorial B", 2, 8, "Estante 6");
        Libro libro3 = new Libro("Orgullo y prejuicio", "Jane Austen", "Editorial C", 3, 7, "Estante 5");

        biblioteca.poblarBiblioteca(List.of(libro1, libro2, libro3));

        biblioteca.mostrarLista();


        Libro libroPrestado = biblioteca.buscarLibro("1984");
        if (libroPrestado != null) {
            biblioteca.prestar(libroPrestado);
        }

        Libro libroDevuelto = biblioteca.buscarLibro("Harry Potter");
        if (libroDevuelto != null) {
            biblioteca.devolver(libroDevuelto);
        }

        biblioteca.buscarInformacion("Orgullo y prejuicio");

     
        libroPrestado.mostrarDisponibilidad();
        libroDevuelto.mostrarDisponibilidad();
    }
}