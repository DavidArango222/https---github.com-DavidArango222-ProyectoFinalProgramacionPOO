package co.edu.uniquindio.poo;
import java.util.ArrayList;
import java.util.List;


public class Registro  {
    private final List<Vehiculo> vehiculosRegistrados;

    public Registro() {
        vehiculosRegistrados = new ArrayList<>();
    }

    // Método para registrar vehiculo
    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculosRegistrados.add(vehiculo);
    }

    // Método para obtener los vehiculos
    public List<Vehiculo> getVehiculosRegistrados() {
        return vehiculosRegistrados;
    }
}
