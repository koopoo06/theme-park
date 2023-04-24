package Practice;

import java.util.ArrayList;

import Practice.Cal.Const;

public class Print {
OrderList orderlist = new OrderList();




public static void print_error_message(){ //�����޼��� ���
        System.out.println("�߸� �Է��ϼ̽��ϴ�.");
 }

 
 public static void print_price(int price_result) { //���� ����
     System.out.printf("������ %d �� �Դϴ�.\n", price_result); 
     System.out.println("�����մϴ�.");
     System.out.println();
 }

 
 
 public void print_List_Of_Orders() { 
	 //��� ��� 
	 System.out.println("Ƽ�� �߱��� �����մϴ�. �����մϴ�");
	 System.out.println("====================================================");
	 System.out.printf("%5s %7s %5s %5s %10s\n", "����", "����", "�ֹ�����", "�̿���", "������");
	 System.out.println("----------------------------------------------------");
	
	 //�ʿ��� ���� ����
	 int[] order = {};
	 String ticketselect = "";
	 String agegroup = "";
	 int quantity = 0;
	 int price = 0;
	 int totalprice = 0;
	 String discount ="";
	 
	 
	// ArrayList<int[]> print_orderList = orderlist.getOrderList();
	 for (int i = 0 ; i < OrderList.orderList.size(); i++) { //orderlist�迭�� ũ�⸸ŭ �ݺ�
		 order = OrderList.orderList.get(i); //orderlist�� i��° �迭�� order �迭�� ����
	
		 ticketselect = order[0] == 1 ? Const.DAY_TICKET : Const.NIGHT_TICKET;
		 //ù��° �ڸ��� 1�̶�� "���߱�", �ƴ϶�� "���ı�" ���ڿ��� ������ ����
		 
		 
		 switch(order[1]) {
		 case 1:	 agegroup = Const.AGE_BABY; break;
		 case 2:	 agegroup = Const.AGE_CHILD; break;
		 case 3:	 agegroup = Const.AGE_TEEN; break;
		 case 4:	 agegroup = Const.AGE_ADULT; break;
		 case 5:	 agegroup = Const.AGE_OLD; break;
		 }
		 //�ι�° �ڸ��� ���� 1,2,3,4,5�϶� ������ ���ڿ��� ������ ����
		 
		 quantity = order[2];
		 //������ 3��° �ڸ�
		 
		 
		 price = order[3];
		 totalprice = totalprice + order[3];
		 //������ �հ�� ���ϱ�
		 
		 
		 switch(order[4]) {
		 case 1:	 discount = Const.NO_DISCOUNT; break;
		 case 2:	 discount = Const.DISABLE_DISCOUNT; break;
		 case 3:	 discount = Const.MERIT_DISCOUNT; break;
		 case 4:	 discount = Const.MULTICHILD_DISCOUNT; break;
		 case 5:	 discount = Const.PREGNANT_DISCOUNT; break;
		 }
		 //�迭�� 5��°�ڸ��� ���λ��� ���� 1,2,3,4,5�϶� ���ڿ��� ������ ���� 
		 
		 
		 System.out.printf("%5s %5s %5d %15d�� %10s \n", ticketselect, agegroup, quantity, price, discount); //������ ���
	 }
	 System.out.println();
	 System.out.println("  ����� �Ѿ��� " + totalprice + " �� �Դϴ�.");
	 System.out.println("=====================================================");
 	}
 }



