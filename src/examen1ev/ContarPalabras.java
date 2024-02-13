/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1ev;

import java.util.Scanner;

public class ContarPalabras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la cadena al usuario
        System.out.println("Introduzca una cadena de texto: ");
        String cadena = scanner.nextLine();

        // Contar palabras
        int numPalabras = 1;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isWhitespace(cadena.charAt(i))) {
                numPalabras++;
            }
        }

        // Contar palabras de 4 caracteres
        int numPalabras4 = 0;
        for (int i = 0; i < cadena.length() - 3; i++) {
            if (Character.isWhitespace(cadena.charAt(i)) &&
                !Character.isWhitespace(cadena.charAt(i + 1)) &&
                !Character.isWhitespace(cadena.charAt(i + 2)) &&
                !Character.isWhitespace(cadena.charAt(i + 3)) &&
                Character.isWhitespace(cadena.charAt(i + 4))) {
                numPalabras4++;
            }
        }

        // Mostrar resultados
        System.out.println("Número de palabras: " + numPalabras);
        System.out.println("Número de palabras de 4 caracteres: " + numPalabras4);
    }
}