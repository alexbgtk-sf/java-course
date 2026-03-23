/**
 * @author alexandrabogatko
 * @date 22/03/2026 10:59 pm
 */

public class Triangle extends Figure{
    private double a;
    private double b;
    private double c;
    Triangle(double a, double b, double c) {
        super("Треугольник");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double calculatePerimeter() {
        return a+b+c;
    }
}