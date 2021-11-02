package ExerciseLesson8;



import java.util.Arrays;
import java.util.List;

class CalculatorVelocity {

    public static Animal testVelocityAnimal(List<Animal> animals) {
        Animal winner = null;
        for (Animal animal : animals) {
            if (!animal.flyable()) {
                if (winner == null) {
                    winner = animal;
                } else {
                    if (winner.getSpeed() < animal.getSpeed()) {
                        winner = animal;
                    }
                }
            }
        }
        return winner;
    }


    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal eagle = new Eagle();
        Animal squirrel = new Squirrel();
        Animal falcon = new Falcon();

        Animal winner = CalculatorVelocity.testVelocityAnimal(Arrays.asList(tiger, horse, dog, squirrel, falcon, eagle));

        System.out.println("Winner is: " + winner.getClass().getSimpleName() + " with speed " + winner.getSpeed() + "km/h");
    }
}