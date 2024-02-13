/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1ev;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Ej4 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        String frase = tec.nextLine()+" ";
        int nPalabras = 0;
        int p4=0;
        int cont=0;

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == ' ') {

                nPalabras++;
            }
        }
        
        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == ' ') {
                
                if (cont-i==4) {
                    p4++; 
                }
                cont=i+1;
            }
        }
    }

}
