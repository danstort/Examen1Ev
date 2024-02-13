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
public class Ej3 {

    public static void main(String[] args) {

        double sueldos[][] = new double[3][2];
        Scanner tec = new Scanner(System.in);

        for (int i = 0; i < sueldos.length; i++) {
            System.out.println("Empleado " + (i + 1));
            for (int j = 0; j < sueldos[i].length; j++) {

                
                sueldos[i][j]=tec.nextDouble();
            
            }
        }
        
        
        //prueba de for
        for (int i = 0; i < sueldos.length; i++) {

            for (int j = 0; j < sueldos[i].length; j++) {

                System.out.println(sueldos[i][j]);
            
            }
        }
        
        
        //for para mostrar sueldo de cada mes
        for (int i = 0; i < sueldos[0].length; i++) {
                System.out.println("Mes "+(i+1));
            for (int j = 0; j < sueldos.length; j++) {
                
                System.out.println(sueldos[j][i]);
            
            }
        }
    }
    
}
