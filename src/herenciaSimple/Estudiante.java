package herenciaSimple;

import java.util.Date;

public class Estudiante extends Persona{
    //Atributos
    private int NumeroCarnet;
    
    //Constructor sin argumentos
    public Estudiante() {
        super(); //Llamado al constructor del padre
        this.NumeroCarnet = 0;
    }
    
    //Constructor con argumentos
    public Estudiante(int id, int tipoID, String nombre, String apellidos, String nacimiento, char genero, String tipoSangre, double peso, double estatura, int numeroCarnet){
        super(id,tipoID,nombre,apellidos,nacimiento,genero,tipoSangre,peso,estatura);
        this.NumeroCarnet = NumeroCarnet;
    }
    
    //Constructor Copia
    public Estudiante(Estudiante est){
        super(est);
        this.NumeroCarnet = est.NumeroCarnet;
    }    

    public int getNumeroCarnet() {
        return NumeroCarnet;
    }

    public void setNumeroCarnet(int NumeroCarnet) {
        this.NumeroCarnet = NumeroCarnet;
    }
    
    
    
}
