package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class OrderList {

    private int ticketselect;
    private int agegroup;
    private int quantity;
    private int price;
    private int discount;


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
   
    //arraylist orderList 선언
    public static ArrayList<int[]> orderList = new ArrayList<int[]>();

    //main에서 받은 입력값을 set 하고 위 arraylist에 추가
    public void setOrderList(int ticketselect, int agegroup, int quantity, int price, int discount) {
    	 setTicketselect(ticketselect);
         setAgegroup(agegroup);
         setQuantity(quantity);
         setPrice(price);
         setDiscount(discount);
         int[] orderarray = {ticketselect, agegroup, quantity, price, discount};
         orderList.add(orderarray);
         
         for (int i = 0; i < orderList.size(); i++) {
        	  System.out.println(Arrays.toString(orderList.get(i)));
         }
    }
    

}
