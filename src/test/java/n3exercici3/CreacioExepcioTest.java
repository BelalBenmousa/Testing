package n3exercici3;

import junit.framework.TestCase;
import org.junit.Test;


public class CreacioExepcioTest  {
    CreacioExepcio creacioExepcio = new CreacioExepcio();
    //  System.out.println(boom);
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void creanArrayIndexOutOfBoundsException()  {
      //  System.out.println(boom);
        int boom = creacioExepcio.getArray()[10];
        System.out.println(boom);
    }

}