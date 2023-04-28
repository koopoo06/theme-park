package Practice;

import Practice.Cal.Const;

public class Main {

//Main class���� ����ϴ� ���� ����
private int ticketselect;
private int agegroup;
private int specialrates;
private int ticketamount;
private int price;
private int con;
private int concon;


public static void main(String[] args){
	Cal cal = new Cal();
	Print print = new Print();
	Input input = new Input();
	Main main = new Main();
	OrderList orderlist = new OrderList();
	
	cal.cal_language(); //language change

	do {
		 int menu_select = Input.input_first_menu(); //1. buy ticket 2. sales report
		 
		 if (menu_select == 2) { //read and show CSV Sales Report file
			 Excel.reading_file();
		 }
		 
		 if (menu_select == 1) { 
		while(true) {		
		main.ticketselect =Input.input_Ticket_Select(); //���� �Է�
		main.agegroup = cal.cal_Age_Group(); //�ֹι�ȣ �Է�, ���� ���
		main.specialrates = Input.input_Special_Rates(); //���� �Է�
		main.ticketamount = Input.input_Ticket_Amount(); //���� �Է�
		
		main.price = (cal.cal_Price(main.ticketselect, main.agegroup, main.specialrates,main.ticketamount));
		Print.print_price(main.price);
		

		orderlist.setOrderList (main.ticketselect, main.agegroup, main.ticketamount, main.price, main.specialrates);
		
	
		main.con = input.input_Continue(); //�����Ͻðڽ��ϱ�?
		if (main.con != Const.EXIT) { //�Է°��� 2�̸� �ݺ��� break
			break;
		}
	}
	print.print_List_Of_Orders();	
	}
		
	 Excel.writing_file(); //write file of new data
	 main.concon = input.input_Continue_Continue(); 
	 
	} while (main.concon == Const.EXIT); 	//�Է°��� 1 ������ ���� �ݺ�
	}
}
