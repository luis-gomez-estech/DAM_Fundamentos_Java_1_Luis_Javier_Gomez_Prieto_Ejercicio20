package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");

        int numero = sc.nextInt();

        switch (numero) {
            case 0:
                System.out.println("Cero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Siete");
                break;
            case 8:
                System.out.println("ocho");
                break;
            case 9:
                System.out.println("Nueve");
                break;
            case 10:
                System.out.println("Diez");
                break;
            case 11:
                System.out.println("Once");
                break;
            case 12:
                System.out.println("Doce");
                break;
            case 13:
                System.out.println("Trece");
                break;
            case 14:
                System.out.println("Catorce");
                break;
            case 15:
                System.out.println("Quince");
                break;
            case 20:
                System.out.println("Veinte");
                break;

        }

        int aa = numero/10;
        int bb= numero%10;


        String a = "uno";
        String b = "dos";
        String c = "tres";
        String d = "cuatro";
        String e = "cinco";
        String f = "seis";
        String g = "siete";
        String h = "ocho";
        String i = "nueve";






        if (numero > 15&&numero<20) {
            switch (bb){
                case 6: System.out.println("Dieci" + f);
                    break;
                case 7: System.out.println("Dieci" + g);
                    break;
                case 8: System.out.println("Dieci" + h);
                    break;
                case 9: System.out.println("Dieci" + i);
                    break;
            }
        }

        if (numero>20&&numero<30) {
            switch (bb){

                case 1: System.out.println("Veinti" + a);
                    break;
                case 2: System.out.println("Veinti" + b);
                    break;
                case 3: System.out.println("Veinti" + c);
                    break;
                case 4: System.out.println("Veinti" + d);
                    break;
                case 5: System.out.println("Veinti" + e);
                    break;
                case 6: System.out.println("Veinti" + f);
                    break;
                case 7: System.out.println("Veinti" + g);
                    break;
                case 8: System.out.println("Veinti" + h);
                    break;
                case 9: System.out.println("Veinti" + i);
                    break;
            }
        }





    }



}




