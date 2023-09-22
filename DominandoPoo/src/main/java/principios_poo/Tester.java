package principios_poo;

public class Tester {
    public static void main(String[] args) {
        Padre juan = new Padre( "Solito");
        Padre carlos = new Padre("Acompañado");
        juan.setNombrePadre("Juan");
        carlos.setNombrePadre("Carlos");

        System.out.println(carlos.getNombrePadre() + " " + carlos.getApellidoPadre());

        juan.mostrarNombre();
    }
}
