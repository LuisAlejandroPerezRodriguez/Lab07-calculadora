/*
     Estudiante: Luis Alejandro perez Rodriguez 
    Matricula: 10141930
 */
package lab07;

/**
 *
 * @author luisa
 */
public class Module  extends Operacion {
    
        private double num1;
        private double num2;

            public Module(double a, double b ){
            num1=a;
            num2=b;
            
            }

        @Override
        public  double execute (double a, double b) {
            
            a=0;
            a=this.num1;
            this.num2=b;
            double resultado=a%b;
            System.out.println(resultado);
            return resultado;}
    
    
}
