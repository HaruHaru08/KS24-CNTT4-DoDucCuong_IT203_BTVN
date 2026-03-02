package Session15.bai5;

import java.util.Stack;

public class EmergencyCase {
    private Patient patient;
    private Stack<TreatmentStep> steps = new Stack<>();

    public EmergencyCase(Patient patient) {
        this.patient = patient;
    }

    public Patient getPatient() {
        return patient;
    }
    public void addStep(TreatmentStep step) {
        steps.push(step);
        System.out.println("Thêm bước cho " + patient.getName() + ": " + step);
    }
    public TreatmentStep undoStep() {
        if (steps.isEmpty()) {
            System.out.println("Không có bước nào để undo!");
            return null;
        }

        TreatmentStep removed = steps.pop();
        System.out.println("Undo bước: " + removed);
        return removed;
    }
    public void displaySteps() {
        if (steps.isEmpty()) {
            System.out.println("Chưa có bước xử lý.");
            return;
        }

        System.out.println("=== Các bước xử lý của " + patient.getName() + " (Top -> Bottom) ===");
        for (int i = steps.size() - 1; i >= 0; i--) {
            System.out.println(steps.get(i));
        }
        System.out.println("--------------------------------------------");
    }
}
