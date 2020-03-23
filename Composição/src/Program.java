import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Order order = new Order();
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        String dateString = sc.nextLine();
        DateFormat formatter = new SimpleDateFormat("DD/MM/YYYY");
        Date date = formatter.parse(dateString);
        order.setClient(new Client(name, email, date));

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.nextLine();
        order.setStatus(OrderStatus.valueOf(status));
        order.setMoment(new Date());

        System.out.print("How many items to this order?");
        int n = sc.nextInt();
        sc.nextLine();

        String nameProduct;
        double price;
        int quantity;

        for (int i = 0; i<n; i++){
            System.out.println("Enter #" + (i+1) + " item data:");
            System.out.print("Product name: ");
            nameProduct = sc.nextLine();
            System.out.print("Product price: ");
            price = sc.nextDouble();
            sc.nextLine();
            System.out.print("Quantity: ");
            quantity = sc.nextInt();
            sc.nextLine();
            order.addItem(new OrderItem(quantity, price, new Product(nameProduct, price)));
        }

        System.out.println(order.toString());

    }
}
