package Session15.bai3;

import java.util.Stack;

public class MedicationProcessChecker {
    private Stack<String> stack = new Stack<>();
    public boolean checkProcess(String[] actions) {

        reset();
        for (int i = 0; i < actions.length; i++) {

            String action = actions[i];

            if (action.equals("PUSH")) {
                stack.push("MEDICATION");
                System.out.println("Bước " + (i + 1) + ": PUSH → Phát thuốc");
            }

            else if (action.equals("POP")) {

                if (stack.isEmpty()) {
                    System.out.println("Bước " + (i + 1) + ": POP nhưng Stack đang rỗng → Quy trình KHÔNG hợp lệ!");
                    return false;
                }

                stack.pop();
                System.out.println("Bước " + (i + 1) + ": POP → Hoàn tất phát thuốc");
            }

            else {
                System.out.println("Bước " + (i + 1) + ": Lệnh không hợp lệ → " + action);
                return false;
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Kết thúc ca trực nhưng vẫn còn thuốc chưa hoàn tất → Quy trình KHÔNG hợp lệ!");
            return false;
        }

        System.out.println("Quy trình hợp lệ ✓");
        return true;
    }
    public void reset() {
        stack.clear();
    }
}
