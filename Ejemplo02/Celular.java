package Ejemplo02;

public class Celular {

    private String marca;
    private int anio;

    public Celular(String marca, int anio) {
        this.marca = marca;
        this.anio = anio;
    }

    @Override
    public String toString()
    {
        return "MERCADO("  +  "marca= " + marca + ", año= " + anio +")";
    }
}
