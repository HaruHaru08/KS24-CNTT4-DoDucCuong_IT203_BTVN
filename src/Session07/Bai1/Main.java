package Session07.Bai1;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("SV001", "An");
        Student s2 = new Student("SV002", "Bình");
        Student s3 = new Student("SV003", "Chi");

        s1.displayInfo();
        System.out.println();

        s2.displayInfo();
        System.out.println();

        s3.displayInfo();
        System.out.println();
        Student.displayTotalStudent();
    }
}

