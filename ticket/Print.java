package Practice;

import java.util.ArrayList;

public class Print {
	
Main main = new Main();
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
	 System.out.println("Ƽ�� �߱��� �����մϴ�. �����մϴ�");
	 System.out.println("==========��������==========");
	 ArrayList<int[]> orderList = orderlist.getOrderList();
	 for (int[] order : orderList) {
		 for (int item : order) {
			 System.out.print(item + " ");
		 }
		 System.out.println();
	 }
	 System.out.println("����� �Ѿ���" + " �� �Դϴ�." );
 }

	 










}


