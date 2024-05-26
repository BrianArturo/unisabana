package registry;

import dyas.tdd.registry.Gender;
import dyas.tdd.registry.Person;
import dyas.tdd.registry.RegisterResult;
import dyas.tdd.registry.Registry;
import org.junit.Assert;
import org.junit.Test;


public class RegistryTest {
    private Registry registry = new Registry();

    /**
     * Clase de equivalencia Edad ->Valida
     */
    @Test
    public void validateRegistryResultValid() {
        Person person = new Person("Rodolfo",1,18, Gender.MALE,true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);

    }

    /**
     * Clase de equivalencia Edad ->Por debajo
     */
    @Test
    public void validateRegistryResultUnderage() {
        Person person = new Person("Rodolfo",1,16,Gender.MALE,true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    /**
     * Clase de equivalencia Edad -> Invalida
     */
    @Test
    public void validateRegistryResultInvalidage() {
        Person person = new Person("Rodolfo",1,160,Gender.MALE,true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }


    /**
     * Clase de equivalencia alive -> Dead
     */
    @Test
    public void validateRegistryResultDead() {
        Person person = new Person("Alfaro",1,26,Gender.MALE,false);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    /**
     * Clase de equivalencia alive -> Life
     */
    @Test
    public void validateRegistryResultLife() {
        Person person = new Person("Manuel",1,18, Gender.MALE,true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);

    }

    @Test
    public void validateRegistryResultDuplicated() {
        Person person = new Person("Rodolfo",1,18,Gender.MALE,true);
        registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DUPLICATED, registry.registerVoter(person));

    }


}