package dyas.tdd.registry;


import dyas.tdd.registry.equivalencia.Utils;

import java.util.ArrayList;
import java.util.List;

public class Registry {

    List<Person> personas = new ArrayList<>();

    public RegisterResult registerVoter(Person p) {
        RegisterResult registerResult = null;

        if (!p.isAlive()) {
            registerResult = RegisterResult.DEAD;
        }

        if (Utils.validarUnderage(p.getAge())) {
            registerResult = RegisterResult.UNDERAGE;
        }
        if (!Utils.validarEdad(p.getAge())) {
            registerResult = RegisterResult.INVALID_AGE;
        }
        if (personas.contains(p)) {
            registerResult = RegisterResult.DUPLICATED;
        }

        if (registerResult == null) {
            personas.add(p);
            registerResult = RegisterResult.VALID;

        }
        return registerResult;
    }
}