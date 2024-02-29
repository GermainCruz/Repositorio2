package herenciaSimple;

import java.util.Date;

public class Persona {
    
    //Atributos
    private int id;
    private int tipoID;
    private String nombre;
    private String apellidos;
    private String nacimiento;
    private char genero;
    private String tipoSangre;
    private double peso;
    private double estatura;
    
    //Constantes para establecer el tipo de ID
    static final int SIN_REGISTRAR = 0;
    static final int REGISTRO_CIVIL = 1;
    static final int TARJETA_IDENTIDAD = 2;
    static final int CEDULA_CIUDADANIA = 3;
    static final int PASAPORTE = 4;
    static final int CEDULA_EXTRANJERA = 5;
    
    //Constructor sin argumentos
    public Persona() {
        this.id = 0;
        this.tipoID = SIN_REGISTRAR;
        this.nombre = "";
        this.apellidos = "";
        this.nacimiento = null;
        this.genero = ' ';
        this.tipoSangre = "";
        this.peso = 0.0;
        this.estatura = 0.0;            
    }
    
    
    //Constructor con argumentos
    public Persona(int id, int tipoID, String nombre, String apellidos, String nacimiento, char genero, String tipoSangre, double peso, double estatura) {
        this.id = id;
        this.tipoID = tipoID;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacimiento = nacimiento;
        this.genero = genero;
        this.tipoSangre = tipoSangre;
        this.peso = peso;
        this.estatura = estatura;
    }
    
    //Constructor copia
    public Persona(Persona per) {
        this.id = per.id;
        this.tipoID = per.tipoID;
        this.nombre = per.nombre;
        this.apellidos = per.apellidos;
        this.nacimiento = per.nacimiento;
        this.genero = per.genero;
        this.tipoSangre = per.tipoSangre;
        this.peso = per.peso;
        this.estatura = per.estatura;
    }    
    
    //Métodos getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipoID() {
        return tipoID;
    }

    public void setTipoID(int tipoID) {
        this.tipoID = tipoID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
}
