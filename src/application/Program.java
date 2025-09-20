package application;

import model.entities.Client;
import model.entities.Order;
import model.entities.OrderItem;
import model.entities.Product;
import model.enums.OrderStatus;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados pessoais");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Data de Nascimento: ");
        Date birthDate = sdf.parse(sc.next());
        Client client = new Client(name, email, birthDate);

        System.out.println("Entre com os dados do Pedido: ");
        System.out.print("Status do pedido: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.next());

        Order order =  new Order(new Date(), orderStatus, client);

        System.out.println("Qual a quantidade de Produtos do pedido?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Dados do Pedido#" + (i +1) + ": ");
            System.out.print("Nome do produto: ");
            String productName = sc.next();
            System.out.print("Preço do produto: ");
            double productPrice = sc.nextDouble();
            Product product = new Product(productName, productPrice);

            System.out.print("Quantidade: ");
            Integer quantity = sc.nextInt();
            OrderItem orderItem = new OrderItem(quantity, productPrice, product);
            order.addItem(orderItem);
        }
        System.out.println("ORDEM SUMARY");
        System.out.println(order);
    }
}