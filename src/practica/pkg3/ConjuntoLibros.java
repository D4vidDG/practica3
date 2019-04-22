/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg3;

public class ConjuntoLibros {
    Libro[] coleccion;
    public ConjuntoLibros(Libro[] coleccion) {
        this.coleccion = coleccion;
    }
    
    public boolean añadirLibro ( Libro libro ){
        if(this.existeLibro(libro.getAutor(),libro.getTitulo())==true){
            return false;
        }
        
        for(int i=0; i<this.coleccion.length ;i++){
            if(this.coleccion [i] != null){
                coleccion[i]= libro;
                return true;
            }         
        }
        return false;
    } 
    public boolean eliminarLibro (String nombre, String titulo){
        for(int i=0; i<this.coleccion.length ;i++){
            if(this.coleccion [i].getAutor()== nombre && this.coleccion [i].getTitulo()== titulo ){
                coleccion[i]=null; 
                return true;
            }
        }
        return false;
    } 
    public void mostrarMayor(){
        int i=0;
        double Mayor=this.coleccion[i].getCalificacion();
           for(i=0; i<this.coleccion.length ;i++){
          if(Mayor<this.coleccion[i+1].getCalificacion()){
              Mayor=this.coleccion[i+1].getCalificacion();
          }      
      }
        System.out.println(Mayor);
        }
     public void mostrarMenor(){
        int i=0;
        double Menor=this.coleccion[i].getCalificacion();
           for(i=0; i<this.coleccion.length ;i++){
          if(Menor>this.coleccion[i+1].getCalificacion()){
              Menor=this.coleccion[i+1].getCalificacion();
              
      }
           }
        System.out.println(Menor);
        }
     public boolean existeLibro(String nombre, String titulo){
      for(int i=0; i<10 ;i++){
           if(this.coleccion [i].getAutor()== nombre && this.coleccion [i].getTitulo()== titulo){ 
                return true;
            }
      }   
      return false;
     }
}
           
    

     
    
   

