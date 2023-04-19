package Practice;

import java.util.ArrayList;

public class Main {
public int a;
public int b;
public int c;
public int d;
public int e;
public int f;
public int x;

public static void main(String[] args){
	Cal cal = new Cal();
	Print print = new Print();
	Input input = new Input();
	Main main = new Main();
	OrderList orderlist = new OrderList();
	
	do {
		while(true) {
		main.a =Input.input_Ticket_Select();
		main.b = cal.cal_Age_Group();
		main.c = Input.input_Special_Rates();
		main.f = Input.input_Ticket_Amount();
		
		
		main.x = (cal.cal_Price(main.a, main.b, main.c,main.f));
		Print.print_price(main.x);
		
		
		///test///
		orderlist.set_All(main.a, main.b, main.f, main.x, main.c);
		orderlist.set_Order_List();
		


		//test
		
		main.d = input.input_Continue();
		if (main.d == 2) {
			break;
		}
		}
		
	print.print_List_Of_Orders();
	main.e = input.input_Continue_Continue();
	} while (main.e == 1); 	
}
	}




//System.out.println(Input.input_Ticket_Select());
//System.out.println(cal.cal_Age_Group());
//System.out.println(cal.cal_Price(Input.input_Ticket_Select(), cal.cal_Age_Group()));