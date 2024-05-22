package co.edu.uniquindio.poo;

import java.time.LocalDateTime;


public class Vehiculo {
    private String placa;
    private String modelo;
    private String propietario;
    private LocalDateTime fechaEntrada;
    private LocalDateTime fechaSalida;

    //Constructor
    public Vehiculo(String placa, String modelo, String propietario, LocalDateTime fechaEntrada) {
        this.placa = placa;
        this.modelo = modelo;
        this.propietario = propietario;
        this.fechaEntrada = fechaEntrada;
    }

    // Constructor con salida
    public Vehiculo(String placa, String modelo, String propietario, LocalDateTime fechaEntrada, LocalDateTime fechaSalida) {
        this(placa, modelo, propietario, fechaEntrada);
        this.fechaSalida = fechaSalida;
    }



    // Gets y Sets
    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPropietario() {
        return propietario;
    }

    public LocalDateTime getFechaEntrada() {
        return fechaEntrada;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
}
