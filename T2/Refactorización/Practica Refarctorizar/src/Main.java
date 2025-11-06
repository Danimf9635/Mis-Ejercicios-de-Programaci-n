/*APUNTES PROGRAMACIÓN
        CLASE DEL 10/10/2025
        Refactorización:
        Ahorrarnos líneas de código mediante métodos en otra clase que
        se forman como un bloque para ejecutarlas en la clase principal que es la del “main”.
 */

//Se importa desde otro paquete que se ha creado para acceder a la clase


import Model.Operaciones;

public class Main {

    static void main() {
        //Se llama desde otra clase para ejecutarla en la del main
        Operaciones operaciones= new Operaciones();/*Se llama objeto y Se ha creado  una variable compleja llamada "Operaciones"
        para poder acceder a la  clase Operaciones que a su vez se ha creado dos metodos:
        public.void sumar(int op1, int op2)
        public.void restar(int op1, int op2)*/
        operaciones.sumar(2,4);         //esto es un intermediario
        operaciones.restar(5,6);

    saludar("Manuel ",2);
    saludar("Gerardo ", 3);
    }

    static void saludar(String nombre, int numero){
        System.out.println("Hola "+nombre+","+numero);
        System.out.println("Que tal estas");
        System.out.println("¿Como te ha ido?");

    }
}
