package week4;

import java.util.Scanner;

public class ContinueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ 5�� �Է��ϼ���");
		int sum = 0;
		
		for(int i = 0; i<5; i++) {
			int n=scan.nextInt();
			if(n<=0) continue; // 0�̳� ������ ��� ������ �ʰ� ���� �ݺ����� ����
			else sum += n;
		}
		System.out.println("����� ���� " + sum);
		
		scan.close();
	}

}
