
package Examen;
import java.util.Scanner;
public class Funciones {
    int Notas[]= new int[3];{
    }
    int SumNotas, Promedio;
    String Clases[]= new String[3];{
        Clases[0]= "Programacion";
        Clases[1]= "Algoritmos";
        Clases[2]= "Logica De Sistemas";
    }
    String Mensaje[]=new String[2];{
    }
    Scanner ingresar = new Scanner(System.in);
    Ficheros fichero = new Ficheros();
    public void IngresoNotas(){
        System.out.println("BIENVENIDO AL SISTEMA DE INGRESO DE NOTAS");
        for(int i=0;i<3;i++){
            System.out.println("Ingresa la Nota del curso: "+Clases[i]);
            Notas[i]= ingresar.nextInt();
            System.out.println(" ");
        }
    } 
    public void NotaAlta(){
        if(Notas[0]>Notas[1]&&Notas[0]>Notas[2]){
            Mensaje[0]=("La Nota más Alta es: "+Notas[0]+" del Curso: "+Clases[0]);
        }
        else{
            if(Notas[1]>Notas[0]&&Notas[1]>Notas[2]){
                Mensaje[0]=("La Nota más Alta es: "+Notas[1]+" del Curso: "+Clases[1]);
            }
            else{
                if(Notas[2]>Notas[0]&&Notas[2]>Notas[1]){
                    Mensaje[0]=("La Nota más Alta es: "+Notas[1]+" del Curso: "+Clases[1]);
                }
            }
        }
        System.out.println(Mensaje[0]);
    }
    public void Promedio(){
        for(int i=0;i<3;i++){
            SumNotas+=Notas[i];
        }
        Promedio=SumNotas/3;
        System.out.println("El Promedio Final de los Cursos es: "+Promedio);
    }
    public void Promovido(){
        if(Notas[0]>=61 && Notas[1]>=61 && Notas[2]>=61){
            Mensaje[1]=("FELICIDADES, TIENE LOS CREDITOS NECESARIOS PARA SER PROMOVIDO \n");
        }
        else{
            Mensaje[1]=("NO TIENE LOS CREDITOS NECESARIOS PARA SER PROMOVIDO \n");
        }
        System.out.println(Mensaje[1]);
    }
}
