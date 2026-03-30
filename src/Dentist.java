/**
 * @author alexandrabogatko
 * @date 25/03/2026 4:22 pm
 */

public class Dentist implements Doctor {
    @Override
    public void treat() {
        System.out.println("Cтоматолог будет лечить зубы");
    }
}