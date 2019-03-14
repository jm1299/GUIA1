package guia1;

import javax.swing.JOptionPane;

public class Entrada {

    private int entero,resultado;
    private double decimal;

    public Entrada() {
    }

    public Entrada(int entero, double decimal) {
        for (int i = 0; i < 10; i++) {
            entero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero ENTERO #" + (i + 1)));
            decimal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero DECIMAL #" + (i + 1)));
            resultado+=Math.pow(entero, decimal);
            JOptionPane.showMessageDialog(null, "DATOS # " + (i + 1) + "\nLa base es: " + entero + "\nEl exponente es: " + decimal
                    + "\nEl resultado es: " + Math.pow(entero, decimal));
            
        }
        JOptionPane.showMessageDialog(null, "La suma total es: "+resultado);
        this.entero = entero;
        this.decimal = decimal;

    }

    public int getEntero() {
        return entero;
    }

    public double getDecimal() {
        return decimal;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }

}
