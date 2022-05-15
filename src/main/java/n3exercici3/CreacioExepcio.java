package n3exercici3;

import java.util.Arrays;

public class CreacioExepcio {
    private int[] array;

    public CreacioExepcio() {
        this.array = new int[5];
    }

    public int[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        return "CreacioExepcio{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

}
