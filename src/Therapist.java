/**
 * @author alexandrabogatko
 * @date 25/03/2026 4:17 pm
 */

public class Therapist  implements Doctor {
    @Override
    public void treat() {
        System.out.println("Терапевт проведет обследование"); //личный метод Терапевта
    }

    public void assignDoctor(Patient patient) { //принимает в скобки объект patient - конкретного человека, который пришел на прием
        if (patient.getTreatPlan() == 1) {
            patient.setTreatDoctor(new Surgeon()); //создает нового Surgeon
        } else if (patient.getTreatPlan() == 2) {
            patient.setTreatDoctor(new Dentist());
        } else {
            patient.setTreatDoctor(this);
        }
    }
}