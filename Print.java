package Practice;

import java.util.ArrayList;

import Practice.Cal.Const;

public class Print {

Main main = new Main();
OrderList orderlist = new OrderList();

private int print_price_total = 0;


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
	 System.out.println("===============================================");
	 System.out.printf("%5s %5s %5s %10s %15s\n", "권종", "나이", "주문개수", "이용요금", "우대사항");
	 System.out.println("----------------------------------------------------");
	 
	 
	 ArrayList<int[]> print_orderList = orderlist.getOrderList();
	 for (int i = 0 ; i < print_orderList.size(); i++) {
		 int[] order = print_orderList.get(i);
	
		 String ticketselect = order[0] == 1 ? Const.DAY_TICKET : Const.NIGHT_TICKET;
		 
		 String agegroup = "";
		 switch(order[1]) {
		 case 1:	 agegroup = Const.AGE_BABY; break;
		 case 2:	 agegroup = Const.AGE_CHILD; break;
		 case 3:	 agegroup = Const.AGE_TEEN; break;
		 case 4:	 agegroup = Const.AGE_ADULT; break;
		 case 5:	 agegroup = Const.AGE_OLD; break;
		 }

		 
		 int quantity = order[2];
		 
		 int price = order[3];
		 print_price_total = print_price_total + price;
		 
		 
		 String discount ="";
		 switch(order[4]) {
		 case 1:	 discount = Const.NO_DISCOUNT; break;
		 case 2:	 discount = Const.DISABLE_DISCOUNT; break;
		 case 3:	 discount = Const.MERIT_DISCOUNT; break;
		 case 4:	 discount = Const.MULTICHILD_DISCOUNT; break;
		 case 5:	 discount = Const.PREGNANT_DISCOUNT; break;
		 }
		 
		 System.out.printf("%5s %5s %5d %10d원 *%15s \n", ticketselect, agegroup, quantity, price, discount); 
	 }
	 System.out.println("입장료 총액은 " + print_price_total + " 원 입니다.");
	 System.out.println("==================================================");
 	}
 }



