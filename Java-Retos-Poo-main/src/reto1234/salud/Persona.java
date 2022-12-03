package reto1234.salud;

import java.util.Scanner;

public class Persona {

    Scanner leer = new Scanner(System.in);
        public int documento, edad;
        public String tipoDoc, nombre, apellido, sexo, metodo;
        public float peso, estatura;
        public Float pesoActual;

        public void pedirDatos() {
            

            System.out.println("Digite su tipo de documento CC, TI, PP");
            tipoDoc = leer.nextLine();

            System.out.println("Digite su numero de documento");
            documento = leer.nextInt();
            System.out.println("Digite su edad");
            leer.nextLine();
            edad = leer.nextInt();

            System.out.println("Digite su nombre y apellido");
            //leer.nextLine();
            nombre = leer.next();
            leer.nextLine();
            apellido = leer.nextLine();

            System.out.println("Digite su sexo: M o F");
            //leer.nextLine();
            sexo = leer.nextLine();

            System.out.println("Digite peso");
            //leer.nextLine();
            peso = leer.nextFloat();

            System.out.println("Digite estatura");
            leer.nextLine();
            estatura = leer.nextFloat();

        }
        
        public void mostrarPersona() {

            System.out.println("La persona " + nombre + " " + apellido + " con tipo de documento" + tipoDoc
                    + " numero: " + documento + " de genero " + sexo + " tiene un peso de: " + peso + " Kg, Mide "
                    + estatura + " Mts y tiene " + edad + " Años");
        }
        //RETO1
        /*public void calcularImc() {
        
            pesoActual = peso / estatura * estatura;
        
            if (pesoActual < 20) {
                System.out.println("El peso esta por debajo de lo ideal");
            } else if (pesoActual == 20 || pesoActual == 25) {
                System.out.println("El peso es ideal");
        
            } else if (pesoActual > 25) {
                System.out.println("TIENE SOBREPESO");
            }
        }*/

        //RETO2
        public String calcularImc() {
            pesoActual = peso / estatura * estatura;
        
            if (pesoActual < 20) {
                metodo = "PESO BAJO";
            } else if (pesoActual >= 20 || pesoActual < 25) {
                metodo = "PESOIDEAL";
        
            } else if (pesoActual > 25) {
                metodo = "SOBRE PESO";
            }
            return metodo;
        }
        
        public void mayoEdad() {
            if (edad >= 18) {
                System.out.println(nombre + " Es mayor de edad");
            } else
                System.out.println(nombre + " Es menor de edad");

        
        }

        //RETO3
         
        public Persona() {
        }

        public Persona(String nombre, String apellido, int documento) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.documento = documento;

        }
        public Persona(float peso) {
            this.peso = peso;

        }
        
        public void MostrarMetodoconstructor() {
            System.out
                    .println("Nombre: " + nombre + "apellido: " + apellido + "\ndocumento de identidad: " + documento);
        }

        public void MostrarMetodoconstructor(int peso) {
            System.out.println("SU PESO ES DE "+peso);
        }
        

        
        



    
}
