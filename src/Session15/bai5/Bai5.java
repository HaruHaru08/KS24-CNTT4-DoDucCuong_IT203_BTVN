package Session15.bai5;

public class Bai5 {
    public static void main(String[] args) {
        EmergencyCaseQueue queue = new EmergencyCaseQueue();
        Patient p1 = new Patient("P01", "Nguyen Van A", 45);
        Patient p2 = new Patient("P02", "Tran Thi B", 30);
        EmergencyCase case1 = new EmergencyCase(p1);
        EmergencyCase case2 = new EmergencyCase(p2);
        queue.addCase(case1);
        queue.addCase(case2);
        EmergencyCase current = queue.getNextCase();
        current.addStep(new TreatmentStep("Tiếp nhận", "10:00"));
        current.addStep(new TreatmentStep("Chẩn đoán", "10:05"));
        current.addStep(new TreatmentStep("Điều trị", "10:15"));

        current.displaySteps();
        current.undoStep();

        current.displaySteps();
    }
}
