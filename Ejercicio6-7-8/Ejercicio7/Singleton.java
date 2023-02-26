public class Singleton {
    
    private static Singleton instancia;
    public int numeroIdentificacion;

    private Singleton() { }

    public static Singleton getInstance() {
        if (instancia == null) {
            instancia = new Singleton();
        }

        return instancia;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }
}
