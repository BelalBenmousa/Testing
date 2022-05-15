package n3exercici2;

//Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre el número com a paràmetre.
//        Crea una classe jUnit que verifiqui el seu correcte funcionament, parametritzant-la perquè el test rebi un espectre de dades ampli i validi si el càlcul és correcte per a 10 números de DNI predefinits.
public class CalculoDni {
    private int numero;

    public CalculoDni(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "CalculoDni{" +
                "numero='" + numero + '\'' +
                '}';
    }
}
