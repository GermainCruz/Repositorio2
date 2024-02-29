package GUI3;

public class Persona {
    private String nombre;
    private String correo;
    private String telefono;

    public Persona() {
    }

    public Persona(String nombre, String correo, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + 
               "\nCorreo=" + correo + 
               "\nTeléfono=" + telefono;
    }
    
    
}
