package Session15.bai6;

import java.util.Stack;

public class MedicalRecordHistory {
    private Stack<EditAction> editStack = new Stack<>();
    private String recordId;

    public MedicalRecordHistory(String recordId) {
        this.recordId = recordId;
    }

    public void addEdit(EditAction action) {
        editStack.push(action);
    }

    public EditAction undoEdit() {
        if (editStack.isEmpty()) return null;
        return editStack.pop();
    }

    public void displayHistory() {
        for (int i = editStack.size() - 1; i >= 0; i--) {
            System.out.println(editStack.get(i));
        }
    }
}
// [CHỌN]: Stack
// [LÝ DO]: Bác sĩ cần truy xuất lịch sử theo thứ tự thời gian ngược (LIFO).
// Thao tác vừa mới thực hiện xong sẽ nằm ở trên cùng để dễ dàng đối chiếu.