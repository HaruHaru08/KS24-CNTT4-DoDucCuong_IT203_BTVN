package Session04.Bai4;

public class Bai4 {
    public static void main(String[] args) {

        String cardID = "TV202312345";

        String fullRegex = "^[A-Z]{2}\\d{4}\\d{5}$";

        if (cardID.matches(fullRegex)) {
            System.out.println("Mã thẻ hợp lệ!");
        } else {
            if (!cardID.matches("^[A-Z]{2}.*")) {
                System.out.println("Thiếu hoặc sai tiền tố (phải là 2 chữ cái viết hoa)");
            }
            else if (!cardID.matches("^[A-Z]{2}\\d{4}.*")) {
                System.out.println("Năm không hợp lệ (phải gồm 4 chữ số)");
            }
            else if (!cardID.matches("^[A-Z]{2}\\d{4}\\d{5}$")) {
                System.out.println("Phần số cuối không hợp lệ (phải có 5 chữ số)");
            }
        }
    }
}
