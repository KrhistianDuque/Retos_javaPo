package reto5;

public class Rectangulo extends Figura {

     //atributos
     private float lado,lado1;
     //metodos
     public Rectangulo() {
     }
 
     public Rectangulo(float lado, float lado1) {
         this.lado = lado;
         this.lado1 = lado1;
     }
 
     public float getLado() {
         return lado;
     }
     public float getLado1() {
        return lado1;
    }
 
    public void setLado(float lado) {
        this.lado = lado;
    }
    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }
 
     @Override
     public void calcularArea() {
         float area = lado * lado1;
         System.out.println("El area del rectangulo de lados "+lado+" y "+lado1+" es "+area);
     }
    
}
