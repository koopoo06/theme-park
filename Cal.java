package Practice;
import java.util.Calendar;

public class Cal {

public class Const { //final 변수들 선언
	// 권종별 가격
	final static int PRICE_ARRAY[][] = {{0,0,44000,47000,56000,44000},{0,0,37000,40000,46000,37000}};
	
	//나이 구하기
	final static int 
	OLD_GENERATION = 1900, 
	NEW_GENERATION = 2000,
	MALE_OLD = 1, 
	FEMALE_OLD = 2, 
	MALE_NEW = 3, 
	FEMALE_NEW = 4,
	BEFORE_BIRTH = 2, 
	AFTER_BIRTH = 1;
	
		
	//그룹별 나이
	final static int 
	MIN_BABY = 1, 
	MIN_CHILD = 3, 
	MIN_TEEN = 13, 
	MIN_ADULT = 19,
	MAX_CHILD = 12, 
	MAX_TEEN = 18, 
	MAX_ADULT = 64;
	
	// 나이에 따른 그룹
	final static int 
	BABY = 1, 
	CHILD = 2, 
	TEEN = 3, 
	ADULT = 4, 
	OLD = 5;
	
	
	// 할인율
	final static float 
	DISABLE_DISCOUNT_RATE = 0.6f, 
	MERIT_DISCOUNT_RATE = 0.5f,
	MULTICHILD_DISCOUNT_RATE = 0.8f, 
	PREGNANT_DISCOUNT_RATE = 0.85f;
	
	//종일권 
	final static 
	String DAY_TICKET = "주간권", 
	NIGHT_TICKET = "야간권";
	
	//나이별
	final static 
	String AGE_BABY = "유아",
	AGE_CHILD = "소인", 
	AGE_TEEN = "청소년", 
	AGE_ADULT = "대인", 
	AGE_OLD = "경로";
	
	//우대적용
	final static 
	String NO_DISCOUNT  = "우대적용 없음", 
	DISABLE_DISCOUNT = "장애인 우대적용", 
	MERIT_DISCOUNT = "국가유공자 우대적용" , 
	MULTICHILD_DISCOUNT = "다자녀 우대적용" , 
	PREGNANT_DISCOUNT = "임산부 우대적용";
}

public int cal_Age () { //1. 입력받은 주민번호에서 생년월일 구하기
	String cal_id_num = Input.input_ID_Num(); 
	
	int age = 0;
	int user_year = 0;
	int user_month = 0;
	int user_day = 0;
	
	if (Integer.parseInt(cal_id_num.substring(6, 7)) == 3 || 
		Integer.parseInt(cal_id_num.substring(6, 7)) == 4) { // 7번째 자리가 3 또는 4인 경우 처리할 내용
		user_year = Const.NEW_GENERATION + Integer.parseInt(cal_id_num.substring(0, 2));
	} else {
		user_year = Const.OLD_GENERATION + Integer.parseInt(cal_id_num.substring(0, 2));
	}
	
	user_month = Integer.parseInt(cal_id_num.substring(2, 4));
	user_day = Integer.parseInt(cal_id_num.substring(4, 6));


	Calendar cal = Calendar.getInstance();
	int todayYear = cal.get(Calendar.YEAR);
	int todayMonth = cal.get(Calendar.MONTH) + 1;
	int todayDay = cal.get(Calendar.DAY_OF_MONTH);

	if((user_month < todayMonth) || ((user_month == todayMonth) && (user_day <= todayDay))) {
		age = todayYear - user_year;
	} else {
		age = todayYear - user_year - 1;
	}
	
	return age;
}


public int cal_Age_Group() { //나이별 종류대로 구분
	int age = cal_Age();
	if (age < Const.MIN_CHILD) {
		return 1;
	}
	else if (age >= Const.MIN_CHILD && age <= Const.MAX_CHILD) {
		return 2;
	}
	else if (age >= Const.MIN_TEEN && age <= Const.MAX_TEEN ) {
		return 3;
	}
	else if (age >= Const.MIN_ADULT && age <= Const.MAX_ADULT ) {
		return 4;
	}
	else if (age > Const.MAX_ADULT) {
		return 5;
	}
	return 0;
}

	
	public int cal_Price (int ticket_select, int age, int special_rates, int order_amount) {
		int cal_price = 0;
		int a = ticket_select -1;
		int b = age;
		cal_price = Const.PRICE_ARRAY[a][b];
		
		switch(special_rates) {
		case 1: 
			cal_price = cal_price; break;
		case 2: 
			cal_price *= Const.DISABLE_DISCOUNT_RATE; break;
		case 3: cal_price *= Const.MERIT_DISCOUNT_RATE ; break;
		case 4: cal_price *= Const.MULTICHILD_DISCOUNT_RATE ; break;
		case 5: cal_price *= Const.PREGNANT_DISCOUNT_RATE ; break;
		default: break;	
		}
		
		cal_price = cal_price * order_amount;
		
		return cal_price;
	}


	//7. 총 가격 계산하기 (티켓 가격 x 수량)
	int function_price_result(int cal_price, int order_amount) {
		return cal_price * order_amount; 
	}

}

