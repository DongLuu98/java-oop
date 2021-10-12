package RacingAnimal;

import java.security.PrivateKey;

public class Animal {
    public String animalName;
    public int animalVelocity;
    protected static String defaultName;

    public Animal() {

    }

    public String getName() {
        return animalName;
    }

    public Animal(String animalName, int velocityAnimal) {
        this.animalName = animalName;
        this.animalVelocity = velocityAnimal;

    }

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalVelocity() {
        return animalVelocity;
    }

    public void setAnimalVelocity(int animalVelocity) {
        this.animalVelocity = animalVelocity;
    }


}
