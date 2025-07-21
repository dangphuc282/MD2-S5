import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập chuỗi từ người dùng
        System.out.print("Nhập vào một chuỗi: ");
        String inputStr = sc.nextLine();

        // Thay thế tất cả các ký tự số (0-9) bằng ký tự '*'
        String replacedStr = inputStr.replaceAll("[0-9]", "*");

        // In kết quả
        System.out.println("Chuỗi sau khi thay thế: " + replacedStr);

    }
}