package n3exercici1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MesosTest {

//    Verifica amb jUnit que la llista té 12 posicions, que no és nul·la i que en la seva posició 8 conté el nom 'agost'.
    @Test
    void comprobarMesos(){
        Mesos mesos = new Mesos();
        System.out.println(mesos.getMesos().get(7));
        assertEquals("Agost", mesos.getMesos().get(7));
        System.out.println(mesos.getMesos().size());
        assertEquals(12,mesos.getMesos().size());
        assertNotNull(mesos);
    }

}