package Ejercicio8;
public class Profesor extends Persona{
    private float salario;
    private boolean fijo;

    public Profesor() {
    }

    public Profesor(float salario, boolean fijo, String dni, String nombre) {
        super(dni, nombre);
        this.salario = salario;
        this.fijo = fijo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public boolean isFijo() {
        return fijo;
    }

    public void setFijo(boolean fijo) {
        this.fijo = fijo;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSalario: "+salario+"\nFijo: " + fijo ;
    }
    
    public float calcularSalario (float retencionIRPF, int antiguedad){
        return salario -  (salario*retencionIRPF/100) + (antiguedad*50);
    }
}
