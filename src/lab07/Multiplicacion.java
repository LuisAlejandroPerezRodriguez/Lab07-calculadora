/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

public class Multiplicacion extends Operacion {
    
     private double num1;
     private double num2;

            public Multiplicacion(double a, double b ){
            num1=a;
            num2=b;
            
            }

        @Override
        public  double execute (double a, double b) {
            
            a=0;
            a=this.num1;
            this.num2=b;
            double resultado=a*b;
            System.out.println(resultado);
            return resultado;}
    
    
}
