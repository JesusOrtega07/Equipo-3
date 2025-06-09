/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.convertidor;

import java.util.Scanner;

/**
 *
 * @author naomilopezdelacruz
 */
public class Distancia {

    Menu obj = new Menu();
    
    Scanner scanner = new Scanner (System.in);
    
    public void convertirMetros(){
        System.out.println("Escrible los metros a convertir:");
        obj.metros = scanner.nextInt();
        
        obj.kilometros = (obj.metros/1000);
        
        System.out.println("Estos son los kilometros" + obj.kilometros);
        
    }
      
    
    public void convertirCentimetros(){
        System.out.println("Escrible los centimetros a convertir:");
        obj.metros = scanner.nextInt();
        
        obj.metros = (obj.centimetros/100);
        
        System.out.println("Estos son los metros" + obj.metros);
        
    }
            
}
