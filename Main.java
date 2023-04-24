package Practice;
public class Main {

//Main class에서 사용하는 변수 선언
private int ticketselect;
private int agegroup;
private int specialrates;
private int ticketamount;
private int price;
private int con;
private int concon;
private int cnt = 0;


public static void main(String[] args){
	Cal cal = new Cal();
	Print print = new Print();
	Input input = new Input();
	Main main = new Main();
	OrderList orderlist = new OrderList();
	
	do {
		while(true) {
		main.cnt++; //주문 카운트
		
		main.ticketselect =Input.input_Ticket_Select(); //권종 입력
		main.agegroup = cal.cal_Age_Group(); //주민번호 입력, 나이 계산
		main.specialrates = Input.input_Special_Rates(); //우대권 입력
		main.ticketamount = Input.input_Ticket_Amount(); //수량 입력
		
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
	} while (main.concon == 1 | main.cnt < 10 ); 	//입력값이 1이거나 주문수가 10보다 작을때까지 무한 반복
	
	main.cnt = 0; //cnt 초기화
	OrderList.orderList.clear(); //orderlist array 를 초기화
	}
}
