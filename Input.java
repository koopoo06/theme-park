package Practice;

import java.util.Scanner;

public class Input {
	Print print = new Print();
	Cal cal = new Cal();
	static Scanner scanner = new Scanner(System.in);		
	
	
public static int input_Ticket_Select() { // 1. ���� �Է� -> ticketSelect ���Ϲ��� (�ְ��� / �߰���)

	int ticket_select = 0;
	
	do {
			System.out.println("������ �����ϼ���.");
			System.out.println("1. �ְ���");
			System.out.println("2. �߰���");
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
	System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���.");
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
	System.out.println("�� ���� �ֹ��Ͻðڽ��ϱ�? (�ִ� 10��)");
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
		System.out.println("�������� �����ϼ���.");
		System.out.println("1. ���� (���� ���� �ڵ�ó��)");
		System.out.println("2. �����");
		System.out.println("3. ����������");
		System.out.println("4. ���ڳ�");
		System.out.println("5. �ӻ��");
	
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
		System.out.println("��� �߱� �Ͻðڽ��ϱ�?");
		System.out.println("1. Ƽ�� �߱�");
		System.out.println("2. ����");
		
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
	System.out.println("��� ����(1: ���ο� �ֹ�, 2: ���α׷� ����): ");
	input_exit = scanner.nextInt();
	
	} while (input_exit < 1 | input_exit > 2);
	
	
	return input_exit;
}

}
