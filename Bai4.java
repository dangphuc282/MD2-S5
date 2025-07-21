import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập địa chỉ email: ");
        String email = sc.nextLine().trim();

        String emailregex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,6})+$";

        if (email.matches(emailregex)) {
            System.out.println("Email hợp lệ");
        } else {
            System.out.println("Email không hợp lệ");
        }

    }
}
