class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }
}

public class OnlineRetailManagement {
    public static void main(String[] args) {

        Order order = new Order(101, "20-06-2026");
        ShippedOrder shipped = new ShippedOrder(102, "21-06-2026", "TRK12345");
        DeliveredOrder delivered = new DeliveredOrder(103, "22-06-2026", "TRK67890", "24-06-2026");

        System.out.println("Order ID: " + order.orderId);
        System.out.println("Status: " + order.getOrderStatus());

        System.out.println("\nOrder ID: " + shipped.orderId);
        System.out.println("Tracking Number: " + shipped.trackingNumber);
        System.out.println("Status: " + shipped.getOrderStatus());

        System.out.println("\nOrder ID: " + delivered.orderId);
        System.out.println("Tracking Number: " + delivered.trackingNumber);
        System.out.println("Delivery Date: " + delivered.deliveryDate);
        System.out.println("Status: " + delivered.getOrderStatus());
    }
}