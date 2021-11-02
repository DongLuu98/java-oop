package ExerciseLesson8;

import java.security.SecureRandom;

public class Eagle extends Animal{
    @Override
    protected double getSpeed() {
        return new SecureRandom().nextInt(121);
    }

    @Override
    protected boolean flyable() {
        return true;
    }
}