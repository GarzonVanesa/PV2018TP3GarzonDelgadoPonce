/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

import java.util.Scanner;

public class Punto01 {

    int[] arreglo = new int[10];

    public void ingresar() {
        Scanner num = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese numero: ");
            arreglo[i] = num.nextInt();
        }
    }

    public void mostrar() {
        System.out.println("Numeros imgresados:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

    public int mostrarMayor() {

        int max = arreglo[0];
        for (int i = 0; i < arreglo.length; i++) {
            if (max < arreglo[i]) {
                max = arreglo[i];
            }
        }
        return max;
    }

    public int mostrarMenor() {
        int min = arreglo[0];
        for (int i = 0; i < arreglo.length; i++) {
            if (min > arreglo[i]) {
                min = arreglo[i];
            }
        }
        return min;
    }

    public double calcularPromedio() {
        double prom = 0;                        //int suma=0;
        for (int i = 0; i < arreglo.length; i++) {
            prom = prom + arreglo[i];  //puede ser suma=suma+arreglo[i];
        }
        prom = prom / 10;             //prom=suma/arreglo.length;
        return prom;
    }
}
