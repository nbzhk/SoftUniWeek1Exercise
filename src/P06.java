import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (nylon + 2) * 1.5;
        double paintPrice = (paint + (paint * 0.1)) *14.5;
        double thinnerPrice = thinner *5.0;

        double sum = nylonPrice + paintPrice + thinnerPrice + 0.4;

        double work = hours * (sum * 0.3);

        double total = work + sum;

        System.out.println(total);




    }
}
