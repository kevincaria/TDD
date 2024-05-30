package test.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BicicletaTest {

    @Test 
    public void puedeCargar() {
        Bicicleta bicicleta = new Bicicleta();

        assertTrue(bicicleta.puedeCargar(0.0625, 7.5)); // Puede cargar un paquete de 0.0625 m3 y 7.5 kg
        bicicleta.cargar(0.0625, 7.5); // Cargamos un paquete
        assertTrue(bicicleta.puedeCargar(0.0625, 7.5)); // Aún puede cargar otro paquete de 0.0625 m3 y 7.5 kg
        bicicleta.cargar(0.0625, 7.5); // Cargamos otro paquete
        assertFalse(bicicleta.puedeCargar(0.0625, 7.5)); // Ya no puede cargar más paquetes
        assertFalse(bicicleta.puedeCargar(0.063, 7.5)); // No puede cargar un paquete de 0.063 m3 y 7.5 kg
        assertFalse(bicicleta.puedeCargar(0.0625, 7.6)); // No puede cargar un paquete de 0.0625 m3 y 7.6 kg
    }
}
