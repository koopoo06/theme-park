package Practice;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import Practice.Cal.Const;

public class Print {
OrderList orderlist = new OrderList();

public static ArrayList<String[]> excel_list = new ArrayList<String[]>(); //excel array save
private String ticketselect, agegroup, discount;
private int quantity, price;
private LocalDateTime now;





public static void print_first_message() {
	System.out.println("매뉴를 선택하세요\n1. 티켓발권\n2. 매출분석");
}



public static void print_error_message(){ //에러메세지 출력
if (Const.LANGUAGE == 0) {
	Const.ERROR_MESSAGE = "잘못 입력하셨습니다.";
	System.out.println(Const.ERROR_MESSAGE);
 } else if  (Const.LANGUAGE == 1){
	 Const.ERROR_MESSAGE = "Please try again";
	 System.out.println(Const.ERROR_MESSAGE);
 } else if  (Const.LANGUAGE == 2){
	 Const.ERROR_MESSAGE = "Inténtalo de nuevo";
	 System.out.println(Const.ERROR_MESSAGE);
 }
}




public static void print_ticket_select() {
	if (Const.LANGUAGE == 0) {
		Const.QUESTION_TICKETSELECT = "권종을 선택하세요." + "\n1. 주간권\n" + "2. 야간권";
		System.out.println(Const.QUESTION_TICKETSELECT);
	} else if (Const.LANGUAGE == 1) {
		Const.QUESTION_TICKETSELECT = "Choose a ticket type" + "\n1. Day ticket\n" + "2. Night ticket";
		System.out.println(Const.QUESTION_TICKETSELECT);
	}  else if  (Const.LANGUAGE == 2) {
		Const.QUESTION_TICKETSELECT = "Elige un tipo de entrada" + "\n1. Entrada de un día\n" + "2. Entrada nocturna";
		System.out.println(Const.QUESTION_TICKETSELECT);
	}
}




public static void print_ID_num() {
	if (Const.LANGUAGE == 0) {
		Const.QUESTION_ID_NUM = "주민등록번호를 입력하세요.";
		System.out.println(Const.QUESTION_ID_NUM);
	}  else if (Const.LANGUAGE == 1) {
		Const.QUESTION_ID_NUM = "Input your ID number";
		System.out.println(Const.QUESTION_ID_NUM);
	} else if  (Const.LANGUAGE == 2) {
		Const.QUESTION_ID_NUM = "Ingrese su número de identificación";
		System.out.println(Const.QUESTION_ID_NUM);
	}
}

 



public static void print_ticket_amount() {
	if (Const.LANGUAGE == 0) {
		Const.QUESTION_TICKET_AMOUNT = "몇 개를 주문하시겠습니까? (최대 10개)";
		System.out.println(Const.QUESTION_TICKET_AMOUNT);
	}  else if (Const.LANGUAGE == 1) {
		Const.QUESTION_TICKET_AMOUNT = "Input the number of tickets (Maximum of 10)";
		System.out.println(Const.QUESTION_TICKET_AMOUNT);
	} else if  (Const.LANGUAGE == 2) {
		Const.QUESTION_TICKET_AMOUNT = "Ingrese el número de boletos (Máximo de 10)";
		System.out.println(Const.QUESTION_TICKET_AMOUNT);
	}
}






public static void print_special_rates() {
	if (Const.LANGUAGE == 0) {
		Const.QUESTION_SPECIAL = "우대사항을 선택하세요.\n" + "1. 없음 (나이 우대는 자동처리)\n" + "2. 장애인\n" 
				+ "3. 국가유공자\n" + "4. 다자녀\n" + "5. 임산부";
		System.out.println(Const.QUESTION_SPECIAL);
	}  else if (Const.LANGUAGE == 1) {
		Const.QUESTION_SPECIAL = "Select a special discount option\n" + "1. None applicable\n" + "2. Disorder\n" 
				+ "3. National merit\n" + "4. Multi-child family\n" + "5. Expectant Mother";
		System.out.println(Const.QUESTION_SPECIAL);
	} else if  (Const.LANGUAGE == 2) {
		Const.QUESTION_SPECIAL = "Seleccione una opción de descuento especial\n" + "1. Ninguno aplicable\n" + "2. Trastorno\n"
				+ "3. Mérito nacional\n" + "4. Familia con varios hijos\n" + "5. Futura madre";
		System.out.println(Const.QUESTION_SPECIAL);
	}
}




 public static void print_price(int price_result) { //가격 문구
	 if (Const.LANGUAGE == 0) {
		 Const.PRICE_MESSAGE = "가격은" + price_result + " 원 입니다. \n 감사합니다.\n";
		 System.out.println(Const.PRICE_MESSAGE);
	 } else if (Const.LANGUAGE == 1) {
		 Const.PRICE_MESSAGE = "The ticket price is " + price_result + " won.\nThank you.\n";
		 System.out.println(Const.PRICE_MESSAGE);
	 } else if  (Const.LANGUAGE == 2) {
		Const.PRICE_MESSAGE = "El precio del boleto es " + price_result + " won. \n Gracias.\n";
		System.out.println(Const.PRICE_MESSAGE);
	}
 }

 
 
 
 public static void print_continue() {
	 if (Const.LANGUAGE == 0) {
		 Const.QUESTION_CONTINUE = "계속 발권 하시겠습니까?\n1. 티켓 발권\n2. 종료";
		 System.out.println(Const.QUESTION_CONTINUE);
	 } else if (Const.LANGUAGE == 1) {
		 Const.QUESTION_CONTINUE = "Do you like to order more?\n1. Yes please \n2. No I've ordered all";
		 System.out.println(Const.QUESTION_CONTINUE);
	 } else if  (Const.LANGUAGE == 2) {
		Const.QUESTION_CONTINUE = "¿Quiere pedir más?\n1. Sí, por favor \n2. No, he pedido todo";
		System.out.println(Const.QUESTION_CONTINUE);
	}
 }
 
 
 

 
 public static void print_continue_final() {
	 if (Const.LANGUAGE == 0) {
		 Const.QUESTION_CONTINUE_FINAL = "계속 진행 (1: 새로운 주문, 2: 프로그램 종료): ";
		 System.out.println(Const.QUESTION_CONTINUE_FINAL);
	 } else if (Const.LANGUAGE == 1)  {
		 Const.QUESTION_CONTINUE_FINAL = "Continue order (1 : New order , 2: Exit program)";
		 System.out.println(Const.QUESTION_CONTINUE_FINAL);
	 } else if  (Const.LANGUAGE == 2) {
		Const.QUESTION_CONTINUE_FINAL = "Continuar pedido (1: Nuevo pedido, 2: Salir del programa)";
		System.out.println(Const.QUESTION_CONTINUE_FINAL);
	}
 }
 
 
 
 
 public static void print_header() {
	 if (Const.LANGUAGE == 0) {
		 Const.HEADER_MESSAGE = "티켓 발권을 종료합니다. 감사합니다\n";
		 System.out.println(Const.HEADER_MESSAGE);
	 } else if (Const.LANGUAGE == 1) {
		 Const.HEADER_MESSAGE = "Exit the program. Thank you\n";
		 System.out.println(Const.HEADER_MESSAGE);
	 } else if  (Const.LANGUAGE == 2) {
		Const.HEADER_MESSAGE = "Salir del programa. Gracias\n";
		System.out.println(Const.HEADER_MESSAGE);
		}
 }
 
 
 
 
 public static void print_divider() {
	 System.out.println("-----------------------------------------------------");
 }
 
 
 
 public static void print_divider_bold() {
	 System.out.println("=====================================================");
 } 
 
 
 
 
 
 public static void print_header_title() {
	 if (Const.LANGUAGE == 0) {
		 Const.TICKET_SELECT = "권종";
		 Const.AGE = "나이";
		 Const.COUNT = "주문개수";
		 Const.PRICE = "이용요금";
		 Const.DISCOUNT = "우대사항";
	 } else if (Const.LANGUAGE == 1)  {
		 Const.TICKET_SELECT = "TYPES";
		 Const.AGE = "AGES";
		 Const.COUNT = "AMOUNTS";
		 Const.PRICE = "CHARGES";
		 Const.DISCOUNT = "DISCOUNTS";
	 } else if  (Const.LANGUAGE == 2) {
		 Const.TICKET_SELECT = "TIPOS";
		 Const.AGE = "EDADES";
		 Const.COUNT = "CANTIDADES";
		 Const.PRICE = "CARGOS";
		 Const.DISCOUNT = "DESCUENTO ";
	 }
 }
 
 
 
 public static void print_total_prices (int totalprice) {
		if (Const.LANGUAGE == 0) {
			 Const.TOTALPRICE_MESSAGE = "  입장료 총액은 " + totalprice + " 원 입니다.";
			 System.out.println(Const.TOTALPRICE_MESSAGE);
		 } else if (Const.LANGUAGE == 1) {
			 Const.TOTALPRICE_MESSAGE = "  TOTAL PRICE IS " + totalprice + " WON";
			 System.out.println(Const.TOTALPRICE_MESSAGE);
		 }  else if  (Const.LANGUAGE == 2) {
			 Const.TOTALPRICE_MESSAGE = " EL PRECIO TOTAL ES " + totalprice + " WON";
			 System.out.println(Const.TOTALPRICE_MESSAGE);
		 }
	}
 
 
 
 
 public void print_List_Of_Orders() { 
	 //헤더 출력 
	 print_header();
	 print_divider_bold();
	 print_header_title();
	 System.out.printf("%8s %7s %5s %5s %10s\n", Const.TICKET_SELECT, Const.AGE ,Const.COUNT,  Const.PRICE, Const.DISCOUNT );
	 print_divider();
	
	 //필요한 변수 선언
	 int[] order = {};
	 int totalprice = 0;
	 
	 now = LocalDateTime.now();
	 
	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
	 
	 String now_formatted = now.format(formatter);
	 
	 
	 for (int i = 0 ; i < OrderList.orderList.size(); i++) { //orderlist배열의 크기만큼 반복
		 order = OrderList.orderList.get(i); //orderlist의 i번째 배열을 order 배열에 저장
		 
		 if (Const.LANGUAGE == 0) {
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
	
	} else if (Const.LANGUAGE == 1) {
		 ticketselect = order[0] == 1 ? Const.ENG_DAY_TICKET : Const.ENG_NIGHT_TICKET;
		 //첫번째 자리가 1이라면 "주중권", 아니라면 "오후권" 문자열을 변수에 저장
		 
		 
		 switch(order[1]) {
		 case 1:	 agegroup = Const.ENG_AGE_BABY; break;
		 case 2:	 agegroup = Const.ENG_AGE_CHILD; break;
		 case 3:	 agegroup = Const.ENG_AGE_TEEN; break;
		 case 4:	 agegroup = Const.ENG_AGE_ADULT; break;
		 case 5:	 agegroup = Const.ENG_AGE_OLD; break;
		 }
		 //두번째 자리가 각각 1,2,3,4,5일때 연령층 문자열을 변수에 저장
		 
		 quantity = order[2];
		 //수량은 3번째 자리
		 
		 
		 price = order[3];
		 totalprice = totalprice + order[3];
		 //가격은 합계로 구하기
		 
		 
		 switch(order[4]) {
		 case 1:	 discount = Const.ENG_NO_DISCOUNT; break;
		 case 2:	 discount = Const.ENG_DISABLE_DISCOUNT; break;
		 case 3:	 discount = Const.ENG_MERIT_DISCOUNT; break;
		 case 4:	 discount = Const.ENG_MULTICHILD_DISCOUNT; break;
		 case 5:	 discount = Const.ENG_PREGNANT_DISCOUNT; break;
		 }
		 //배열의 5번째자리는 할인사항 각각 1,2,3,4,5일때 문자열을 변수에 저장 
		 
		 System.out.printf("%8s %9s %4d %11dW %14s \n", ticketselect, agegroup, quantity, price, discount); //변수들 출력 
	 } else if (Const.LANGUAGE == 2) {

		 ticketselect = order[0] == 1 ? Const.ESP_DAY_TICKET : Const.ESP_NIGHT_TICKET;
		 //첫번째 자리가 1이라면 "주중권", 아니라면 "오후권" 문자열을 변수에 저장
		 
		 
		 switch(order[1]) {
		 case 1:	 agegroup = Const.ESP_AGE_BABY; break;
		 case 2:	 agegroup = Const.ESP_AGE_CHILD; break;
		 case 3:	 agegroup = Const.ESP_AGE_TEEN; break;
		 case 4:	 agegroup = Const.ESP_AGE_ADULT; break;
		 case 5:	 agegroup = Const.ESP_AGE_OLD; break;
		 }
		 //두번째 자리가 각각 1,2,3,4,5일때 연령층 문자열을 변수에 저장
		 
		 quantity = order[2];
		 //수량은 3번째 자리
		 
		 
		 price = order[3];
		 totalprice = totalprice + order[3];
		 //가격은 합계로 구하기
		 
		 
		 switch(order[4]) {
		 case 1:	 discount = Const.ESP_NO_DISCOUNT; break;
		 case 2:	 discount = Const.ESP_DISABLE_DISCOUNT; break;
		 case 3:	 discount = Const.ESP_MERIT_DISCOUNT; break;
		 case 4:	 discount = Const.ESP_MULTICHILD_DISCOUNT; break;
		 case 5:	 discount = Const.ESP_PREGNANT_DISCOUNT; break;
		 }
		 //배열의 5번째자리는 할인사항 각각 1,2,3,4,5일때 문자열을 변수에 저장 
		 
		 
		 System.out.printf("%8s %9s %4d %11dW %14s \n", ticketselect, agegroup, quantity, price, discount); //변수들 출력 
	 }
	 
	 //excel list
	 String[] print_excel_array = {now_formatted, ticketselect, agegroup, String.valueOf(quantity), String.valueOf(price), discount};
	 
	 excel_list.add(print_excel_array);
	 
 //for ends here
	 }

	System.out.println();
	
	print_total_prices(totalprice);
	
	print_divider_bold();
	
	OrderList.orderList.clear();
 	}
 }



