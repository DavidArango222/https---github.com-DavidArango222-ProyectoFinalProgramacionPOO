package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

 
public class TestMoto {

     
    @Test
    public void crearMoto() {
        LocalDateTime fechaEntrada = LocalDateTime.of(2024, 5, 2, 8, 0);
        Moto moto = new Moto("HOLACO", "Honda", "Samuel", fechaEntrada, 200, TipoMoto.CLASICA);

        assertEquals("HOLACO", moto.getPlaca());
        assertEquals("Honda", moto.getModelo());
        assertEquals("Samuel}", moto.getPropietario());
        assertEquals(fechaEntrada, moto.getFechaEntrada());
        assertEquals(200, moto.getVelocidadMaxima());
        assertEquals(TipoMoto.CLASICA, moto.getTipo());
    }
    
    @Test
    public void crearMotoConFechaEntrada() {
        LocalDateTime fechaEntrada = LocalDateTime.of(2024, 5, 2, 8, 0);
        Moto moto = new Moto("APC56C", "BIWIS", "Felipe", fechaEntrada, 125, TipoMoto.CLASICA);

        assertEquals("APC56C", moto.getPlaca());
        assertEquals("BIWIS", moto.getModelo());
        assertEquals("Felipe", moto.getPropietario());
        assertEquals(fechaEntrada, moto.getFechaEntrada());
        assertEquals(125, moto.getVelocidadMaxima());
        assertEquals(TipoMoto.CLASICA, moto.getTipo());
    }

    // Prueba la creación de una moto con fecha de entrada y salida.
     
    @Test
    public void crearMotoConFechaSalida() {
        LocalDateTime fechaEntrada = LocalDateTime.of(2024, 5, 2, 8, 0);
        LocalDateTime fechaSalida = LocalDateTime.of(2024, 5, 21, 16, 0);
        Moto moto = new Moto("LMN456", "BIWIS", "Felipe", fechaEntrada, fechaSalida, 125, TipoMoto.HIBRIDA);

        assertEquals("LMN456", moto.getPlaca());
        assertEquals("BIWIS", moto.getModelo());
        assertEquals("Felipe", moto.getPropietario());
        assertEquals(fechaEntrada, moto.getFechaEntrada());
        assertEquals(fechaSalida, moto.getFechaSalida());
        assertEquals(125, moto.getVelocidadMaxima());
        assertEquals(TipoMoto.HIBRIDA, moto.getTipo());
    }


     
    @Test
    public void establecerFechaSalidaMoto() {
        LocalDateTime fechaEntrada = LocalDateTime.of(2024, 5, 2, 8, 0);
        Moto moto = new Moto("TUV987", "BIWIS", "Felipe", fechaEntrada, 125, TipoMoto.CLASICA);

        LocalDateTime fechaSalida = LocalDateTime.of(2024, 5, 21, 16, 0);
        moto.setFechaSalida(fechaSalida);

        assertEquals(fechaSalida, moto.getFechaSalida());
    }
}
