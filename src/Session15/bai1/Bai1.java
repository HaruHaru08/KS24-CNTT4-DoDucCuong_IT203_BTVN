package Session15.bai1;

public class Bai1 {
    public static void main(String[] args) {

        MedicalRecordHistory history = new MedicalRecordHistory();

        history.addEdit(new EditAction("Thêm chẩn đoán: Viêm họng", "10:00"));
        history.addEdit(new EditAction("Cập nhật thuốc: Paracetamol", "10:15"));
        history.addEdit(new EditAction("Sửa liều lượng thuốc", "10:30"));

        System.out.println("Chỉnh sửa gần nhất: " + history.getLatestEdit());

        history.undoEdit();
        history.undoEdit();
        history.undoEdit();
        history.undoEdit(); // test khi stack rỗng
    }
}
