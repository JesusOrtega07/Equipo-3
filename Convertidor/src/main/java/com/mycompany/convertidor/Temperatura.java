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

        obj.kilometros = (obj.metros / 1000);

        System.out.println("Estos son los kilometros" + obj.kilometros);

    }

    public void convertirCelsuisaKel() {
        System.out.println("Escrible los centimetros a convertir:");
        obj.metros = scanner.nextInt();

        obj.metros = (obj.centimetros / 100);

        System.out.println("Estos son los kilometros" + obj.metros);

    }

    public void convertirFarenheitaCel() {
        System.out.println("Escrible los centimet:");
        obj.metros = scanner.nextInt();

        obj.metros = (obj.centimetros / 100);

        System.out.println("Estos son los kilometros" + obj.metros);

    }

    public void convertirKelvinaCel() {
        System.out.println("Escrible ");
        obj.metros = scanner.nextInt();

        obj.metros = (obj.centimetros / 100);

        System.out.println("Estos " + obj.metros);

    }

}
