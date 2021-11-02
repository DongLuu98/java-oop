package ExerciseLesson8;

import java.security.SecureRandom;

public class Falcon extends Animal{
    @Override
    protected double getSpeed() {
        return new SecureRandom().nextInt(120);
    }

    @Override
    protected boolean flyable() {
        return true;
    }
}