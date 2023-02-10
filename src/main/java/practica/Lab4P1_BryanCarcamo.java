/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author Bryan Carcamo
 */
public class Lab4P1_BryanCarcamo {
    public static void main(String[] args) {
        
        Scanner lea=new Scanner (System.in).useDelimiter("\n");
        
        int opcion=0;
        while(opcion!=4){
        System.out.println("---------MENU--------");
        System.out.println("1.Substitute ");
        System.out.println("2.Repite ");
        System.out.println("3.Can you build it? ");
        System.out.println("4.Salir ");
        System.out.println("Opcion: ");
       opcion=lea.nextInt();
       
        switch(opcion){
            case 1:
               
                System.out.println("Ingrese una cadena (con el simbolo %d): ");
                String cadena=lea.next();
                
                System.out.println("Ingrese cadena que hara la substitucion: ");
                String sub=lea.next();
            
                cadena=cadena.replace("%d", sub);
                
                System.out.println(cadena);
                break;
                
            case 2:
                System.out.println("Ingrese una cadena: ");
                cadena=lea.next();
               
          
                if(cadena.contains(".")){
                    System.out.print(cadena);
                }
                
                System.out.println("");
                
                break;
                
            case 3:
                
                
                System.out.println("Ingrese una cadena(larga): ");
                String larga=lea.next();
                
                System.out.println("Ingrese una cadena(corta): ");
                String corta=lea.next();
                
                if(larga.equals(corta)){
                    System.out.println("You cant build it");
                }else{
                    System.out.println("You can build it");
                }
               
                break;
                
            case 4:
                System.out.println("Feliz dia");
                break;
        }
       
        }
        
        
    }
}
