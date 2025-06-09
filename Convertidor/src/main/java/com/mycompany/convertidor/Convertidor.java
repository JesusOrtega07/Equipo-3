/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.convertidor;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Convertidor {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        Menu objMenu = new Menu(); 
        
        objMenu.menu();
        System.out.println("Ingresa la opcion ");
        int opcion = consola.nextInt();
        if(opcion ==1){
            objMenu.submenulongitudes(opcion);
        }
        if(opcion ==2){
            objMenu.submenutemperaturas(opcion);
        }
        
    }
}
