/**
 * @author alexandrabogatko
 * @date 25/03/2026 4:24 pm
 */

public class Patient { // болванка для всех будущих пациентов клиники
    private final int treatPlan; // поле для плана, private, чтобы никто снаружи не мог изменить его без нашего ведома
    //final, потому что можно заполнить только один раз (в конструкторе), и после ее запрещено менять
    private Doctor treatDoctor; // поле для врача. Сюда запишется тот, кто будет лечить
    public Patient(int treatPlan) {  // конструктор вызывается в момент создания пациента (через new Patient)
        this.treatPlan = treatPlan; // Берем план из скобок и кладем его во внутреннюю переменную этого пациента
    }
    // Геттер  позволяет узнать план лечения у  пациента
    public int getTreatPlan() {
        return treatPlan; // отдает число, которое хранится внутри
    }
    // сеттер с помощью которого Терапевт назначает врача (в скобках принимаем любого врача (Doctor doctor)
    public void setTreatDoctor(Doctor doctor) {
        this.treatDoctor = doctor; //врач закреплен за пациентом
    }
    public Doctor getTreatDoctor() {
        return treatDoctor;
    }
}