package Practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Excel {

private static FileWriter fw = null;
private static FileReader fr = null;
	
public static void writing_file() {
//	Print.excel_list
	try {
		String file_path = "C:\\Users\\�����1\\Desktop\\����\\C���\\SalesReport.csv";
		fw = new FileWriter(file_path, true); // true: ���� ���Ͽ� ������ �߰��� ������ ��Ÿ��
		fr = new FileReader(file_path);
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		
        // ���ο� �����͸� �߰��� ���� ����� ������ ����
        if ((line = br.readLine()) == null) {
            fw.write("��¥, ����, ���ɱ���, ����, ����, ������\n");
        }
        
		for (String[] a : Print.excel_list) {
			String b = String.join(",", a);
			fw.write(b + "\n");
		}
		
		Print.excel_list.clear();
		fw.close();		
	} catch (IOException e) {
		System.out.println("error");
	}
}


public static void reading_file() {
	try {
		String file_path = "C:\\Users\\�����1\\Desktop\\����\\C���\\SalesReport.csv";
		fr = new FileReader(file_path);
		BufferedReader br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            // ������ ó��
            System.out.println(Arrays.toString(data)); // ���÷� �ܼ� ���
        }

        br.close();
        fr.close();    
        
	}catch(IOException e) {
		System.out.println("error");
	}
}
}
