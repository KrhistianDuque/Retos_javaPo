package reto5;

public class Circulo extends Figura{
    
    //atributos
    private float radio;
    //metodos
    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        
        Double area = radio * radio * 3.14;
        System.out.println("El area del circulo de radio "+radio+" es "+area);
    }
}
