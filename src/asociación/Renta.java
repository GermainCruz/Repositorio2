package asociación;

import javax.swing.JOptionPane;

public class Renta {
    private double costoMensual;
    private double duraciónMeses;
    private Persona arrendatario;
    private Inmueble bienInmuebleEnRenta;

    public Renta() {
    }

    public Renta(double costoMensual, double duraciónMeses) {
        this.costoMensual = costoMensual;
        this.duraciónMeses = duraciónMeses;
    }

    public double getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(double costoMensual) {
        this.costoMensual = costoMensual;
    }

    public double getDuraciónMeses() {
        return duraciónMeses;
    }

    public void setDuraciónMeses(double duraciónMeses) {
        this.duraciónMeses = duraciónMeses;
    }

    public Persona getArrendatario() {
        return arrendatario;
    }

    public void setArrendatario(Persona arrendatario) {
        this.arrendatario = arrendatario;
    }

    public Inmueble getBienInmuebleEnRenta() {
        return bienInmuebleEnRenta;
    }

    public void setBienInmuebleEnRenta(Inmueble bienInmuebleEnRenta) {
        this.bienInmuebleEnRenta = bienInmuebleEnRenta;
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null, "Nombre: "+ arrendatario.getNombre()+
               "\nCalle: " + bienInmuebleEnRenta.getCalle()+
               "\nNúmero: "+bienInmuebleEnRenta.getNúmero()+
               "\nCosto Mensual: " + costoMensual + 
               "\nDuración (meses): " + duraciónMeses,"Datos",JOptionPane.INFORMATION_MESSAGE);
    }
}
