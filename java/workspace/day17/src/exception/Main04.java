package exception;

public class Main04 {

	public static void main(String[] args) {
		int arr[] = new int[3];
		// try~catch블록으로 예외처리가 적용된 경우에는
		// 에러가 발생하더라도 프로그램 자체가 다운되지는않는다
		try {
		for(int i = 0; i<5; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("에러가 발생했습니다.");
			System.out.println("원인 : " + e.getMessage() );
			System.out.println("원인 : " + e.getLocalizedMessage() );
			e.printStackTrace();
		
		}
		
		
		
		System.out.println("--------프로그램 종료-----------");
	}

}
