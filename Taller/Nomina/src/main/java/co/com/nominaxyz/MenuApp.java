package co.com.nominaxyz;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuApp {
    Scanner sc = new Scanner(System.in);
    ArrayList<Cargo> cargosBD = new ArrayList();
    ArrayList<Empleado> empleadosBD = new ArrayList();
    ArrayList<Nomina> nominasDB = new ArrayList<>();
    public void iniciarMenu(){
        System.out.println("******************* BIENVENIDO *******************");
        boolean ejecutar = true;

        do {
            System.out.println();
            System.out.println("Seleccione una opción: ");
            System.out.println("1. Crear un cargo");
            System.out.println("2. Crear un empleado");
            System.out.println("3. Crear un nomina");
            System.out.println("4. Imprimir colilla de nomina");
            System.out.println("5. Salir");
            System.out.println();
            String opc = sc.next();
            sc.skip("\n");

            switch (opc){
                case "1":
                    Cargo cargo = new Cargo();
                    cargo.crearCargo();
                    cargosBD.add(cargo);
                    System.out.println("Cargo creado con éxito");
                    break;

                case "2":
                    Empleado empleado = new Empleado();
                    System.out.println("Ingrese el cargo que desea agregar a este empleado");
                    String cargoAux = sc.nextLine();
                    Cargo c = buscarCargo(cargoAux);

                    if(c != null){
                        empleado.crearUsuario(c);
                        empleadosBD.add(empleado);
                        System.out.println("Empleado creado con éxito");
                    } else{
                        System.out.println("Ese cargo no existe, no es posible crear empleado");
                        System.out.println();
                    }

                    break;

                case "3":
                    Nomina nomina = new Nomina();
                    System.out.println("Ingrese el número de documento del empleado al que pertenecerá la nomina");
                    String idEmple = sc.nextLine();
                    Empleado emple = buscarEmpleado(idEmple);
                    boolean yaExiste = buscarNomina(idEmple);

                    if(yaExiste == false){
                       if (emple != null){
                           nomina.crearNomina(emple);
                           nominasDB.add(nomina);
                           System.out.println("Nomina creada con éxito");
                       } else{
                           System.out.println("No fue posible crear la nomina, el empleado no existe");
                           System.out.println();
                       }
                    } else{
                        System.out.println("No fue posible crear la nomina, el empleado ya cuenta con una nomina");
                        System.out.println();
                    }

                    break;

                case "4":
                    System.out.println("Ingrese el número de documento del empleado del que desea imprimir la colilla");
                    System.out.println();
                    String idEmpleColi = sc.nextLine();
                    boolean encontrado = false;
                    for(Nomina n: nominasDB){
                        if (n.getEmpleado().getId().equalsIgnoreCase(idEmpleColi)){
                            n.imprimirColilla();
                            encontrado = true;
                            break;
                        }
                    }

                    if(!encontrado){
                        System.out.println("No existe nomina con ese número de documento, imposible mostrar colilla");
                        System.out.println();
                    }

                    break;

                case "5":
                    ejecutar = false;
                    System.out.println("******************* FINALIZANDO PROGRAMA *******************");
                    break;


            }

        }while(ejecutar);
    }

    //Metodo para buscar cargo
    public Cargo buscarCargo(String cargoNom){
        for(Cargo c : cargosBD){
            if (c.getNombreCargo().equalsIgnoreCase(cargoNom)){
                return c;
            }
        }

        return null;
    }

    //Metodo para buscar empleado
    public Empleado buscarEmpleado(String idEmple){
        for(Empleado e : empleadosBD){
            if (e.getId().equalsIgnoreCase(idEmple)){
                return e;
            }
        }

        return null;
    }

    //Metodo para buscar empleado en las nominas
    public boolean buscarNomina(String idEmple){
        for(Nomina n : nominasDB){
            if (n.getEmpleado().getId().equalsIgnoreCase(idEmple)){
                return true;
            }
        }

        return false;
    }
}
