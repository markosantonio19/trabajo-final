/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author marko
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¿Tienes hambre? (si/no)");
        String respuestaHambre = scanner.nextLine();
        
        if (respuestaHambre.equalsIgnoreCase("si")) {
            System.out.println("¿Quieres comer pizza o hamburguesa?");
            String respuestaComida = scanner.nextLine();
            
            if (respuestaComida.equalsIgnoreCase("pizza")) {
                System.out.println("Disfruta tu pizza");
            } else if (respuestaComida.equalsIgnoreCase("hamburguesa")) {
                System.out.println("Disfruta tu hamburguesa");
            } else {
                System.out.println("No has seleccionado una opción válida");
            }
        } else if (respuestaHambre.equalsIgnoreCase("no")) {
            System.out.println("¡Genial! Puedes esperar para comer");
        } else {
            System.out.println("Respuesta no válida");
        }
        
        scanner.close();
    }
}

    

