
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열
		// 아래는 선언과 동시에 a 라는 이름에 문자열이라는 데이터를 담음
		String a = "문자열";
		// 숫자
		int b = 1;
		// 논리형 참, 거짓
		boolean flg = false; // true
		
		// 문자열 변수 a 를 출력
		System.out.println("a = " + a);
		a = "나는 에이";
		System.out.println("a = " + a);
		
		// 숫자 변수 b 를 출력
		System.out.println("b = " + b);
		b = 2;
		System.out.println("b = " + b);
		
		// 논리 변수 flg 를 사용 해봄
		// 만약에 참이면 a 를 출력 만약에 거짓이면 b 를 출력
		flg = true;
		if (flg == true) {
			// flg 가 참이면 여기 실행
			System.out.println("flg : a = " + a);
		}
		
		if (flg == false) {
			System.out.println("flg : b = " + b);
		}
		
		flg = false; // 거짓으로 변경
		if (flg) {
			System.out.println("모");
		} else {
			System.out.println("도");
		}
		
		// 돈이 있으면 밥을 먹고 없으면 집에 간다.
		int don = 0;
		System.out.println("내가 가진 돈은?? " + don);
		System.out.println("길을 가다가 돈 100원을 주웠다.");
		don = 100;
		if (don > 0) {
			System.out.println("밥을 먹을 수 있다. 오에~~");
		} else {
			System.out.println("에이 집에 가야지!!!");
		}
		
		// 교통 카드가 있으면 차타고 가고 없으면 걸어간다.
	}

}
