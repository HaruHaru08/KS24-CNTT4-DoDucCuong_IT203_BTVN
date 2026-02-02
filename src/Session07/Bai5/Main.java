package Session07.Bai5;

public class Main {
    public static void main(String[] args) {

        double score = 8.5;
        if (score >= Config.MIN_SCORE && score <= Config.MAX_SCORE) {
            System.out.println("Điểm hợp lệ: " + score);
        } else {
            System.out.println("Điểm KHÔNG hợp lệ!");
        }
    }
}

