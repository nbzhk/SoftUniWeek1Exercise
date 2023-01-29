
import java.util.Scanner;

public class P033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double total = sum + months * ((sum * percent / 100) / 12);

        System.out.println(total);


    }
}


