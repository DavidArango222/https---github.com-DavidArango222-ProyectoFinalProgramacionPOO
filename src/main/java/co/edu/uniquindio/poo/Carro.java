package co.edu.uniquindio.poo;
import java.time.LocalDateTime;

class Carro extends Vehiculo {
    public Carro(String placa, String modelo, String propietario, LocalDateTime fechaEntrada) {
        super(placa, modelo, propietario, fechaEntrada);
    }
    
    public Carro(String placa, String modelo, String propietario, LocalDateTime fechaEntrada, LocalDateTime fechaSalida) {
        super(placa, modelo, propietario, fechaEntrada, fechaSalida);
    }
    
    
}