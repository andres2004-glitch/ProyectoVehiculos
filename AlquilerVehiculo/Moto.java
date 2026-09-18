public class Moto extends Vehiculo {

    // Constructor
    public Moto(String marca, String modelo, double tarifaBase) {
        super(marca, modelo, tarifaBase);
    }

    // Implementación del método abstracto

    @Override
    public double calcularCostoAlquiler(int dias) {
        return getTarifaBase() * dias;
    }
    
}