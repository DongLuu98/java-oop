package RacingAnimal;

import java.security.SecureRandom;

public class Horse extends Animal {
    private static String defaultName;

    static {
        defaultName = "Horse Default Name";
    }

    public Horse() {
    }

    public Horse(String name) {
        super(name);
    }

    public int getAnimalVelocity() {
        int randomSpeed = new SecureRandom().nextInt(75);
        return randomSpeed;
    }


    public Horse(String animalName, int velocityAnimal) {
        super(animalName, velocityAnimal);
        this.animalName = "B";
    }

    public static String getDefaultName() {
        if (defaultName == null) {
            return "Horse";
        }
        return defaultName;
    }
}