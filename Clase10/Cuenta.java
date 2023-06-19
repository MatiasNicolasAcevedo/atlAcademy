package Clase10;

public class Cuenta {

    private Persona titular;
    private Double cantidad;

    public Cuenta() {
    }

    public Cuenta(Persona titular, Double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrar() {
        System.out.println("Cuenta: Titular= " + titular + " , Cantidad= " + cantidad);
    }

    public void ingresar(Double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    public void retirar(Double cantidad) {
        this.cantidad -= cantidad;
    }
}
