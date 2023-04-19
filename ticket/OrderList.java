package Practice;

import java.util.ArrayList;

public class OrderList {
    // Use private access modifiers for class fields to ensure encapsulation
    private int ticketselect;
    private int agegroup;
    private int quantity;
    private int price;
    private int discount;
    // Use an ArrayList to store the order list
    public ArrayList<int[]> orderList = new ArrayList<>();

    // Getter and setter methods for class fields
    public int getTicketselect() {
        return ticketselect;
    }

    public void setTicketselect(int ticketselect) {
        this.ticketselect = ticketselect;
    }

    public int getAgegroup() {
        return agegroup;
    }

    public void setAgegroup(int agegroup) {
        this.agegroup = agegroup;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    // Getter and setter methods for the order list
    public ArrayList<int[]> getOrderList() {
        return orderList;
    }

    public void setOrderList(int ticketselect, int agegroup, int quantity, int price, int discount) {
        // Create a new array to represent a single order
        int[] order = {ticketselect, agegroup, quantity, price, discount};
        // Add the new order to the order list
        this.orderList.add(order);
    }
    
    //세팅해주는 함수
    public void set_All(int ticketselect, int agegroup, int quantity, int price, int discount) {
        setTicketselect(ticketselect);
        setAgegroup(agegroup);
        setQuantity(quantity);
        setPrice(price);
        setDiscount(discount);
    }

    
    public ArrayList<int[]> set_Order_List () {
        setOrderList(getTicketselect(), getAgegroup(), getQuantity(), getPrice(), getDiscount());
        return getOrderList();
    }
}
