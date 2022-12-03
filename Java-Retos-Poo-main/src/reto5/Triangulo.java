package reto5;

public class Triangulo extends Figura {

       //atributos
       private float b,h;
       //metodos
       public Triangulo() {
       }
   
       public Triangulo(float b,float h) {
           this.b = b;
           this.h = h;
       }
   
       public float getB() {
           return b;
       }
       public float getH() {
           return h;
       }
   
       public void setB(float b) {
           this.b = b;
       }
       public void setH(float h) {
           this.h = h;
       }
   
       @Override
       public void calcularArea() {
           float area = (b * h)/2;
           System.out.println("El area del triangulo de base "+b+" y altura "+h+" es "+area);
       }
    
}
