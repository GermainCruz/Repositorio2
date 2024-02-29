package Ficheros;
import java.io.*;  //Librería necesaria para los ficheros
public class Ficheros2 {
    public static void main(String[] args) {
        String MsjeAEscribir = "Esta frase tiene que escribirse y después leerse";
        String MsjeLeido = "";
        try{
            FileWriter fichero = new FileWriter("CursoBasicoJAVA.txt");  //Escritor de archivos
            fichero.write(MsjeAEscribir);
            fichero.write("\nHola soy Chiro");
            fichero.close();    // IMPORTANTE!!!  Se cierra el fichero
            
        }catch (Exception ex){
            ex.printStackTrace();
        }
        
        try{
            FileReader lector = new FileReader("CursoBasicoJAVA.txt");   //Lector de Archivos
            BufferedReader BR = new BufferedReader(lector);   //Almacenamiento de la lectura
                                                                //Lector almacenado en búfer
            MsjeLeido = BR.readLine();
            
        }catch (Exception ex){
            ex.printStackTrace();
        }
        
        System.out.println("El mensaje guardado en el texto es: \n"+MsjeLeido);
    }
    
}
