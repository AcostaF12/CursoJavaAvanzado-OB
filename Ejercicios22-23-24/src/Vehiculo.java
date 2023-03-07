abstract class Vehiculo {

    String marca;
    String modelo;
    String tipoCombustible;
    int valor;
    int añoModelo;
    int puertas;

    public Vehiculo(String marca, String modelo, String tipoCombustible, int valor, int añoModelo, int puertas) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustible = tipoCombustible;
        this.valor = valor;
        this.añoModelo = añoModelo;
        this.puertas = puertas;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public int getValor() {
        return valor;
    }

    public int getAñoModelo() {
        return añoModelo;
    }

    public int getPuertas() {
        return puertas;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", tipoCombustible=" + tipoCombustible + ", valor="
                + valor + ", añoModelo=" + añoModelo + ", puertas=" + puertas + "]";
    }
}
