import java.util.Scanner;

public class P08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price = Integer.parseInt(scanner.nextLine());

        double shoes = price - (price * 0.4);
        double clothes = shoes - (shoes * 0.2);
        double ball = (clothes * 25) / 100;
        double accessories = (ball * 20) / 100;

        double total = price + shoes + clothes + ball + accessories;

        System.out.println(total);
    }
}
