/**
 * @author alexandrabogatko
 * @date 22/03/2026 9:34 pm
 */

abstract class Employee implements Printable{
    @Override
    public void print() {
        System.out.println("Должность: " + jobTitle);
    }
private String jobTitle;
public Employee (String jobTitle) {
    this.jobTitle = jobTitle;
}
}