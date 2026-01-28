package Session04.Bai2;

public class Bai2 {
    public static void main(String[] args) {

        String description = "Sách giáo khoa Toán lớp 12, Kệ: A1-102, tình trạng mới";

        if (description.contains("Kệ:")) {
            int start = description.indexOf("Kệ:") + 4; // sau "Kệ:"
            int end = description.indexOf(",", start);

            if (end == -1) {
                end = description.length();
            }

            String viTri = description.substring(start, end).trim();
            String newDescription = description.replace("Kệ:", "Vị trí lưu trữ:");

            System.out.println("Vị trí tìm thấy: " + viTri);
            System.out.println("Mô tả mới: " + newDescription + ".");
        } else {
            System.out.println("Không tìm thấy thông tin kệ sách.");
        }
    }
}

