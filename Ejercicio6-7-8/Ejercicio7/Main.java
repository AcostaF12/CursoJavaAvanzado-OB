public class Main {
    
    public static void main(String[] args) {
        Singleton miApp = Singleton.getInstance();
        miApp.setNumeroIdentificacion(1630);

        Singleton miApp2 = Singleton.getInstance();
        System.out.println("El numero de identificacion es: " + miApp2.getNumeroIdentificacion());
    }
}
