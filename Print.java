package Practice;

import java.util.ArrayList;

import Practice.Cal.Const;

public class Print {

Main main = new Main();
OrderList orderlist = new OrderList();

private int print_price_total = 0;


public static void print_error_message(){ //�����޼��� ���
        System.out.println("�߸� �Է��ϼ̽��ϴ�.");
 }

 
 public static void print_price(int price_result) { //���� ����
     System.out.printf("������ %d �� �Դϴ�.\n", price_result); 
     System.out.println("�����մϴ�.");
     System.out.println();
 }

 
 
 public void print_List_Of_Orders() { 
	 System.out.println("Ƽ�� �߱��� �����մϴ�. �����մϴ�");
	 System.out.println("===============================================");
	 System.out.printf("%5s %5s %5s %10s %15s\n", "����", "����", "�ֹ�����", "�̿���", "������");
	 System.out.println("----------------------------------------------------");
	 
	 
	 ArrayList<int[]> print_orderList = orderlist.getOrderList();
	 for (int i = 0 ; i < print_orderList.size(); i++) {
		 int[] order = print_orderList.get(i);
	
		 String ticketselect = order[0] == 1 ? Const.DAY_TICKET : Const.NIGHT_TICKET;
		 
		 String agegroup = "";
		 switch(order[1]) {
		 case 1:	 agegroup = Const.AGE_BABY; break;
		 case 2:	 agegroup = Const.AGE_CHILD; break;
		 case 3:	 agegroup = Const.AGE_TEEN; break;
		 case 4:	 agegroup = Const.AGE_ADULT; break;
		 case 5:	 agegroup = Const.AGE_OLD; break;
		 }

		 
		 int quantity = order[2];
		 
		 int price = order[3];
		 print_price_total = print_price_total + price;
		 
		 
		 String discount ="";
		 switch(order[4]) {
		 case 1:	 discount = Const.NO_DISCOUNT; break;
		 case 2:	 discount = Const.DISABLE_DISCOUNT; break;
		 case 3:	 discount = Const.MERIT_DISCOUNT; break;
		 case 4:	 discount = Const.MULTICHILD_DISCOUNT; break;
		 case 5:	 discount = Const.PREGNANT_DISCOUNT; break;
		 }
		 
		 System.out.printf("%5s %5s %5d %10d�� *%15s \n", ticketselect, agegroup, quantity, price, discount); 
	 }
	 System.out.println("����� �Ѿ��� " + print_price_total + " �� �Դϴ�.");
	 System.out.println("==================================================");
 	}
 }



