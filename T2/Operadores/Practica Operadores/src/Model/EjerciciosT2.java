package Model;

import java.util.Scanner;

public class EjerciciosT2 {
    //EJERCICIO 1
    public void ejercicio1(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int primerNumero= teclado.nextInt();
        System.out.println("Introduce el segundo número:");
        int segundoNumero = teclado.nextInt();
        int suma =primerNumero+segundoNumero;
        System.out.println("Suma: "+suma);
        int resta= primerNumero-segundoNumero;
        System.out.println("Resta: "+resta);
        int multiplaciacion= primerNumero*segundoNumero;
        System.out.println("Multiplicación: "+multiplaciacion);
        double division= (double) primerNumero/segundoNumero;
        System.out.printf("División: %.2f\n",division);
        int modulo= primerNumero%segundoNumero;
        System.out.println("Módulo (resto): "+modulo);
        teclado.close();
    }
    public void ejercicio2(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int primerNumero = teclado.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int segundoNumero = teclado.nextInt();
        boolean mayorQue= primerNumero>segundoNumero;
        System.out.println("¿ "+primerNumero+" es mayor que "+segundoNumero+"? "+mayorQue);
        boolean menorQue= primerNumero<segundoNumero;
        System.out.println("¿ "+primerNumero+" es menor que "+segundoNumero+"? "+menorQue);
        boolean esIgual= primerNumero==segundoNumero;
        System.out.println("¿ "+primerNumero+" es igual que "+segundoNumero+"? "+esIgual);
        boolean diferente= primerNumero!=segundoNumero;
        System.out.println("¿ "+primerNumero+" es diferente que "+segundoNumero+"? "+diferente);
        boolean mayorOIgual= primerNumero>=segundoNumero;
        System.out.println("¿ "+primerNumero+" es mayor o igual que "+segundoNumero+"? "+mayorOIgual);
        boolean menorOIgual=primerNumero<=segundoNumero;
        System.out.println("¿ "+primerNumero+" es menor o igual que "+segundoNumero+"? "+menorOIgual);
        teclado.close();
    }
    public void ejercicio3(){
        Scanner teclado = new Scanner(System.in);
        int valor;//defino la variable pero sin asignarle valor
        System.out.println("Valor inicial: ");
        valor=teclado.nextInt();// la variable definida obtiene un valor asignandole la variable compleja scanner
        System.out.println("Numero que quiere Sumar");
        int suma= teclado.nextInt();
        valor+=suma;
        System.out.println("Despues de sumar "+suma+" (+=)" +valor);
        System.out.println("Numero que quiere restar: ");
        int resta = teclado.nextInt();
        valor-=resta;
        System.out.println("Despues de restar "+resta+" (-=) "+valor);
        System.out.println("Numero que quiere multiplicar");
        int multipliacion= teclado.nextInt();
        valor*=multipliacion;
        System.out.println("Despues de multplicar por: "+multipliacion+ "(*=) "+valor);
        System.out.println("Numero que quiere dividir:");
        double division= teclado.nextDouble();
        valor/=(int) division;
        System.out.println("Despues de dividir entre "+division+" (/=) "+valor);
        teclado.close();
    }
}
