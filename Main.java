package Practice;
public class Main {

//Main class���� ����ϴ� ���� ����
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
		main.cnt++; //�ֹ� ī��Ʈ
		
		main.ticketselect =Input.input_Ticket_Select(); //���� �Է�
		main.agegroup = cal.cal_Age_Group(); //�ֹι�ȣ �Է�, ���� ���
		main.specialrates = Input.input_Special_Rates(); //���� �Է�
		main.ticketamount = Input.input_Ticket_Amount(); //���� �Է�
		
		main.price = (cal.cal_Price(main.ticketselect, main.agegroup, main.specialrates,main.ticketamount));
		Print.print_price(main.price);
		

		orderlist.setOrderList (main.ticketselect, main.agegroup, main.ticketamount, main.price, main.specialrates);
		
	
		main.con = input.input_Continue(); //�����Ͻðڽ��ϱ�?
		if (main.con == 2) { //�Է°��� 2 : ������ �ݺ��� break
			break;
		}
	}
	
	print.print_List_Of_Orders();
	main.concon = input.input_Continue_Continue();
	} while (main.concon == 1 | main.cnt < 10 ); 	//�Է°��� 1�̰ų� �ֹ����� 10���� ���������� ���� �ݺ�
	
	main.cnt = 0; //cnt �ʱ�ȭ
	OrderList.orderList.clear(); //orderlist array �� �ʱ�ȭ
	}
}
