/**
 * @author alexandrabogatko
 * @date 31/03/2026 3:34 pm
 */

public class Tiger extends Animal {
    @Override
    public void voice () {
        System.out.println("Tiger rrroars");
    }
    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Meat")) {
            System.out.println("Tiger is happy to eat " + food);
        }
        else {
            System.out.println("Tiger is unhappy");
        }
    }
}