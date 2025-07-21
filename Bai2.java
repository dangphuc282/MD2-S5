public class Bai2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello, Java World!");
        System.out.println("Chuỗi ban đầu: " + sb);
        sb.delete(5, 9);
        System.out.println("Chuỗi sau khi xóa từ vị trí 5 đến 9: " + sb);
        
        int start = sb.indexOf("World");
        int end = start + "World".length();
        if (start != -1) {
            sb.replace(start, end, "Universe");
        }
        System.out.println("Chuỗi sau khi thay thế \"World\" bằng \"Universe\": " + sb);
    }
}
