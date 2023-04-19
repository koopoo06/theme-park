package Practice;

import java.util.Scanner;

public class Input {
	Print print = new Print();
	Cal cal = new Cal();
	static Scanner scanner = new Scanner(System.in);		
	
	
public static int input_Ticket_Select() { // 1. 권종 입력 -> ticketSelect 리턴받음 (주간권 / 야간권)

	int ticket_select = 0;
	
	do {
			System.out.println("권종을 선택하세요.");
			System.out.println("1. 주간권");
			System.out.println("2. 야간권");
			ticket_select = scanner.nextInt();
		
	    if (ticket_select < 1 || ticket_select > 2) {
	        Print.print_error_message();
	    } else if (ticket_select == 2) {
	    	break;
	    }
		} while (ticket_select < 1 || ticket_select > 2);
	
	return ticket_select;
}




	
public static String input_ID_Num() { // 2. 주민번호 입력
		
	String id_num;
			
	do {
	System.out.println("주민등록번호를 입력하세요.");
	id_num = scanner.next();
	
	if (id_num.length() != 13) {
		Print.print_error_message();
	}
	} while (id_num.length() != 13); 
	
	return id_num;
	}







public static int input_Ticket_Amount() { // 3. 주문 갯수 입력 
	
	int order_amount = 0;
	
	do {
	System.out.println("몇 개를 주문하시겠습니까? (최대 10개)");
	order_amount = scanner.nextInt();

	if (order_amount == 0 | order_amount > 10) {
		Print.print_error_message();
	}
	} while (order_amount == 0 | order_amount > 10); 
	
	
	return order_amount;
}






public static int input_Special_Rates() {	// 4. 우대사항
	int special_rates = 0;
	
	do {
		System.out.println("우대사항을 선택하세요.");
		System.out.println("1. 없음 (나이 우대는 자동처리)");
		System.out.println("2. 장애인");
		System.out.println("3. 국가유공자");
		System.out.println("4. 다자녀");
		System.out.println("5. 임산부");
	
	special_rates = scanner.nextInt();
	
	if (special_rates < 1 | special_rates > 5 ) {
		Print.print_error_message();
	}
	} while (special_rates < 1 | special_rates > 5 );
	
	
	return special_rates;
}





public int input_Continue () { //위 주문입력이 끝났을 때 
  
	int input_continue = 0;
  
    do {
		System.out.println("계속 발권 하시겠습니까?");
		System.out.println("1. 티켓 발권");
		System.out.println("2. 종료");
		
		input_continue = scanner.nextInt();

		if (input_continue < 1 | input_continue > 2) {
    	Print.print_error_message();
		}
	    } while (input_continue < 1 | input_continue > 2);    

    return input_continue;
}




public int input_Continue_Continue() {
	int input_exit = 0;
	
	do {
	System.out.println("계속 진행(1: 새로운 주문, 2: 프로그램 종료): ");
	input_exit = scanner.nextInt();
	
	} while (input_exit < 1 | input_exit > 2);
	
	
	return input_exit;
}

}
