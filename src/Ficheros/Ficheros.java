package Ficheros;
import java.io.*;  //paquete para los ficheros
public class Ficheros {
    
    public void escritura(){
        try{
            FileWriter archivo = new FileWriter("Documento.txt");
            BufferedWriter flujo = new BufferedWriter(archivo);
            PrintWriter escribir = new PrintWriter(flujo);
            escribir.println("Hola, escrito");
            escribir.flush();
        }catch(Exception ex){
            System.out.println("No se puede escribir "+ ex.getMessage());
        }  
        
    }
    
    public static void main(String[] args) {
       Ficheros fichero = new Ficheros();
       fichero.escritura();
    }
    
}
