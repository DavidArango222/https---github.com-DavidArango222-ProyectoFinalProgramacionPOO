package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;


public class TestCarro {

    
    @Test
    public void crearCarro() {
        LocalDateTime fechaEntrada = LocalDateTime.of(2024, 6, 20, 9, 0);
        Carro carro = new Carro("HOLACO", "Fz 250", "Andres", fechaEntrada);

        assertEquals("HOLACO", carro.getPlaca());
        assertEquals("Fz 250", carro.getModelo());
        assertEquals("Andres", carro.getPropietario());
        assertEquals(fechaEntrada, carro.getFechaEntrada());
        assertNull(carro.getFechaSalida());
    }

    
    @Test
    public void crearCarroConFechaSalida() {
        LocalDateTime fechaEntrada = LocalDateTime.of(2024, 6, 20, 9, 0);
        LocalDateTime fechaSalida = LocalDateTime.of(2024, 6, 20, 14, 0);
        Carro carro = new Carro("HOLACO", "Chevrolet", "Jose", fechaEntrada, fechaSalida);

        assertEquals("HOLACO", carro.getPlaca());
        assertEquals("Chevrolet", carro.getModelo());
        assertEquals("Jose", carro.getPropietario());
        assertEquals(fechaEntrada, carro.getFechaEntrada());
        assertEquals(fechaSalida, carro.getFechaSalida());
    }

    
    @Test
    public void crearCarroConFechaEntrada() {
        LocalDateTime fechaEntrada = LocalDateTime.of(2024, 6, 20, 9, 0);
        Carro carro = new Carro("HOLACO", "Audi", "Fernando", fechaEntrada);

        assertEquals("HOLACO", carro.getPlaca());
        assertEquals("Audi", carro.getModelo());
        assertEquals("Fernando", carro.getPropietario());
        assertEquals(fechaEntrada, carro.getFechaEntrada());
    }

    
    // test de fecha de salida
     
    @Test
    public void establecerFechaSalidaCarro() {
        LocalDateTime fechaEntrada = LocalDateTime.of(2024, 7, 22, 9, 0);
        Carro carro = new Carro("HOLACO", "Renold", "Maria", fechaEntrada);

        LocalDateTime fechaSalida = LocalDateTime.of(2024, 7, 22, 17, 0);
        carro.setFechaSalida(fechaSalida);

        assertEquals(fechaSalida, carro.getFechaSalida());
    }
}
