package com.cesde.poo.services;

import com.cesde.poo.dao.UserDao;
import com.cesde.poo.models.Employee;
import com.cesde.poo.models.Student;
import com.cesde.poo.models.User;

import java.util.Scanner;

public class UserService {

    final Scanner read = new Scanner(System.in);
    private User user;
    private final UserDao userDao = new UserDao();

    public void singUp() {
        System.out.println();
        System.out.println("****** NUEVO USUARIO ******");
        System.out.println();
        user = createUserType();
        userDao.addUser(user);
    }



    private User createUserType() {
        User userAux = new User();

        boolean noOption = true;
        String opc;
        do {
            System.out.println("Seleccione tipo de usuario que desea crear");
            System.out.println("1. Estudiante");
            System.out.println("2. Empleado");
            System.out.println();
            opc = read.nextLine();

            switch (opc) {
                case "1":
                    userAux = new Student();
                    noOption = false;
                    break;

                case "2":
                    userAux = new Employee();
                    noOption = false;
                    break;
                default:
                    System.out.println("Tipo de usuario elegido no válido. Intente de nuevo");
                    noOption = true;
                    break;

            }
        } while (noOption);

        System.out.println("Ingrese su DNI: ");
        userAux.setId(read.next());
        read.skip("\n");
        if (userDao.searchUser(userAux.getEmail()) != null) {
            System.out.println("Usuario ya se encuentra registrado");
        } else {
            System.out.println("Ingrese su nombre: ");
            userAux.setName(read.nextLine());
            System.out.println("Ingrese su correo: ");
            userAux.setEmail(read.nextLine());
            System.out.println("Ingrese su número de teléfono: ");
            userAux.setPhoneNumber(read.nextLine());
            System.out.println("Ingrese su dirección: ");
            userAux.setAddress(read.nextLine());
            System.out.println("Ingrese su contraseña: ");
            userAux.setPassword(read.nextLine());



            if (opc.equals("1")){
                System.out.println("Ingrese su curso: ");
                ((Student)userAux).setCourse(read.nextLine());
            }

            if(opc.equals("2")){
                System.out.println("Ingrese el salario del empleado");
                ((Employee) userAux).setSalary(read.nextDouble());
                read.skip("\n");
                System.out.println("Ingrese el area de trabajo");
                ((Employee) userAux).setArea(read.nextLine());
            }
        }

        return userAux;
    }

    //login function
    public void logIn() {
        boolean log = false;
        System.out.println();
        System.out.println("****** INICIO DE SESIÓN ******");
        System.out.println();
        System.out.println("Ingrese el correo registrado");
        String emailRegisted = read.nextLine();
        System.out.println("Ingrese la contraseña");
        String passwordRegisted = read.nextLine();

        User userConsult = userDao.searchUser(emailRegisted);

        if (userConsult != null) {
            if (userConsult.getPassword().equals(passwordRegisted)) {
                System.out.println("Login Success");
                System.out.println();
                System.out.println("Bienvenido " + userConsult.getName());
                System.out.println("--------------------------------------");
                System.out.println(userConsult.toString());
                log = true;
            } else {
                System.out.println("Login Failed");
                System.out.println();
                System.out.println("Credenciales incorrectas, no se puede iniciar sesión");
            }

        } else {
            System.out.println("Login Failed");
            System.out.println();
            System.out.println("No existe usuario asignado al correo: " + emailRegisted);
        }
    }
}
