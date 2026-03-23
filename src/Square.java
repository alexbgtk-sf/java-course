/**
 * @author alexandrabogatko
 * @date 22/03/2026 10:56 pm
 */

public class Square extends Figure{
    private double a;
    Square(double a) {
        super("Квадрат");
        this.a = a;
    }
    @Override
    public double calculateArea() {
        return Math.pow(a, 2);
    }
    @Override
    public double calculatePerimeter() {
        return a*4;
    }
}