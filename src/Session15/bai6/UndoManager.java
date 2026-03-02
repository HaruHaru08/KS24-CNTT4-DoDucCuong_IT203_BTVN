package Session15.bai6;

import java.util.Stack;

public class UndoManager {

    private Stack<InputAction> undoStack = new Stack<>();
    private int maxUndoSteps;

    public UndoManager(int maxUndoSteps) {
        this.maxUndoSteps = maxUndoSteps;
    }

    public void addAction(InputAction action) {
        if (undoStack.size() >= maxUndoSteps) {
            undoStack.remove(0);
        }
        undoStack.push(action);
    }

    public InputAction undo() {
        if (undoStack.isEmpty()) return null;
        return undoStack.pop();
    }

    public void displayUndoHistory() {
        for (int i = undoStack.size() - 1; i >= 0; i--) {
            System.out.println(undoStack.get(i));
        }
    }
}
// [CHỌN]: Stack
// [LÝ DO]: Nguyên lý của Undo là "Đảo ngược hành động CUỐI CÙNG" (LIFO).
// Thao tác vừa nhập sai sẽ bị loại bỏ đầu tiên khi nhấn Hoàn tác.