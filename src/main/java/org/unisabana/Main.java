package org.unisabana;


import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la pizzeria 'su favorita' ");

        System.out.println("Por favor seleccione el tipo de pizza que desea:");
        System.out.println("1. Pizza Delgada");
        System.out.println("2. Pizza Integral");
        System.out.println("3. Pizza Normal");

        int tipo = scanner.nextInt();
        validarOpciones(tipo);


        System.out.println("Por favor seleccione el tamaño de pizza que desea:");

        System.out.println("1. Pizza Grande");
        System.out.println("2. Pizza Pequeña");
        System.out.println("3. Pizza Mediana");
        int tamano = scanner.nextInt();
        validarOpciones(tamano);

        scanner.nextLine();
        System.out.println("Por favor agrege los ingredientes de la pizza que desea separados por comma (,)");
        String ingredientes = scanner.nextLine();

        // Cerrar el Scanner al finalizar su uso
        scanner.close();
        String dimension = DimensionPizza.buscarPorCodigo(tamano).getNombre();
        Integer coccion = DimensionPizza.buscarPorCodigo(tamano).getCocion();
        switch (tipo) {
            case 1:

                System.out.println("El sistema preparará una Pizza delgada , de tamaño " + dimension + " con los siguientes ingredientes " + ingredientes);
                PizzaFactory pizzaDelgada = new PizzaDelgadaFactory();
                pizzaDelgada.crearPizza(dimension, ingredientes, "Delgada",coccion);
                break;
            case 2:
                System.out.println("El sistema preparará una Pizza delgada , de tamaño " + dimension + " con los siguientes ingredientes " + ingredientes);
                PizzaFactory pizzaIntegral = new PizzaMasaIntegralFactory();
                pizzaIntegral.crearPizza(dimension, ingredientes, "Integral",coccion);
                break;
            case 3:
                System.out.println("El sistema preparará una Pizza delgada , de tamaño " + dimension + " con los siguientes ingredientes " + ingredientes);
                PizzaFactory pizzaGruesa = new PizzaMasaGruesaFactory();
                pizzaGruesa.crearPizza(dimension, ingredientes, "Masa Gruesa",coccion);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }


    }

    private static void validarOpciones(int valor) {
        if (!Arrays.asList("1", "2", "3").contains(String.valueOf(valor))) {
            System.out.println("Opción no válida.");
            System.exit(0);
        }
    }




}
