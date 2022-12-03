package reto1234.principal;

import java.util.Scanner;

import reto1234.salud.Empleado;
import reto1234.salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        Scanner leer1=new Scanner(System.in);

        System.out.println("Indique su tipo de usuario\n 1.Personas \n 2.Empleado");
        int op = leer1.nextInt();

        if(op==1){
        //reto 1 y 2
        Persona objeto = new Persona();

        objeto.pedirDatos();
        objeto.mostrarPersona(); 
        System.out.println(objeto.calcularImc());
        objeto.mayoEdad();

        //reto3
        Persona objeto2 = new Persona("cesar" , "sierra", 1073);

        objeto2.MostrarMetodoconstructor();
        objeto2.MostrarMetodoconstructor(55);
        }
        
        else if(op==2){
        //reto 4
        Empleado objetoEmpleado = new Empleado();

        objetoEmpleado.pedirDatos2();
        System.out.println(objetoEmpleado.calcularHonorarios());
        }

        else {
            System.out.println("Digite unicamente 1 y 2");
        }

    }
    
}
