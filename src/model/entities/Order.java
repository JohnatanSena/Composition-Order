package model.entities;

import model.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    List<OrderItem> item = new ArrayList<>();
    Client client;

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
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

    public List<OrderItem> getItem() {
        return item;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    public void addItem(OrderItem itens){
        item.add(itens);
    }
    public void removeItem(OrderItem itens){
        item.remove(itens);
    }
    public double total(){
        double sumPrice  = 0;
        for(OrderItem itemPrice : item){
            sumPrice += itemPrice.subTotal();
        }
        return sumPrice;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Data e Hora do Pedido: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Status do pedido: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(client);
        sb.append("Order Items: " + "\n");
        for (OrderItem items : item){
            sb.append(items + "\n");
        }
        sb.append("Valor total do Pedido: " );
        sb.append("R$ " + String.format("%.2f", total()) );
        return sb.toString();
    }
}
