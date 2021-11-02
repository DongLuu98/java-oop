package ExerciseLesson8;

import java.security.SecureRandom;

public class Horse extends Animal{
    @Override
    protected double getSpeed() {
        return new SecureRandom().nextInt(75);
    }

    @Override
    protected boolean flyable() {
        return false;
    }
}