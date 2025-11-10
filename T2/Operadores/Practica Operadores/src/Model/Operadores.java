package Model;

import java.util.Scanner;

public class Operadores {
   //SCANNER GLOBAL PARA QUE SE PUEDA USAR EN OTROS BLOQUES Y CERRARLO AL FINAL
    Scanner scanner;
    public void operadoresAritmeticos(){
        System.out.println("Explicacion de los operadoes aritmeticos");
        //1.UNARIO--> solo necesita un operando
        int operando = 25;
        //operando++;
        //operando++;
        System.out.println("La suma unaria es "+operando);

        //2.Binario
        int operando2 =10;


        //SUMA
        int suma= operando+operando2;
        System.out.println("La suma de los dos operandos es: "+suma);

        //RESTA
        int resta = operando-operando2;
        System.out.println("El resultado de la resta es "+resta);

        //DIVISION
        //Division entera
        double division = operando/operando2;
        System.out.printf("EL resultado de la division es %.2f",division);
        //Division real
        //pasar uno de los operando int temporalmente a double para eso exite el CASTEO:
        //CASTEO
        double divisionReal= (double)operando/operando2;
        System.out.printf("Esta es la division real conviertiendo uan variable a otra TEMPORALMENTE %.2f",divisionReal);
        //MODULO
        int modulo= operando%2; /*resto de la division, (sirve tambien para saber si el numero es par operador
        %2*/
        System.out.println(modulo);
        //Concatenar numeros en un Spring
        System.out.println("Esto es una concatenacion de numero "+operando+operando2);
        //Para hacer la operación
        System.out.println("Aqui calcula los numero "+(operando2+operando2));//No puedes poner un"-" en la concatenacion



    }
    public void operadoresAsignacion(){
        int operadorUno=6;
        //operadorUno=operadorUno+6;
        //PARA MAYOR LIMPIEZA DE CODIGO LO RECOMENADABLE ES:
        operadorUno +=6;
        operadorUno-=6;
        operadorUno*=6;
        operadorUno/=7;
        operadorUno &=12;
        System.out.println("Así nos ahorramos más código "+operadorUno);
    }
    public void operadoresRelacionales(){
    //COMPARAN DOS VARIABLES. EL RESULTADO DE LA COMPARACION ES UN BOOLEAN: TRUE/FALSE
         /* UN NUMERO SE PUEDE COMPARAR ASI;
        OP1 >= OP2 -> me da como resultado true si el op1 es mas grande o igual que el op2 -> gte
		OP1 < OP2 -> me da como resultado true si el op1 es mas pequeño que el op2 -> lt
		OP1 <= OP2 -> me da como resultado true si el op1 es mas pequeño o igual que el op2 -> lte
		OP1 == OP2 -> me da como resultado true si el op1 es igual que el op2 -> eq
		OP1 != OP2 -> me da como resultado true si el op1 diferente que el op2 -> ne
         */
        int numeroUno= 5;
        int numeroDos= 10;
        boolean resultado= numeroUno>numeroDos;
        System.out.println("La comparación de este numero es "+resultado);
        resultado= numeroUno<numeroDos;
        System.out.println("La comparación de este numero es "+resultado);
        resultado= numeroUno==numeroDos;
        System.out.println("La comparación de este numero es "+resultado);
        resultado= numeroUno!=numeroDos;
        System.out.println("La comparación de este numero es "+resultado);
        resultado= numeroUno>=numeroDos;
        System.out.println("La comparación de este numero es "+resultado);

    }
    public void operadoresLogicos(){
        //Logicos dan resultados un booleano varias comparaciones
        // AND---> se expresa en &&(ampersan)
        //OR ---> se expresa en ||
        //NOT ---> se expresa en ! delante de la variable por ejemplo : !resultadoLogicoAND

        int numeroUno = 10;
        int numeroDos = 5;
        int numeroTres = 6;

        boolean resultadoLogicoAND =numeroUno>5 && numeroUno==numeroDos && numeroTres !=0;
        System.out.println("El resultado logico de AND es "+resultadoLogicoAND);




    }
    //INTRODUCIR SCANNER
    public void evaluarCandidatos(){
        scanner = new Scanner(System.in);//VARIABLE PARA INTRODUCIR COSAS DEL TECLADO
        System.out.println("Dime tu nombre y apellidos");
        String nombreApelldio= scanner.nextLine();// APLICO EL NOMBRE QUE LE HEMOS ASIGNADO "scanner" de la variable compleja
        System.out.println("Dime tu edad");
        int edad= scanner.nextInt();
        System.out.println("salario");
        int salario=scanner.nextInt();
        System.out.println("Dime tu altura");
        double altura =scanner.nextDouble();
        System.out.println("¿Tienes experiencia?");
        boolean tienesExperiencia = scanner.nextBoolean();

        //EVALUAR CANDIDATO edad inferio a 40 sueldo 50000 y experiencia
        boolean resultadoCandidato = edad<40 && salario <= 50000 && tienesExperiencia;
        System.out.println("El resultado de la evaluacion es que el candidato es "+resultadoCandidato);
        scanner.close();
    }

    //EJEMPLO DE PORQUE SE PONE VOID EN LOS METODOS
    public int multiplicacion(int op1,int op2){
        //SI EN LUGAR DE PONER VOID PONER UN "INT" "STRING" ETC TE VA A PEDIR UN RETORNO DE LO QUE ESTAS PIDIDENDO
        int resultado= op1*op2;
        System.out.println(resultado);//ESTO SOLO MUESTRA LA IMPRESIÓN PERO NO RETORNA NADA AL PONER "VOID"
        //PARA RETORNAR LO QUE SE PIDE SE PONE PALABRA "RETURN" AL FINAL DEL METODO ULTIMA LINEA
        return 1;// con ese resultado que de se pued eemplear para mas( el resultado de la multplicacion ese numero podra usarse)

    }

    /*PASOS PARA REALIZAR UN EJERCICIO
    1-PEDIR COSAS POR TECLADO
    2- GUARDAR COSAS EN VARIABLES
    3-REALIZAR CALCULOS
    4-MOSTRAR INFORMACIÓN
     */


}
