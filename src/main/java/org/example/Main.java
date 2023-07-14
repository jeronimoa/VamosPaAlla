package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //definiendo variables
       String  ubicacionUsuario;
       String destino;
       String nombreUsuario;
       String telefonoUsuario;

       //Declarar un dato especial para capturar informacion desde el teclado
        Scanner teclado=new Scanner(System.in);

        // para inicializar las Variables
        System.out.println("\u001B[32m VamosPaYa  \u001B[0m");

        System.out.print("Digite su ubicacion:  ");
        ubicacionUsuario=teclado.nextLine();
        System.out.print("Digite su destino:  ");
        destino=teclado.nextLine();
        System.out.print("Digite su nombre:  ");
        nombreUsuario=teclado.nextLine();
        System.out.print("Digite su telefono:  ");
        telefonoUsuario=teclado.nextLine();


        //proceso del problema
        String distancia="20"; //esto es un texto
        //debo hacer parseo de la variable distancia
        //parseo=cambiar o modificar el tipo de daro
        Integer distanciaEnEntero=Integer.parseInt(distancia);
        Integer costoPorKilometro=6800;
        Integer cobroTotal=distanciaEnEntero*costoPorKilometro;

        //salidas del problema

        System.out.println("\u001B[32m Señor Usuario: "+ nombreUsuario + " el total de su viaje es  $"+ cobroTotal +  "Pesos\u001B[0m");

       
    }
}