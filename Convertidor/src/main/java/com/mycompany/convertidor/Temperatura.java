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
public class Temperatura {

    Menu obj = new Menu();

    Scanner scanner = new Scanner(System.in);

    public void convertirCelsiusFar() {
        System.out.println("Escrible los celsius a convertir:");
        obj.celsius = scanner.nextInt();

        obj.fahrenheit = (obj.celsius * 1.8)+32;

        System.out.println("Estos son los kilometros" + obj.kilometros);

    }

    public void convertirCelsuisaKel() {
        System.out.println("Escrible los centimetros a convertir:");
        obj.celsius = scanner.nextInt();

        obj.kelvin = (obj.celsius + 273.15);

        System.out.println("Estos son los kilometros" + obj.metros);

    }

    public void convertirFarenheitaCel() {
        System.out.println("Escrible los centimet:");
        obj.fahrenheit = scanner.nextInt();

        obj.celsius = (obj.fahrenheit - 32)/1.8;

        System.out.println("Estos son los kilometros" + obj.metros);

    }

    public void convertirKelvinaCel() {
        System.out.println("Escrible ");
        obj.kelvin = scanner.nextInt();

        obj.celsius = (obj.kelvin - 273.15);

        System.out.println("Estos " + obj.metros);

    }

}
