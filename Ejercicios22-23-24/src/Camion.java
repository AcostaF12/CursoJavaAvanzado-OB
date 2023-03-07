public class Camion extends Vehiculo {
    
    int capacidadCarga;
    boolean puedeRemolcar;
    boolean tieneRemolque;

    public Camion(String marca, String modelo, String tipoCombustible, int valor, 
                    int añoModelo, int puertas, int capacidadCarga, boolean puedeRemolcar, boolean tieneRemolque) {
        super(marca, modelo, tipoCombustible, valor, añoModelo, puertas);
        this.capacidadCarga = capacidadCarga;
        this.puedeRemolcar = puedeRemolcar;
        this.tieneRemolque = tieneRemolque;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public boolean isPuedeRemolcar() {
        return puedeRemolcar;
    }

    public void engancharRemolque() {
        this.tieneRemolque = true;
    }

    public void desengancharRemolque() {
        this.tieneRemolque = false;
    }
}
