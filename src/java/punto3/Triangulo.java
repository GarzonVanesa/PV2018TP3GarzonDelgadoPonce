/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

import java.util.Scanner;

/**
 *
 * @author Hilarion
 */
public class Triangulo {


    int[] arreglo = new int[3];
    public Triangulo() {

    }
    public void menu(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese lado A del triangulo");
        arreglo[0]=scan.nextInt();
         System.out.println("Ingrese lado B del triangulo");
        arreglo[1]=scan.nextInt();
         System.out.println("Ingrese ladon C del triangulo");
        arreglo[2]=scan.nextInt();
        if (arreglo[0]+arreglo[1]>arreglo[2] && arreglo[1]+arreglo[2]>arreglo[0] && arreglo[0]+arreglo[2]>arreglo[1]){
            System.out.println("El perimeto es " + (arreglo[0]+arreglo[1]+arreglo[2]));
        }
        else
            System.out.println("El triangulo no puede armarse");
    }
}
