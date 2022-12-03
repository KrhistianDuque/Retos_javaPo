package reto5;

import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int op;

        do{
        System.out.println(
                "Bienvenidos a la calculadora de Areas del SENA\n\nIndique con el numero, la operacion que desea realizar\n 1. Area de Cuadrado \n 2. Area de Triangulo \n 3. Area de Circulo \n 4. Area de Rectangulo");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                Cuadrado llamar = new Cuadrado();
                System.out.println("Ingrese el lado del cuadrado");
                float ladoCuadrado = leer.nextFloat();
                llamar.setLado(ladoCuadrado);
                llamar.calcularArea();
                break;
            case 2:
                Triangulo llamar2 = new Triangulo();
                System.out.println("Ingrese la base del triangulo");
                Float base = leer.nextFloat();
                llamar2.setB(base);
                System.out.println("Ingrese la altura del triangulo");
                Float altura = leer.nextFloat();
                llamar2.setH(altura);
                llamar2.calcularArea();
                break;
            case 3:
                Circulo llamar3 = new Circulo();
                System.out.println("Ingrese el radio del circulo");
                float radio1 = leer.nextFloat();
                llamar3.setRadio(radio1);
                llamar3.calcularArea();
                break;
            case 4:
                Rectangulo llamar4 = new Rectangulo();
                System.out.println("Ingrese el lado 1 del Rectangulo");
                float ladoR = leer.nextFloat();
                System.out.println("Ingrese el lado 2 del Rectangulo");
                float lado2 = leer.nextFloat();
                llamar4.setLado(lado2);
                llamar4.setLado1(ladoR);
                llamar4.calcularArea();
                break;
            }
        System.out.println("Digite 1. para realizar otra operacion o 2. para salir");
        op=leer.nextInt();
        }
        while(op==1);
        System.out.println("\n¡Gracias por visitarnos!");

        leer.close();

    }
    
}
