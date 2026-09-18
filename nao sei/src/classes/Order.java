package classes;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> products = new ArrayList<>();

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

    public Order(){}
    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void addProduct(OrderItem product){
        this.products.add(product);
    }
    public void removeProduct(OrderItem product){
        this.products.remove(product);
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order Summary:\n");
        sb.append("Order moment: " + sdf.format(moment));
        sb.append("\nOrder status: " + status);
        sb.append("\nClient: " + client.getName() + " - (" + sdf2.format(client.getBirthDate()) + ") - " + client.getEmail() + "\n");
        sb.append("Order items: \n");
        for(OrderItem product : products){
            sb.append(String.format("Name: %s, Price per product: %.2f, Quantity: %d, Subtotal: %.2f\n",
                    product.getProduct().getName(),
                    product.getProduct().getPrice(),
                    product.getQuantity(),
                    product.getPrice()));
        }


        return sb.toString();
    }
}
