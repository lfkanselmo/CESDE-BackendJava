package principios_poo;

public class TestFamilia {
    public static void main(String[] args) {
        Familia familia = new Padre("Perez");
        Familia familia1 = new Hija("Perez","Castro");

        //UpCasting
        Hija hijaMenor = new Hija("Perez","Castro");
        Padre padre1 = hijaMenor;

        //DownCasting
        Padre papa1 = new Hija("Perez", "Castro");

        Hija hijaMayor = (Hija) (papa1);

    }
}

