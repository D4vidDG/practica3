/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg3;


public class Libro {
   private String titulo;
   private String autor;
   private int paginas;
   private double calificacion;

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getPaginas() {
        return paginas;
    }
    public double getCalificacion() {
        return calificacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setPaginas(int paginas) {
        if(paginas>0){
        this.paginas = paginas;
        }
    }
    public void setCalificacion(double calificacion) {
        if(calificacion>=0 && calificacion<=10){
        this.calificacion = calificacion;
    }
        
    }
  
   
   
}
