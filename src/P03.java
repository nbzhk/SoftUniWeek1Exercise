import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percentPerYear = Double.parseDouble(scanner.nextLine());

        double amountMonth = (deposit * (percentPerYear / 100)) / 12;

        double total = deposit + amountMonth * months;

        System.out.println(total);



    }
}
