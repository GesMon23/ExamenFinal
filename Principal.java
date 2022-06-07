
package Examen;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args){
        int opcion=0;
        Scanner ingresar = new Scanner(System.in);
        Funciones funcion = new Funciones();
        Ficheros fichero = new Ficheros();
        System.out.println("BIENVENIDO AL SISTEMA DE NOTAS DE LA UNIVERSIDAD");
        fichero.PedirFichero();
        while(opcion!=5){
            System.out.println("Ingrese la Opcion que Desea Realizar");
            System.out.println("1.[Ingresar] Notas");
            System.out.println("2.[Mostrar] La Nota Mas Alta");
            System.out.println("3.[Calcular] El promedio del Estudiante");
            System.out.println("4.Saber Si esta [Promovido]");
            System.out.println("5.Salir Del Menu");
            opcion=ingresar.nextInt();
            switch(opcion){
                case 1:
                    funcion.IngresoNotas();
                    break;
                case 2:
                    funcion.NotaAlta();
                    break;
                case 3:
                    funcion.Promedio();
                    break;
                case 4:
                    funcion.Promovido();
                    fichero.GuardarDatos(funcion.Notas, funcion.Clases, funcion.SumNotas, funcion.Mensaje);
            }
        }
        
    }
}
