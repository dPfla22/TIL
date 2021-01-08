package week4;

import java.util.Scanner;

public class ContinueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 5개 입력하세요");
		int sum = 0;
		
		for(int i = 0; i<5; i++) {
			int n=scan.nextInt();
			if(n<=0) continue; // 0이나 음수인 경우 더하지 않고 다음 반복으로 진행
			else sum += n;
		}
		System.out.println("양수의 합은 " + sum);
		
		scan.close();
	}

}
