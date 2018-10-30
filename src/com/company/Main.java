package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entre 0 y 99");
        int numero = sc.nextInt(); // Almaceno en Scanner el valor de la variable numero
        int primerDigito=numero/10; // Con esta nueva variable obtengo el primer digito del numero y usaré esta variable despues en otra funcion para convertir numeros a letras
        int segundoDigito= numero % 10; // Con esta nueva variable obtengo el segundo digito del numero y que usaré despues en otra funcion para convertir numeros a letras numeros

        // Ahora mediante un if le decimos que si el numero va desde cero hasta 20 ambos incluidos, o si el numero es 30 o 40 o 50 o 60 o 70 u 80 o 90
        // y a traves de un switch que depende del numero introducido nos imprimira directamente el numero convertido a letra


        if (numero >= 0 && numero <= 20 || numero==30 || numero==40 || numero==50 || numero==60 || numero==70 || numero==80 || numero==90 || numero==100) {

            // Dentro del if creamos una variable vacia que guardará el valor resultante del switch el cual depende del valor de la variable numero
            //Pero no es necesario haberla creado, podiamos haber puesto para cada caso System.out.println("Uno" y asi sucesivamente pero la he creado por practicar la verdad.
            //Por tanto como la he creado, a cada case le digo que dependiendo del valor de la variable numero, esta nueva variable llamada resultadoSwitch tendrá un valor


            String resultadoSwitch;


            switch (numero) {
                case 1:
                    resultadoSwitch = "Uno";
                    break;
                case 2:
                    resultadoSwitch = "Dos";
                    break;
                case 3:
                    resultadoSwitch = "Tres";
                    break;
                case 4:
                    resultadoSwitch = "Cuatro";
                    break;
                case 5:
                    resultadoSwitch = "Cinco";
                    break;
                case 6:
                    resultadoSwitch = "Seis";
                    break;
                case 7:
                    resultadoSwitch = "Siete";
                    break;
                case 8:
                    resultadoSwitch = "Ocho";
                    break;
                case 9:
                    resultadoSwitch = "Nueve";
                    break;
                case 10:
                    resultadoSwitch = "Diez";
                    break;
                case 11:
                    resultadoSwitch = "Once";
                    break;
                case 12:
                    resultadoSwitch = "Doce";
                    break;
                case 13:
                    resultadoSwitch = "Trece";
                    break;
                case 14:
                    resultadoSwitch = "Catorce";
                    break;
                case 15:
                    resultadoSwitch = "Quince";
                    break;
                case 16:
                    resultadoSwitch = "Dieciseis";
                    break;
                case 17:
                    resultadoSwitch = "Diecisiete";
                    break;
                case 18:
                    resultadoSwitch = "Dieciocho";
                    break;
                case 19:
                    resultadoSwitch = "Diecinueve";
                    break;
                case 20:
                    resultadoSwitch = "Veinte";
                    break;
                case 30:
                    resultadoSwitch = "Treinta";
                    break;
                case 40:
                    resultadoSwitch = "Cuarenta";
                    break;
                case 50:
                    resultadoSwitch = "Cincuenta";
                    break;
                case 60:
                    resultadoSwitch = "Sesenta";
                    break;
                case 70:
                    resultadoSwitch = "Setenta";
                    break;
                case 80:
                    resultadoSwitch = "Ochenta";
                    break;
                case 90:
                    resultadoSwitch = "Noventa";
                    break;
                case 100:
                    resultadoSwitch = "Cien";
                    break;
                default:
                    resultadoSwitch = "Has introducido un numero fuera del rango 0-100";
                    break;
            }

            //Si el numero intrducido es numero >= 0 && numero <= 20 || numero==30 || numero==40 || numero==50 || numero==60 || numero==70 || numero==80 || numero==90 || numero==100
            // imprime el resultado

            System.out.println(resultadoSwitch);

        }

        // Ahora con un else if le decimos que, pero si el numero es: numero >= 21 && numero < 100 se vaya a la funcion calculaRestoNumeros, para calcular el resto de numeros
        // Y aqui no haria falta decirle que no coja el 20,30,40,50,60,70,80 ni 90, porque ya se lo hemos dicho al otro if anterior

        else if (numero >= 21 && numero < 100) {

            //Aqui llamamos a la funcion y entre parentesis ponemos las variables que habiamos creado y que va a usar esta funcion, osea, las variables primerDigito y segundoDigito

            calculaRestoNumeros(primerDigito,segundoDigito);

        }

        else {
            System.out.println("Has introducido un numero fuera del rango 0-100"); //Aqui le digo que si el numero esta fuera del rango 0-100 nos lo imprima en pantalla
        }

    }

    //Ahora creamos la funcion que hara los calculos

    //La llamamos calculaRestoNumeros y entre parentesis le ponemos el nombre de las variables que habiamos creado y que vamos a usar para hacer los calculos. No olvidar ponerle int

    public static void calculaRestoNumeros(int primerDigito, int segundoDigito) {

        // Ahora usamos dos switch uno para obtener el valor que le corresponde en letra al primer digito y otro para el  segundo digito

        //Por tanto para almacenar esos 2 valores creo 2 variables vacias que guaradaran el valor resultante de cada switch para usarlo por ultimo para imprimir en pantalla el numero convertido en letra

        String resulPrimerDigito = "";
        String resulSegundoDigito = "";

        switch (primerDigito) {

            case 2:
                resulPrimerDigito = "Veinti";
                break;
            case 3:
                resulPrimerDigito = "Treinta y ";
                break;
            case 4:
                resulPrimerDigito = "Cuarenta y ";
                break;
            case 5:
                resulPrimerDigito = "Cincuenta y ";
                break;
            case 6:
                resulPrimerDigito = "Sesenta y ";
                break;
            case 7:
                resulPrimerDigito = "Setenta y ";
                break;
            case 8:
                resulPrimerDigito = "Ochenta y ";
                break;
            case 9:
                resulPrimerDigito = "Noventa y ";
                break;
        }

        switch (segundoDigito) {
            case 1:
                resulSegundoDigito = "uno";
                break;
            case 2:
                resulSegundoDigito = "dos";
                break;
            case 3:
                resulSegundoDigito = "tres";
                break;
            case 4:
                resulSegundoDigito = "cuatro";
                break;
            case 5:
                resulSegundoDigito = "cinco";
                break;
            case 6:
                resulSegundoDigito = "seis";
                break;
            case 7:
                resulSegundoDigito = "siete";
                break;
            case 8:
                resulSegundoDigito = "ocho";
                break;
            case 9:
                resulSegundoDigito = "nueve";
                break;
        }


        System.out.println(resulPrimerDigito + resulSegundoDigito); // Aqui usamos la resultante del primer switch y del segundo , osea, resulPrimerDigito + resulSegundoDigito
    }

}

