package asociación;
public class Inmueble {
    private String calle;
    private int número;

    public Inmueble() {
    }

    public Inmueble(String calle, int número) {
        this.calle = calle;
        this.número = número;
    }

    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNúmero() {
        return número;
    }
    public void setNúmero(int número) {
        this.número = número;
    }

    @Override
    public String toString() {
        return "Calle: " + calle + 
               "\nNúmero: " + número;
    }
    
    
}
