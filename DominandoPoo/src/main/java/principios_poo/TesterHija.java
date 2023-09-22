package principios_poo;

public class TesterHija {
    public static void main(String[] args) {
        Hija hijaMayor = new Hija( "Solito","Acompañada");
        Hija hijaMenor = new Hija("Solito","Acompañado");
        hijaMayor.setNombrePadre("Juanita");
        hijaMenor.setNombrePadre("Carla");

        String nombreHijaMayor = hijaMayor.getNombrePadre();
        String apellidoPadre = hijaMayor.getApellidoPadre();
        String apellidoMadre = hijaMayor.getApellidoMadre();

        String nombreHijaMenor = hijaMenor.getNombrePadre();

        System.out.println("Datos de hija mayor: ");
        System.out.println(nombreHijaMayor + " " + apellidoPadre + " " + apellidoMadre);
        System.out.println();
        System.out.println("Datos de hija menor");
        System.out.println(nombreHijaMenor + " " + apellidoPadre + " " + apellidoMadre);

    }
}
