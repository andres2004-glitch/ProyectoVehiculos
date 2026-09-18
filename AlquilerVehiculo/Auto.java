public class Auto extends Vehiculo {

    // Constructor
    public Auto(String marca, String modelo, int tarifaBase) {
        super(marca, modelo, tarifaBase);
    }

    // Implementación del método abstracto

    @Override
    public double calcularCostoAlquiler(int dias) {
        return getTarifaBase() * dias;
    }
    
}
