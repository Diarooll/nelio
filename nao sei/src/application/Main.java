package application;

import classes.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main{
    static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String nameclient = sc.nextLine();
        System.out.print("Email: ");
        String emailClient = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(nameclient, emailClient, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus ordStats = OrderStatus.valueOf(sc.next().toUpperCase());
        System.out.print("How many items to this order? ");
        int qtd = sc.nextInt();
        sc.nextLine();

        Order order = new Order(new Date(), ordStats, client);

        for(int i=0; i<qtd; i++){
            System.out.println("Enter #" + (i+1) + " item data:");
            System.out.print("Product name: ");
            String prodName = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();
            Product product = new Product(prodName, price);
            OrderItem ordItem = new OrderItem(quantity, price, product);
            order.addProduct(ordItem);
        }

        System.out.println();
        System.out.println(order);






        sc.close();
    }
}