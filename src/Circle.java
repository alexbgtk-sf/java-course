/**
 * @author alexandrabogatko
 * @date 22/03/2026 10:56 pm
 */

public class Circle extends Figure{
    private double r;
    Circle(double r) {
        super("Круг");
        this.r = r;
    }
    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(r,2);
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI*r*2;
    }
}