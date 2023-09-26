package principios_poo;

public class TestCasa {
    public static void main(String[] args) {
        Padre papa1 = new Padre("Perez");
        Casa casa = new Casa();
        casa.setDirCasa("Carrera 12 #43-12");
        papa1.dir = casa;

        System.out.println(papa1.dir.getDirCasa());;
    }
}
