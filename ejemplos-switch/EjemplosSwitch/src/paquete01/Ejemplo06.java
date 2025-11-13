/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;


import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author UTPL
 */
public class Ejemplo06 {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese su placa vehicular");
        String placa = entrada.nextLine();
        placa = placa.toLowerCase();
        
        String inicial = placa.substring(0, 1);
        switch(inicial){
            case "G":
                System.out.printf("%s\n", "acceso correcto");
            case "P":
                System.out.printf("%s\n", "acceso correcto");
            default:
                System.out.printf("%s\n", "acceso incorrecto");
        }
        
        
    }
}
