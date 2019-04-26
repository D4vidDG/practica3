/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg3;
import java.util.*;
public class PruebaLibros {
    public static void main(String[] args) {
      Libro [] coleccion_1 = new Libro [3];
      ConjuntoLibros Coleccion_1=new ConjuntoLibros (coleccion_1);
      Scanner  lectura =new Scanner (System.in);
      
      Libro libro1=new Libro();
      Libro libro2=new Libro();
      Libro libro3=new Libro();
      
      libro1.setAutor("Ernesto Sabato");
      libro2.setAutor("Jose Saramago");
      libro1.setTitulo("El tunel");
      libro2.setTitulo("Ensayo sobre la ceguera");
      libro1.setPaginas(184);
      libro2.setPaginas(416);
      libro1.setCalificacion(7);
      libro2.setCalificacion(9);
      libro3.setAutor("J.K.Rowling");
      libro3.setTitulo("Harry Potter");
      libro3.setPaginas(184);
      libro3.setCalificacion(10);
      Coleccion_1.añadirLibro(libro1);
      Coleccion_1.añadirLibro(libro2);
      Coleccion_1.mostrarContenido();
      
      Coleccion_1.eliminarLibro("Jose Saramago","Ensayo sobre la ceguera");
      Coleccion_1.mostrarContenido();
      
      Coleccion_1.añadirLibro(libro2);
      Coleccion_1.añadirLibro(libro3);
      
      Coleccion_1.mostrarContenido();
      Coleccion_1.mostrarMayor();
      Coleccion_1.mostrarMenor();
     
    }

   
}
