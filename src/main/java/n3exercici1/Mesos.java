package n3exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mesos {
    private ArrayList <String> mesos;

    public Mesos() {
        ArrayList<String> mesos = new ArrayList<>(Arrays.asList("Gener","Febrer","Març","Abril","Maig","Juny","Juliol","Agost","Septembre","Octubre","Novembre","Desembre"));
        this.mesos = mesos;
    }

    public List<String> getMesos() {
        return mesos;
    }


    @Override
    public String toString() {
        return "Mesos{" +
                "mesos=" + mesos +
                '}';
    }
}
