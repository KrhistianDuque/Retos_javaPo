package reto1234.salud;

import java.util.Scanner;

public class Empleado extends Persona{

    //Atributos 

    String cargo, departamento;
    int valorhora=3500;
    Double horastrabajadas;

    Scanner leer = new Scanner(System.in);

    
    public void pedirDatos2(){
        System.out.println("Digite su tipo de documento CC, TI, PP");
        tipoDoc = leer.nextLine();
        System.out.println("Digite su numero de documento");
        documento = leer.nextInt();
        System.out.println("Digite su nombre y apellido");
        //leer.nextLine();
        nombre = leer.next();
        leer.nextLine();
        apellido = leer.nextLine();
        System.out.println("Digite su cargo");
        //leer.nextLine();
        cargo = leer.nextLine();
    }

    
    public String calcularHonorarios(){
        System.out.println("El valor de la hora de trabajo es de $3.500\n Indique la cantidad de horas trabajadas");
        horastrabajadas = leer.nextDouble();
        Double honorarios = valorhora*horastrabajadas;
        honorarios= honorarios-honorarios*0.00966;

        String respuesta = "El SR "+nombre+" "+apellido+" identificado con "+tipoDoc+" numero "+documento+" bajo el cargo de "+cargo+" \nEn el año 2022, a un valor de $"+valorhora+" COP la hora, tiene un total a pagar de $"+honorarios;
        return respuesta;
    }




}
    