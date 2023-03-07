public class Coche extends Vehiculo {

    boolean esDeportivo;

    public Coche(String marca, String modelo, String tipoCombustible, int valor, int añoModelo, 
                int puertas, boolean esDeportivo) {
        super(marca, modelo, tipoCombustible, valor, añoModelo, puertas);
        this.esDeportivo = esDeportivo;
    }
    public boolean getesDeportivo() {
        return esDeportivo;
    }
}
