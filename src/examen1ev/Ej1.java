/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1ev;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Ej1 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int v1, v2;
        char v3;
        int suma = 0;
        int mult = 1;

        v1 = tec.nextInt();
        v2 = tec.nextInt();
        tec.nextLine();
        v3 = tec.nextLine().charAt(0);

        switch (v3) {
            case '+':

                for (int i = v1; i < v2; i++) {

                    if (i % 2 == 0) {

                        suma = suma + i;
                    }

                }

                System.out.println("La suma de los pares es " + suma);

                break;

            case '*':
                
               for (int i = v1; i < v2; i++) {

                    if (i % 2 == 0) {

                        mult = mult*i;
                    }

                }

                System.out.println("La multiplicación de los pares es " + mult);

                break; 
                
                
            default:
                System.out.println("Eres tonto, mete '+' o '*' !!!");
                //throw new AssertionError();
        }

    }

}
