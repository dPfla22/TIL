package week4;

import java.util.Scanner;

public class cafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int number;
		int price=0;
		String menu = "메뉴  : \n" + 
			"1. 아메리카노 : 2500원\n" + 
			"2. 카페라뗴 : 3000원\n" + 
			"3. 딸기라떼 : 4000원\n" + 
			"4. 와플 : 2500원\n" + 
			"5. 주문하기\n";

		System.out.println(menu);
		System.out.println("원하시는 주문번호를 입력하세요");
		
		while(true) {
			number = scan.nextInt();
			if(number == 1){
				price += 2500;
				System.out.println("아메리카노를 주문하셨습니다 추가로 원하시는 주문번호를 입력하세요");
			}
			else if(number == 2) {
				price += 3000;
				System.out.println("카페라떼를 주문하셨습니다 추가로 원하시는 주문번호를 입력하세요");
			}
			else if(number == 3) {
				price += 4000;
				System.out.println("딸기라떼를 주문하셨습니다 추가로 원하시는 주문번호를 입력하세요");
			}
			else if(number == 4) {
				price += 2500;
				System.out.println("와플을 주문하셨습니다 추가로 원하시는 주문번호를 입력하세요");
			}
			else break;
		}
		
		scan.close();
		
		System.out.println("총 주문 금액은 " + price + "입니다! " + "조금만 기다려 주세용");
	}
}
