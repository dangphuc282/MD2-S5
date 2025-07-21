import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi ");
        String text = sc.nextLine().trim();
        System.out.print("Nhập từ cần tìm: ");
        String wordToFind = sc.nextLine().trim();

        int index = text.indexOf(wordToFind);

        if (index != -1) {
            System.out.println("Từ \"" + wordToFind + "\" xuất hiện tại vị trí: " + index);
        } else {
            System.out.println("Từ \"" + wordToFind + "\" không xuất hiện trong chuỗi.");
        }
    }
}