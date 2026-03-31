/**
 * @author alexandrabogatko
 * @date 31/03/2026 3:33 pm
 */

public class Rabbit extends Animal{
    @Override
    public void voice () {
        System.out.println("Rabbit makes cute noise");
    }
    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Grass")) {
            System.out.println("Rabbit is happy to eat " + food);
        }
        else {
            System.out.println("Rabbit is so sad");
        }
    }
}