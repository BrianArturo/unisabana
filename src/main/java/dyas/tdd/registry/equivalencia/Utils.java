package dyas.tdd.registry.equivalencia;

public class Utils {

    public static boolean validarEdad(int edad) {
        return edad >= 18 && edad <= 65;
    }


    public static boolean validarUnderage(int edad) {
        return edad < 18;
    }



}
