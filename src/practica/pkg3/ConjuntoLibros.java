/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg3;

public class ConjuntoLibros {
    Libro [] coleccion;
    public ConjuntoLibros(Libro [] coleccion) {
        this.coleccion = coleccion;
    }
    
    public boolean añadirLibro ( Libro libro ){
        
        if(this.existeLibro(libro.getAutor(),libro.getTitulo())==true){
            return false;
        }
        
        for(int i=0; i<this.coleccion.length ;i++){
            if(this.coleccion[i] == null){
                coleccion[i]= libro;
                return true;
            }         
        }
        return false;
    } 
    public boolean eliminarLibro (String nombre, String titulo){
        for(int i=0; i<this.coleccion.length ;i++){
            if(this.coleccion[i]!=null){
            if(this.coleccion[i].getAutor()== nombre && this.coleccion[i].getTitulo()== titulo ){
                coleccion[i]=null; 
                return true;
            }
            }
        }
        return false;
    } 
    public void mostrarMayor(){
        if(primeraCalificacion()!=20){
        double Mayor= primeraCalificacion();
           for(int i=0; i<this.coleccion.length ;i++){
               if(this.coleccion[i]!=null){
          if(Mayor<=this.coleccion[i].getCalificacion()){
              Mayor=this.coleccion[i].getCalificacion();
          }
          }      
      }
           for(int i=0;i<this.coleccion.length;i++){
               if(this.coleccion[i]!=null){
          if(Mayor==this.coleccion[i].getCalificacion()){
              System.out.println("Mejor Calificación:"+Mayor+"de"+this.coleccion[i].getTitulo());
          }
 
           }
        }
        }else{
        System.out.println("No hay libros en la colección");
        }
    }
    
        public void mostrarMenor(){
        if(primeraCalificacion()!=20){
        double Menor= primeraCalificacion();
           for(int i=0; i<this.coleccion.length ;i++){
               if(this.coleccion[i]!=null){
          if(Menor>=this.coleccion[i].getCalificacion()){
              Menor=this.coleccion[i].getCalificacion();
          }
          }      
      }
           for(int i=0;i<this.coleccion.length;i++){
               if(this.coleccion[i]!=null){
          if(Menor==this.coleccion[i].getCalificacion()){
              System.out.println("Peor Calificación:"+Menor+"de"+this.coleccion[i].getTitulo());
          }
 
           }
        }
        }else{
        System.out.println("No hay libros en la colección");
        }
        }

     public boolean existeLibro(String nombre, String titulo){
      for(int i=0; i<this.coleccion.length ;i++){
          if(this.coleccion[i]!=null){
           if(this.coleccion[i].getAutor()== nombre && this.coleccion[i].getTitulo()==titulo){ 
                return true;
            }
          }
      }   
      return false;
     }
     public void mostrarContenido (){
         int contador=1;
         for(int i=0;i<this.coleccion.length;i++){            
             if(this.coleccion [i]!=null){
             System.out.println("Libro" +contador);  
             System.out.println("Titulo:"+this.coleccion[i].getTitulo()); 
             System.out.println("Autor:"+this.coleccion[i].getAutor()); 
             System.out.println("Paginas:"+this.coleccion[i].getPaginas()); 
             System.out.println("Calificación:"+this.coleccion[i].getCalificacion()); 
             contador++;
         }
         }
     }
     public double primeraCalificacion (){
         double primera;
         for(int i=0;i<this.coleccion.length;i++){
             if(this.coleccion[i]!=null){
                 primera=this.coleccion[i].getCalificacion();
                 return primera;
             }
         }
       return  20; 
     }
}
           
    

     
    
   

