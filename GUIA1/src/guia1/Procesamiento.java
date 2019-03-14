package guia1;

public class Procesamiento extends Entrada {

    double resultado;

    public Procesamiento() {
    }

    public Procesamiento(int entero, double decimal, double resultado) {
        super(entero, decimal);
        this.resultado = resultado;
    }

    public double getResultado() {
        resultado = Math.pow(getEntero(), getDecimal());
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

}
