import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pen = Integer.parseInt(scanner.nextLine());
        int mark = Integer.parseInt(scanner.nextLine());
        int lit = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double total = (pen * 5.8) + (mark * 7.2) + (lit * 1.2);
        double discount = total - (total * percent / 100);
        System.out.println(discount);
    }
}
