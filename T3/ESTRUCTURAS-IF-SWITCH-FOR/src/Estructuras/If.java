//CLASE DEL 23/10/2025
package Estructuras;


/*CASTEO
cambiar un tipo de dato MOMENTANEAMENTE. Solo se puede aplcar a tipos que entran dentro de ootros
Cuanado el destina esta incluido en el origen
EJEMPLO:
int-> double 7->7.0
double -> int 7.5-> 7
char -> int A -> 75
impresion por CONSOLA:
double division = (double) 6/7
sout((double)numero)

PARSEO
Cambio de tipo de dato MMOMENTANEAMENTE.  Tanto si el orgien esta incluedio en el destino como
si no. ME LA JUEGO  porque puede que de fallo.
EJEMPLO
String -> int
String -> double
String -> boolean
String -> float
String palabra= "hola"->
sout(la ENVOLVENTE.parseInt(variable))

int-> String
double -> String
etc..
 */

import java.util.Scanner;

public class If {
   private Scanner teclado;
    //PARSEO
    public void parseo(){
      //LA CLASE A LA QUE QUIERO PASAR PERO NO SE PONE EL PRIMITIVO SI NO LA ENVOLVENTE
        String palabra= "7";
        System.out.println(Integer.parseInt(palabra)+10);

        //HACEMOS EL CASO CONTRARIO DEL INT A STRING
        int numero= 123;
        System.out.println(String.valueOf(123)+1);//ESTO SE CONVIERTE EN STRING
        boolean cierto= true;
        System.out.println(String.valueOf(cierto)+"asd");
        //sout(String.valueOF(dato))

    }

    public void estructuraIf(int nota){
        /*ESTRUCTURA DE SELECCION
        IF-> seleccionar que parte del codigo tengo que jecutar dependiendo
        de una condicion lógica (true - false)
        seudocódigo

        if (condicion logica){}
        Si (condicion){
               cuepo
        }     sino{
                cuerpo
        }
         */
        System.out.println("Vamos a explicar la estructura IF");
        if (nota>=5){
            System.out.println("El examen esta aprobado ");

        }else {
            System.out.println("El examen esta suspenso ");
        }
        System.out.println("Terminando la evaluación");
    }

    public void estructuraIFELSEIF(double nota){
        //0 -> desastroso
        //1-3 -> mal
        // 4-> raspado
        //5-7-> bien
        //8-8.99 notable
        //9-9.99 -> sobresaliente
        //10 -> mh
        System.out.println("Iniciando la evaluación del examen");
        if (nota>=0 && nota<=10) {
            if (nota < 1) {
                System.out.println("Examen desastroso");
            } else if (nota < 4) {
                System.out.println("Examen mal");
            } else if (nota < 5) {
                System.out.println("Examen suspenso raspado");
            } else if (nota < 8) {
                System.out.println("Examen bien");
            } else if (nota < 9) {
                System.out.println("Examen notable");
            } else if (nota < 10) {
                System.out.println("Examen sobresaliente");
            } else {
                System.out.println("Examen de MH");
            }

            //si solo aplicas el if saldra por consola todas las preguntas
        }else {
            System.out.println("rango incorrecto");
        }
        System.out.println("Finalizando la evaluación");
    }

    public void ejercicio10T2(){
        teclado=new Scanner(System.in);
        System.out.println("Introduce el salario por hora:");
        int salario = teclado.nextInt();
        System.out.println("Introduce las horas trabajadas");
        int horasTrabajadas = teclado.nextInt();
        System.out.println("Has hecho horas extras");
        boolean horasExtra = teclado.nextBoolean();
        int salarioTotal=0;
        if (horasExtra){
            int numeroHorasExtra = horasTrabajadas-40;
            salarioTotal = numeroHorasExtra * (salario*2);
            salarioTotal += 40 * salario;
        }else {
            salarioTotal +=40 *salario;
            System.out.println("El salario cobrado este mes es "+salarioTotal);

        }
        teclado=null;

    }

    public void ejercicio1(){
        teclado=new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = teclado.nextInt();

        if (edad>=18){
            System.out.println("Eres mayor de edad. Puedes votar");
        }else {
            System.out.println("No eres mayor de edad. No puedes votar");
        }
        teclado=null;
    }

    public void ejercicio2(){
        teclado=new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero= teclado.nextInt();
        //CONDICION LOGICA
        if(numero==0){
            System.out.println("El numero es cero ");
        }else if(numero<0){
            System.out.println("El número es negativo");
        }else{
            System.out.println("El numero es positivo");
        }
        teclado=null;
    }

    public void ejercicio3(){
        teclado=new Scanner(System.in);
        System.out.println("Introduce tu nota:");
        double nota= teclado.nextDouble();
        //CONDICION LOGICA
        if(nota>=0&& nota<=10){
            if(nota<5){
                System.out.println("Maquina, has suspendido");
            }else if(nota>=5){
                System.out.println("!Enhorabuena! Has aprobado");
            }
        }else{
            System.out.println("Dígito inválido");
        }
        teclado=null;
    }

    public void ejercicio4(){
        teclado=new Scanner(System.in);
        System.out.println("Introduce el importe de la compra");
        double importeOriginal= teclado.nextDouble();
        double descuento = 0.0;
        double importeFinal = importeOriginal;

        if (importeOriginal>=100){
            descuento=importeOriginal*0.10;
            importeFinal=importeOriginal-descuento;
        }
        System.out.printf("Importe original: %.1f€\n",importeOriginal);
        System.out.printf("Descuento aplicado %.1f€\n",descuento);
        System.out.printf("Importe final %.1f€\n",importeFinal);

        teclado=null;
    }

    public void ejercico5(){
        teclado= new Scanner(System.in);
        System.out.println("Introduce numero;");
        int numero = teclado.nextInt();
        if(numero%2==0){
            System.out.printf("El numero %d es par\n",numero);
        }else{
            System.out.printf("El numero %d es impar\n",numero);
        }
        teclado=null;
    }

    public void ejercico6(){
        teclado=new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = teclado.nextInt();
        if(edad>16){
            System.out.println("Acceso permitido.");
        }else{
            System.out.println("Acceso denegado. Debes tener al menos 16 años.");
        }
        teclado=null;
    }

    public void ejercicio7(){
        teclado=new Scanner(System.in);
        System.out.println("Introduce tu nota");
        int nota= teclado.nextInt();
        if(nota>=0 && nota<=10){
            if(nota<5){
                System.out.println("Suspenso");
            }else if(nota<=6){
                System.out.println("Aprobado");
            }else if(nota<=8){
                System.out.println("Notable");
            }else if(nota<=10){
                System.out.println("sobresaliente");
            }
        }else{
            System.out.println("Numero invalido");
        }
        teclado=null;
    }

    public void ejercicio8(){
        teclado=new Scanner(System.in);
        System.out.println("Introduce tu peso en kg");
        double peso= teclado.nextDouble();
        System.out.println("introduce tu altura en metros");
        double metros= teclado.nextDouble();

        double imc=peso/(metros*metros);
        System.out.printf("Tu IMC es %.2f\n",imc);

        if(imc>=18.5 && imc<=24.9){
            System.out.println("Estas en peso normal");
        }else if(imc<18.5){
            System.out.println("Estas por debajo del peso normal");
        }else if(imc>24.9){
            System.out.println("Estas por encima del peso normal");
        }
        teclado=null;
    }

    public void ejercicio9(){
        teclado= new Scanner(System.in);
        System.out.println("Introduce el primer numero:");
        int numero1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero:");
        int numero2 = teclado.nextInt();
        if(numero1>numero2){
            System.out.printf("El número %d es mayor que %d ",numero1,numero2);
        }if(numero1<numero2){
            System.out.printf("El numero %d es menor que %d ",numero1,numero2);
        }if(numero1==numero2){
                System.out.printf("El numero %d es igual que %d ",numero1,numero2);
        }
        teclado=null;
    }

    public void ejercicio10(){
        teclado=new Scanner(System.in);
        System.out.println("Introduce tu altura en cm");
        double altura= teclado.nextDouble();
        if(altura<120){
            System.out.println("No puedes subir a la atracción. altura mínima 120 cm.");
        }if(altura>=120 && altura<= 200){
            System.out.println("Puedes subir, adelante máquina");
        }if(altura>200){
            System.out.println("No puedes subir a la atracción. Altura máxima 200cm.");
        }
        teclado=null;
    }

    public void ejercicio11(){
        teclado=new Scanner(System.in);
        System.out.println("Introduce el importe de la compra");
        double compra= teclado.nextDouble();
        System.out.println("¿Eres socio?: ");
        boolean socio= teclado.nextBoolean();
        System.out.println("Importe original: "+compra);

        double descuento= 0.20;
        double descuento2=0.10;
        double descuento3= 0.05;
        if(compra>=200 && socio){
            descuento=descuento*compra;
            double importeFinal = compra-descuento;
            System.out.println("Eres socio y tu compra es >= 200");
            System.out.println("Descuento aplicado (20%): "+descuento);
            System.out.println("Importe final: "+importeFinal);
        }if(compra<200 && socio){
            descuento2=descuento2*compra;
            double importeFinal = compra-descuento2;
            System.out.println("Eres socio y tu compra es <200");
            System.out.println("Descuento aplicado (10%): "+descuento2);
            System.out.println("Importe final: "+importeFinal);
        }if(compra>=300 && !socio){
            descuento3=descuento3*compra;
            double importeFinal= compra-descuento3;
            System.out.println("No eres socio y tu compra es >=300");
            System.out.println("Descuento aplicado (5%): "+descuento3);
            System.out.println("Importe final: "+importeFinal);

        } else{
            System.out.println("No tienes descuento.");
            System.out.println("Importe final: "+compra);

        }
        teclado=null;

    }
}
