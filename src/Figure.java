/**
 * @author alexandrabogatko
 * @date 22/03/2026 10:42 pm
 */

abstract class Figure implements Cloneable{
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    private String figureName;
    public Figure (String figureName) {
        this.figureName = figureName;
    }
    public String getFigureName() {
        return figureName;
    }
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}