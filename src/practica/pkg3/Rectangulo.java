/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg3;

public class Rectangulo {
   private double base;
   private double altura;

    public Rectangulo(double base, double altura) {
        if(base>0 && altura>=0){
        this.base = base;
        this.altura = altura;
    }
    }
    
    public double calcularArea(){
        double area= this.base*this.altura;
        return area;
    }
    public double calcularPerimetro(){
        double perimetro= (2*this.base)+(2*this.altura);
        return perimetro;
    }  
}
