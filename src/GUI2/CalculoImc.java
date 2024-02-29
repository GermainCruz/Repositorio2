package GUI2;
public class CalculoImc {
    public static float calculoImc(float altura, float peso){
        float resultado = peso/(float)Math.pow(altura, 2);
        return resultado;
    }
}
