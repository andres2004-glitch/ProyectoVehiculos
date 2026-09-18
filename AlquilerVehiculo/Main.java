public class Main {

    public static void main(String[] args) {

        
        Vehiculo auto = new Auto(
                "Toyota",
                "Corolla",
                100000
        );

        
        Vehiculo moto = new Moto(
                "Honda",
                "CB190",
                50000
        );

        
        int dias = 3;

       
        System.out.println("===== AUTO =====");
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Modelo: " + auto.getModelo());
        System.out.println("Tarifa base: $" + auto.getTarifaBase());
        System.out.println("Días de alquiler: " + dias);
        System.out.println(
                "Costo total: $" + auto.calcularCostoAlquiler(dias)
        );

        System.out.println();

        
        System.out.println("===== MOTO =====");
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Tarifa base: $" + moto.getTarifaBase());
        System.out.println("Días de alquiler: " + dias);
        System.out.println(
                "Costo total: $" + moto.calcularCostoAlquiler(dias)
        );
    }
}