import java.util.Scanner;

public class P07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int veggie = Integer.parseInt(scanner.nextLine());

        double chickenPrice = chicken * 10.35;
        double fishPrice = fish * 12.40;
        double veggiePrice = veggie * 8.15;
        double foodPrice = chickenPrice + fishPrice + veggiePrice;
        double dessert = (foodPrice * 20) / 100;

        double delivery = 2.50;
        double total = foodPrice + dessert + delivery;
        System.out.println(total);

    }
}
