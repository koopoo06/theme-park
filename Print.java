package Practice;

import java.util.ArrayList;

import Practice.Cal.Const;

public class Print {
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
	 //헤더 출력 
	 System.out.println("티켓 발권을 종료합니다. 감사합니다");
	 System.out.println("====================================================");
	 System.out.printf("%5s %7s %5s %5s %10s\n", "권종", "나이", "주문개수", "이용요금", "우대사항");
	 System.out.println("----------------------------------------------------");
	
	 //필요한 변수 선언
	 int[] order = {};
	 String ticketselect = "";
	 String agegroup = "";
	 int quantity = 0;
	 int price = 0;
	 int totalprice = 0;
	 String discount ="";
	 
	 
	// ArrayList<int[]> print_orderList = orderlist.getOrderList();
	 for (int i = 0 ; i < OrderList.orderList.size(); i++) { //orderlist배열의 크기만큼 반복
		 order = OrderList.orderList.get(i); //orderlist의 i번째 배열을 order 배열에 저장
	
		 ticketselect = order[0] == 1 ? Const.DAY_TICKET : Const.NIGHT_TICKET;
		 //첫번째 자리가 1이라면 "주중권", 아니라면 "오후권" 문자열을 변수에 저장
		 
		 
		 switch(order[1]) {
		 case 1:	 agegroup = Const.AGE_BABY; break;
		 case 2:	 agegroup = Const.AGE_CHILD; break;
		 case 3:	 agegroup = Const.AGE_TEEN; break;
		 case 4:	 agegroup = Const.AGE_ADULT; break;
		 case 5:	 agegroup = Const.AGE_OLD; break;
		 }
		 //두번째 자리가 각각 1,2,3,4,5일때 연령층 문자열을 변수에 저장
		 
		 quantity = order[2];
		 //수량은 3번째 자리
		 
		 
		 price = order[3];
		 totalprice = totalprice + order[3];
		 //가격은 합계로 구하기
		 
		 
		 switch(order[4]) {
		 case 1:	 discount = Const.NO_DISCOUNT; break;
		 case 2:	 discount = Const.DISABLE_DISCOUNT; break;
		 case 3:	 discount = Const.MERIT_DISCOUNT; break;
		 case 4:	 discount = Const.MULTICHILD_DISCOUNT; break;
		 case 5:	 discount = Const.PREGNANT_DISCOUNT; break;
		 }
		 //배열의 5번째자리는 할인사항 각각 1,2,3,4,5일때 문자열을 변수에 저장 
		 
		 
		 System.out.printf("%5s %5s %5d %15d원 %10s \n", ticketselect, agegroup, quantity, price, discount); //변수들 출력
	 }
	 System.out.println();
	 System.out.println("  입장료 총액은 " + totalprice + " 원 입니다.");
	 System.out.println("=====================================================");
 	}
 }



