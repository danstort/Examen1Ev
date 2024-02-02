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
public class Ej2 {

    
    public static void main(String[] args) {
        
        Scanner tec= new Scanner(System.in);
        double altura[]= new double[5];
        double altMedia=0;
        
        
        for (int i = 0; i < altura.length; i++) {
            
            altura[i]=tec.nextDouble();
        }
        
        double masBajo=altura[0];
        
        for (int i = 0; i < altura.length; i++) {
            
           if(masBajo>altura[i]){
           
               masBajo=altura[i];
               
           } 
            
        }
        
        
        
        for (int i = 0; i < altura.length; i++) {
          
            altMedia=altMedia+altura[i];
            
        }
        
        altMedia=altMedia/altura.length;
        System.out.println(altMedia);
        
        System.out.printf("El cliente más bajo mide %.2f", masBajo);
        System.out.printf("La media de altura es %.2f", altMedia);
    }
    
}
