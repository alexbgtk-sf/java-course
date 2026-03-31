/**
 * @author alexandrabogatko
 * @date 31/03/2026 3:34 pm
 */

public class Dog extends Animal{
    @Override
    public void voice () {
        System.out.println("Dog barks");
    }
    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Meat") || food.equals("Bone")) {
            System.out.println("Dog is happy to eat " + food);
        }
        else {
            System.out.println("Dog is dissapointed");
        }
    }
}