public class Main {

    /* - Crea una clase coche aplicándole el principio de responsabilidad única (S). 
       - Continúa con el código extendiéndolo para aumentar su funcionalidad pero sin modificarlo 
            aplicando el principio abierto/cerrado(O).
     * - Crea subclases de la clase coche, por ejemplo un coche eléctrico, de combustible y uno híbrido 
            aplica el principio de substitución de Liskov (L), las subclases deben ser sustituibles por la superclase coche.
    */

    public static void main(String[] args) {
        
        Coche mazdaMiata = new Coche("Mazda", "Miata", "Nafta", 35000, 2007, 3, true);
        Coche bmwM3 = new Coche("BMW", "M3", "Nafta", 47500, 2019, 3, true);
        Coche fiatUno = new Coche("Fiat", "Uno", "Nafta", 7000, 2022, 5, false);
        Camion volvoBern = new Camion("Volvo", "Ber", "Diesel", 75000, 2023, 2, 9000, true, false);

    //     System.out.println(mazdaMiata);
    //     System.out.println(bmwM3);
    //     System.out.println(fiatUno);
    //     System.out.println(volvoBern);

    //     volvoBern.engancharRemolque();
    //     System.out.println(volvoBern);
        System.out.println(mazdaMiata.getMarca()); 
    }
}
