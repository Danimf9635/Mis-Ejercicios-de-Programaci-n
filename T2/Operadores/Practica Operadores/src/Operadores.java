public class Operadores {

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
    public void operadoresComparacion(){
        //COMPARAN DOS VARIABLES. EL RESULTADO DE LA COMPARACION ES UN BOOLEAN: TRUE/FALSE
        /* UN NUMERO SE PUEDE COMPARAR ASI;
        OP1>OP2
        OP1<OP2
        OP1>=OP2
        OP1<=OP2
        OP1==OP2
        OP1!=OP2---> SE EXPRESA SI ES DIFERENTE
         */
        
    }
}
