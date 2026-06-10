import java.util.*;

public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter coffee type (Espresso, Latte, Americano, Cappuccino) or 'exit' to stop: ");
            String coffee = sc.next();
            if (coffee.equalsIgnoreCase("exit")) {
                System.out.println("Cafe closed. Thank you!");
                break;
            }
            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            double price;
            switch (coffee.toLowerCase()) {
                case "espresso":
                    price = 99;
                    break;
                case "latte":
                    price = 199;
                    break;
                case "americano":
                    price = 149;
                    break;
                case "cappuccino":
                    price = 129;
                    break;
                default:
                    System.out.println("Invalid coffee type!");
                    continue;
            }
            double bill = price * qty;
            double gst = bill * 0.15;
            double totalBill = bill + gst;
            System.out.println("Bill Amount: ₹" + bill);
            System.out.println("GST (15%): ₹" + gst);
            System.out.println("Total Bill: ₹" + totalBill);
            System.out.println("---------------------------");
        }
        sc.close();
    }
}