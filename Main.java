package Practice;

import java.util.ArrayList;

public class Main {
public int ticketselect;
public int agegroup;
public int specialrates;
public int ticketamount;
public int price;
public int con;
public int concon;

public static void main(String[] args){
	Cal cal = new Cal();
	Print print = new Print();
	Input input = new Input();
	Main main = new Main();
	OrderList orderlist = new OrderList();
	
	do {
		while(true) {
		main.ticketselect =Input.input_Ticket_Select();
		main.agegroup = cal.cal_Age_Group();
		main.specialrates = Input.input_Special_Rates();
		main.ticketamount = Input.input_Ticket_Amount();
		
		main.price = (cal.cal_Price(main.ticketselect, main.agegroup, main.specialrates,main.ticketamount));
		Print.print_price(main.price);
		

		orderlist.setOrderList (main.ticketselect, main.agegroup, main.ticketamount, main.price, main.specialrates);
		
	
		main.con = input.input_Continue(); //종료하시겠습니까?
		if (main.con == 2) { //입력값이 2 : 종료라면 반복문 break
			break;
		}
	}
	
	print.print_List_Of_Orders();
	main.concon = input.input_Continue_Continue();
	} while (main.concon == 1); 	//프로그램 종료인 2가 아니라면 무한 반복
	
	orderlist.orderList.clear(); //orderlist array 를 초기화
	}
}
