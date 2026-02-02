package Session07.Bai4;

public class Main {
    public static void main(String[] args) {
        ClassRoom sv1 = new ClassRoom("An");
        ClassRoom sv2 = new ClassRoom("Bình");
        ClassRoom sv3 = new ClassRoom("Chi");
        sv1.payFund(100000);
        sv2.payFund(150000);
        sv3.payFund(200000);
        ClassRoom.showClassFund();
    }
}

