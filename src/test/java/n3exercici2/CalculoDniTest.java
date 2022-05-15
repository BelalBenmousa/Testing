package n3exercici2;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculoDniTest extends TestCase {


    @Test
    public void testGetNumero() {

        CalculoDni calculoDni = new CalculoDni(54572028);
        CalculoDni calculoDni1 = new CalculoDni(45878963);
        CalculoDni calculoDni2 = new CalculoDni(54572258);
        CalculoDni calculoDni3 = new CalculoDni(54573254);
        CalculoDni calculoDni4 = new CalculoDni(54572029);
        CalculoDni calculoDni5 = new CalculoDni(54572030);
        CalculoDni calculoDni6 = new CalculoDni(44572028);
        CalculoDni calculoDni7 = new CalculoDni(54602028);
        CalculoDni calculoDni8 = new CalculoDni(54852028);
        CalculoDni calculoDni9 = new CalculoDni(54573008);

        final char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int resto;
        resto = calculoDni.getNumero() % 23;
        System.out.println("DNI complert: " +calculoDni.getNumero()+letras[resto]);
        assertEquals('C', letras[resto]);

        resto = calculoDni1.getNumero() % 23;
        System.out.println("DNI complert: " +calculoDni1.getNumero()+letras[resto]);
        assertEquals('N', letras[resto]);

        resto = calculoDni2.getNumero() % 23;
        System.out.println("DNI complert: " +calculoDni2.getNumero()+letras[resto]);
        assertEquals('C', letras[resto]);

        resto = calculoDni3.getNumero() % 23;
        System.out.println("DNI complert: " +calculoDni3.getNumero()+letras[resto]);
        assertEquals('G', letras[resto]);

        resto = calculoDni4.getNumero() % 23;
        System.out.println("DNI complert: " +calculoDni4.getNumero()+letras[resto]);
        assertEquals('K', letras[resto]);

        resto = calculoDni5.getNumero() % 23;
        System.out.println("DNI complert: " +calculoDni5.getNumero()+letras[resto]);
        assertEquals('E', letras[resto]);

        resto = calculoDni6.getNumero() % 23;
        System.out.println("DNI complert: " +calculoDni6.getNumero()+letras[resto]);
        assertEquals('Y', letras[resto]);

        resto = calculoDni7.getNumero() % 23;
        System.out.println("DNI complert: " +calculoDni7.getNumero()+letras[resto]);
        assertEquals('M', letras[resto]);

        resto = calculoDni8.getNumero() % 23;
        System.out.println("DNI complert: " +calculoDni8.getNumero()+letras[resto]);
        assertEquals('H', letras[resto]);

        resto = calculoDni9.getNumero() % 23;
        System.out.println("DNI complert: " +calculoDni9.getNumero()+letras[resto]);
        assertEquals('B', letras[resto]);
    }

}