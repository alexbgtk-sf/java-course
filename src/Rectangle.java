/**
 * @author alexandrabogatko
 * @date 22/03/2026 10:59 pm
 */

public class Rectangle extends Figure{
    private double a;
    private double b;
    Rectangle(double a, double b) {
        super("Прямоугольник");
        this.a = a;
        this.b = b;
    }
    @Override
    public double calculateArea() {
        return a*b;
    }
    @Override
    public double calculatePerimeter() {
        return (a+b)*2;
    }
}