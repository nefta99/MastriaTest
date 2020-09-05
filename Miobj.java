import  java.io.*;
public class Miobj{
   
    
    
    public static void main(String[] args)
    {
        /*Lo arreglos se almacen con logica es decir, cero ese el primer elemento
        System.out.println("String[0] = "+args[0] +" ; String[1] = " + args[1]);
        */
        //obtener el objeto desde consola
        Console cmd = System.console();
        //Lee la lina de la consola y almaceno en variable nombre
        String textoNonbre = cmd.readLine("ingresa Nombre: ");
        //Lee la lina de la consola y almaceno en variable nombre
        String textoApellido = cmd.readLine("ingresa Apellido: ");
        System.out.println("El nombre es  "+textoNonbre +" el Apellido "+textoApellido);
        
        
    }
}