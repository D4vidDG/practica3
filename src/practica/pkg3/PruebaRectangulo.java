







/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg3;

public class PruebaRectangulo {
    //asociacion
    private Rectangulo r1;
    public static void main(String[] args) {
        //Dependencia
     Rectangulo r1 = new Rectangulo(1,2);
     Rectangulo r2 = new Rectangulo(4,5);
     Rectangulo r3 = new Rectangulo(6,7);
     Rectangulo r4 = new Rectangulo(8,2);
     Rectangulo r5 = new Rectangulo(3,5);
    
        System.out.println("Perimetro r1:"+ r1.calcularPerimetro());
        System.out.println("Perimetro r2:"+ r2.calcularPerimetro());
        System.out.println("Perimetro r3:"+ r3.calcularPerimetro());
        System.out.println("Perimetro r4:"+ r4.calcularPerimetro());
        System.out.println("Perimetro r5:"+ r5.calcularPerimetro());
        System.out.println("Area r1:"+ r1.calcularArea());
        System.out.println("Area r2:"+ r2.calcularArea());
        System.out.println("Area r3:"+ r3.calcularArea());
        System.out.println("Area r4:"+ r4.calcularArea());
        System.out.println("Area r5:"+ r5.calcularArea());
        
        
        
     

}
}
