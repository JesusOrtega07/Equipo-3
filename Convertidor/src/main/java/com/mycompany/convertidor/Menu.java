/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.convertidor;

/**
 *
 * @author carlo
 */
public class Menu {

    public double celsius;
    public double fahrenheit;
    public double kelvin;

    public double metros;
    public double kilometros;
    public double centimetros;

    public int menu(int opcion) {
        System.out.println("-----MENU-----");
        System.out.println("1._ longitudes");
        System.out.println("2._ temperaturas");
        return opcion;
    }

    public int submenulongitudes(int opcion) {
        System.out.println("-----MENU-----");
        System.out.println("1._ celsius a fahrenheit");
        System.out.println("2._ celcius a kelvin");
        System.out.println("2._ fahrenheit a celcius");
        System.out.println("2._ kelvin a celcius");
        return opcion;
    }

    public int submenutemperaturas(int opcion) {
        System.out.println("-----MENU-----");
        System.out.println("1._ metros a kilometros");
        System.out.println("2._ centimetros a metros");
        return opcion;
    }

}
