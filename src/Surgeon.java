/**
 * @author alexandrabogatko
 * @date 25/03/2026 3:49 pm
 */

public class Surgeon implements Doctor {
    @Override
    public void treat() {
        System.out.println("Хирург будет оперировать");
    }
}