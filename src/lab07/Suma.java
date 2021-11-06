/*
     Nombre: Luis Alejandro Perez Rodriguez
     Matricula: 10141930

 */
package lab07;

public class Suma extends Operacion {
    
    private double num1;
    private double num2;

            public Suma(double a, double b ){
            num1=a;
            num2=b;
            
            }

        @Override
        public  double execute (double a, double b) {
            
            a=0;
            a=this.num1;
            this.num2=b;
            double resultado=a+b;
            System.out.println(resultado);
            return resultado;}
    
}
