package Practice;

import java.util.Scanner;
import Practice.Print;

public class Input {
	Print print = new Print();
	Cal cal = new Cal();
	static Scanner scanner = new Scanner(System.in);		

	
	
public static int input_first_menu() {	//�Ŵ��� �����ϼ���	1. Ƽ�Ϲ߱�	2. ����м�
	Print.print_first_message();
	
	int menu_select = 0;
	menu_select = scanner.nextInt();
	
	return menu_select;
}

	
	
	

public static int input_Ticket_Select() { // 1. ���� �Է� -> ticketSelect ���Ϲ��� (�ְ��� / �߰���)

	int ticket_select = 0;
	
	do {
		Print.print_ticket_select();
		ticket_select = scanner.nextInt();
		
	    if (ticket_select < 1 || ticket_select > 2) {
	        Print.print_error_message();
	    } else if (ticket_select == 2) {
	    	break;
	    }
		} while (ticket_select < 1 || ticket_select > 2);
	
	return ticket_select;
}




	
public static String input_ID_Num() { // 2. �ֹι�ȣ �Է�
		
	String id_num;
			
	do {
	Print.print_ID_num();
	id_num = scanner.next();
	
	if (id_num.length() != 13) {
		Print.print_error_message();
	}
	} while (id_num.length() != 13); 
	
	return id_num;
	}







public static int input_Ticket_Amount() { // 3. �ֹ� ���� �Է� 
	
	int order_amount = 0;
	
	do {
	Print.print_ticket_amount();
	order_amount = scanner.nextInt();

	if (order_amount == 0 | order_amount > 10) {
		Print.print_error_message();
	}
	} while (order_amount == 0 | order_amount > 10); 
	
	
	return order_amount;
}






public static int input_Special_Rates() {	// 4. ������
	int special_rates = 0;
	
	do {
	Print.print_special_rates();
	special_rates = scanner.nextInt();
	
	if (special_rates < 1 | special_rates > 5 ) {
		Print.print_error_message();
	}
	} while (special_rates < 1 | special_rates > 5 );
	
	return special_rates;
}





public int input_Continue () { //�� �ֹ��Է��� ������ �� 
  
	int input_continue = 0;
  
    do {
		Print.print_continue();
		
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
	Print.print_continue_final();
	input_exit = scanner.nextInt();
	
	} while (input_exit < 1 | input_exit > 2);
	
	
	return input_exit;
}

}
