package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeListas {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        List<List<String>> usuarios = new ArrayList<>();
        List<String> usuario;

        for (int i = 0; i < 3; i++) {
            usuario = new ArrayList<>();
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("Ingrese nombre: ");
            usuario.add(read.next());
            System.out.println("Ingrese edad: ");
            usuario.add(read.next());
            System.out.println("Ingrese email: ");
            usuario.add(read.next());

            usuarios.add(usuario);
        }

        boolean founded;
        String displ = "";
        System.out.println("Ingrese valor a buscar");
        String word = read.next();
        Integer count = 0, posi = -1;

        for (List<String> array : usuarios) {
            System.out.println();
            founded = array.contains(word);
            if (founded) {
                posi = array.indexOf(word);
                displ = "Posicion de: " + word + " es " + "[" + count + "," + array.indexOf(word) + "]";
            }
            System.out.println("Datos de usuario: " + array.get(0).toUpperCase());
            for (String data : array) {
                System.out.println(data);
            }
            System.out.println();
            count++;
        }


        if (posi != -1) {
            System.out.println();
            System.out.println(displ);
        } else {
            System.out.println("Valor a buscar no fue encontrado");
        }
    }
}
