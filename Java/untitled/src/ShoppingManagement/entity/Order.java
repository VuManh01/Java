package ShoppingManagement.entity;

public class Order {
    private int orderId;
    private int customerId;
    private String orderStatus;
    private double total;

    public Order() {
    }

    public Order(int orderId, String orderStatus) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
    }

    public Order(int customerId, int orderId, String orderStatus, double total) {
        this.customerId = customerId;
        this.orderId = orderId;
        this.orderStatus = orderStatus;
        this.total = total;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
