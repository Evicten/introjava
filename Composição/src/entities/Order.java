package entities;

import enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order() {
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

    public Order( Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public void addItem(OrderItem item){
        this.items.add(item);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        double total = 0.0;
        StringBuilder sb = new StringBuilder();
        for (OrderItem item : this.items){
            sb.append(item.toString() + "\n");
            total += item.subTotal();
        }
        sb.append("Total price: $" + total);
        return "ORDER SUMMARY: \n" +
                "Order moment: " + moment +
                "\n Order status: " + status +
                "\n Client: " + client.toString() +
                "\n Order items: \n" + sb;
    }
}
