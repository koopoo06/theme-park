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
		String file_path = "C:\\Users\\사용자1\\Desktop\\과제\\C언어\\SalesReport.csv";
		fw = new FileWriter(file_path, true); // true: 기존 파일에 내용을 추가할 것임을 나타냄
		fr = new FileReader(file_path);
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		
        // 새로운 데이터를 추가할 때만 헤더를 쓰도록 수정
        if ((line = br.readLine()) == null) {
            fw.write("날짜, 권종, 연령구분, 수량, 가격, 우대사항\n");
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
		String file_path = "C:\\Users\\사용자1\\Desktop\\과제\\C언어\\SalesReport.csv";
		fr = new FileReader(file_path);
		BufferedReader br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            // 데이터 처리
            System.out.println(Arrays.toString(data)); // 예시로 콘솔 출력
        }

        br.close();
        fr.close();    
        
	}catch(IOException e) {
		System.out.println("error");
	}
}
}
