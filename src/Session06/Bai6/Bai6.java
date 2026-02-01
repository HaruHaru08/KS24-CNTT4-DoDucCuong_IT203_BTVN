package Session06.Bai6;

public class Bai6 {
    public static void main(String[] args) {
        User u1 = new User(1, "haru", "123456", "haru@gmail.com");
        u1.hienThiThongTin();
        System.out.println("Thử email sai:");
        User u2 = new User(2, "user2", "abcdef", "sai_email");
        u2.hienThiThongTin();
        System.out.println("Thử password rỗng:");
        User u3 = new User(3, "user3", "", "user3@gmail.com");
        u3.hienThiThongTin();
    }
}

class User {
    private int id;
    private String username;
    private String password;
    private String email;

    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setPassword(password);
        setEmail(email);
    }
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        if (password != null && !password.isEmpty()) {
            this.password = password;
        } else {
            System.out.println("Password không được rỗng!");
            this.password = "default123";
        }
    }
    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email không hợp lệ!");
            this.email = "unknown@email.com";
        }
    }
    public void hienThiThongTin() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ******");
        System.out.println("----------------------");
    }
}

