package scanner;

import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("회원가입을 시작합니다.");
		
		System.out.println("아이디를 일력하세요");
		String str1 = sc.nextLine();
		
		if( str1.length() > 11 ) {
			System.out.println("아이디는 10글자 이하로만 입력좀");}
			else {System.out.println("입력하신 아이디는 " + str1 + "입니다.");}
		
		
		
		sc.close();
		
	}

}