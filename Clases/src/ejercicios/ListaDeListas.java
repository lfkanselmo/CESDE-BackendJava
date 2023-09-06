package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeListas {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        List<List<String>> usuarios = new ArrayList<>();
        List<String> usuario;

        int n = 3;

        for (int i = 0; i < n; i++) {
            usuario = new ArrayList<>();
            System.out.println();
            System.out.println("--------------- USUARIO " + (i+1) + " ---------------");
            System.out.println("Ingrese ID: ");
            usuario.add(read.next());
            System.out.println("Ingrese nombre: ");
            usuario.add(read.next());
            System.out.println("Ingrese edad: ");
            usuario.add(read.next());
            System.out.println("Ingrese email: ");
            usuario.add(read.next());

            if (usuarios.size() > 1){
                if (!found(usuarios, usuario.get(0))){
                    usuarios.add(usuario);
                } else{
                    System.out.println("Este ID ya existe, no se guardará");
                    i--;
                }
            } else {
                usuarios.add(usuario);
            }

            if (i==(n-1)){
                System.out.println("¿Desea ingresar otro usuario? S");
                String answer = read.next();
                if (answer.equalsIgnoreCase("s")){
                    n++;
                }
            }
        }

        boolean founded;
        String displ = "";
        System.out.println("Ingrese valor a buscar");
        String word = read.next();
        Integer count = 0, posi = -1;

        System.out.println("-----------------------------------------------------------");

        for (List<String> array : usuarios) {
            System.out.println();
            founded = array.contains(word);
            if (founded) {
                posi = array.indexOf(word);
                displ = "Posicion de: " + word + " es " + "[" + count + "," + array.indexOf(word) + "]";
            }
            System.out.println("Datos de usuarios: " + array.get(0).toUpperCase());
            count++;
        }

        System.out.println(usuarios);
        System.out.println();


        if (posi != -1) {
            System.out.println();
            System.out.println(displ);
        } else {
            System.out.println("Valor a buscar no fue encontrado");
        }
    }

    public static boolean found(List<List<String>> list, String id){
        boolean result = false;
        for (List<String> user : list){
            if (user.contains(id)){
                result = true;
                break;
            }
        }

        return result;
    }
}
