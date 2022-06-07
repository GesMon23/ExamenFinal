
package Examen;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class Ficheros {
    String nombre;
    Scanner ingresar=new Scanner(System.in);
    public void PedirFichero(){
        int opc;
        System.out.println("Desea cargar un Fichero de datos? \n1.Si\n2.No");
        opc=ingresar.nextInt();
        if(opc==1){
            System.out.println("Ingrese el Nombre del archivo");
            
        }
        else{
            if(opc==2){
                System.out.println("Ingrese El Nombre con el que desea Guardar el Archivo");
            }
        }
        nombre = ingresar.nextLine();
        nombre = ingresar.nextLine();
    }
    public void GuardarDatos (int Notas[],String Clases[],int Promedio,String Mensaje[]){
        try{
            String NomDoc=nombre;
            String ruta="D:\\Documentos\\U\\Tercer Semestre\\Programación I\\Examen Final\\"+NomDoc+".txt";
            String separador = "*********************************************************\n";
            File doc = new File(ruta);
            if(!doc.exists()){
                doc.createNewFile();
            }
            FileWriter fw = new FileWriter(doc);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i=0;i<3;i++){
                bw.write("Curso: "+Clases[i]+"\tNota:"+Notas[i]+"\n");
            }
            bw.write("Promedio: "+Promedio+"\n");
            for(int i=0;i<2;i++){
                    bw.write(Mensaje[i]+"\n");
            }
            bw.write(separador);
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
