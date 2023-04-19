package Practice;

import java.util.ArrayList;

public class Print {
	
Main main = new Main();
OrderList orderlist = new OrderList();

 public static void print_error_message(){ //에러메세지 출력
        System.out.println("잘못 입력하셨습니다.");
 }

 
 public static void print_price(int price_result) { //가격 문구
     System.out.printf("가격은 %d 원 입니다.\n", price_result); 
     System.out.println("감사합니다.");
     System.out.println();
 }

 public void print_List_Of_Orders() { 
	 System.out.println("티켓 발권을 종료합니다. 감사합니다");
	 System.out.println("==========에버랜드==========");
	 ArrayList<int[]> orderList = orderlist.getOrderList();
	 for (int[] order : orderList) {
		 for (int item : order) {
			 System.out.print(item + " ");
		 }
		 System.out.println();
	 }
	 System.out.println("입장료 총액은" + " 원 입니다." );
 }

	 










}


