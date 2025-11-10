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
    public void ejercicio4(){
        Scanner teclado= new Scanner(System.in);

    }
    public void ejercicio5(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad=teclado.nextInt();
        System.out.println("¿Tienes carnet de conducir?: ");
        boolean carnet= teclado.nextBoolean();

        boolean mayor21= edad>= 21;
        System.out.println("¿Eres mayor de 21 años?: "+mayor21);
        boolean tienescarnet= mayor21 && carnet;
        System.out.println("¿Tienes carnet?: "+tienescarnet);
        boolean alquilarCoche= mayor21 && tienescarnet;
        System.out.println("¿Puedes aluilar coche?: "+alquilarCoche);
        teclado.close();
    }
    public void ejercicio6(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce el precio del producto:");
        int precio = teclado.nextInt();
        System.out.println("Introduce el porcentaje de descuento:");
        int porcentaje = teclado.nextInt();
        //Mostar en consola el precio original hay que hacer un casteo pasar el int a double tempòral
        System.out.printf("Precio original: %.1f€\n",(double)precio);
        System.out.printf("Descuento (%d%%): %.1f€\n",porcentaje,(double)porcentaje) ;
        int precioTotal =  precio-(precio*porcentaje/100);
        System.out.printf("Precio final:%.1f€\n" ,(double)precioTotal);

    }
    public void ejercicio7(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = teclado.nextInt();
        System.out.println("¿Eres estudiante? (true/false): ");
        boolean eresEstudiante = teclado.nextBoolean();

        boolean menor26anhos= edad<26;
        System.out.println("¿Eres menor de 26 años?: "+menor26anhos);
        System.out.println("¿Eres estudiante?:"+eresEstudiante);
        boolean noEresEstudiante= !eresEstudiante;
        System.out.println("¿No eres estudiante? "+noEresEstudiante);
        System.out.println("¿Tienes descuento joven?(menor de 26)  "+menor26anhos);
        System.out.println("Tienes descuento estudiante?: "+eresEstudiante);
        boolean descuentoEspecial= menor26anhos && eresEstudiante;
        System.out.println("Tienes descuento especial?: (menor de 26 AND estudiante) "+descuentoEspecial);
        teclado.close();

    }
    public void ejercicio8(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce el primer numero:");
        int primerNumero= teclado.nextInt();
        System.out.println("Introduce el segundo numero:");
        int segundoNumero= teclado.nextInt();
        System.out.println("Introduce el tercer numero:");
        int tercerNumero= teclado.nextInt();
        int suma= primerNumero+segundoNumero+tercerNumero;
        System.out.println("Suma de los tres números: "+suma);
        double promedio= (double) suma/3;
        System.out.printf("Promedio; %.1f\n",promedio);
        double division=((double) primerNumero*segundoNumero)/tercerNumero;
        System.out.println("Resultado de (numero1 * numero 2) / número3: "+division);
        teclado.close();

    }
    public void ejercicio9(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la nota del primer examen:");
        int nota1= teclado.nextInt();
        System.out.println("Introduce la nota del segundo examen:");
        int nota2= teclado.nextInt();
        System.out.println("Introduce la nota del tercero examen:");
        int nota3= teclado.nextInt();

        double notaMedia = ((double) nota1 + nota2 + nota3) / 3;
        System.out.printf("\nNota media: %.1f\n", notaMedia);

        // --- Lógica Corregida (Categorías Excluyentes) ---

        // 1. Sobresaliente: 9.0 o más. (Es la categoría más alta, no necesita límite superior)
        boolean sobresaliente = notaMedia >= 9;

        // 2. Notable: 7.0 o más, PERO menos de 9.0
        boolean notable = notaMedia >= 7 && notaMedia < 9;

        // 3. Aprobado: 5.0 o más, PERO menos de 7.0
        boolean aprobado = notaMedia >= 5 && notaMedia < 7;

        // 4. Suspenso: Cualquier nota que no haya cumplido las anteriores.
        boolean suspenso = notaMedia < 5;

        // Mostramos los resultados según las nuevas condiciones:
        System.out.println("¿Tiene sobresaliente? (9-10): " + sobresaliente);
        System.out.println("¿Tiene notable? (7-8.9): " + notable);
        System.out.println("¿Está aprobado? (5-6.9): " + aprobado);
        System.out.println("¿Está suspenso? (<5): " + suspenso);

        teclado.close();
    }
}
