package week4;

import java.util.Scanner;

public class cafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int number;
		int price=0;
		String menu = "�޴�  : \n" + 
			"1. �Ƹ޸�ī�� : 2500��\n" + 
			"2. ī���� : 3000��\n" + 
			"3. ����� : 4000��\n" + 
			"4. ���� : 2500��\n" + 
			"5. �ֹ��ϱ�\n";

		System.out.println(menu);
		System.out.println("���Ͻô� �ֹ���ȣ�� �Է��ϼ���");
		
		while(true) {
			number = scan.nextInt();
			if(number == 1){
				price += 2500;
				System.out.println("�Ƹ޸�ī�븦 �ֹ��ϼ̽��ϴ� �߰��� ���Ͻô� �ֹ���ȣ�� �Է��ϼ���");
			}
			else if(number == 2) {
				price += 3000;
				System.out.println("ī��󶼸� �ֹ��ϼ̽��ϴ� �߰��� ���Ͻô� �ֹ���ȣ�� �Է��ϼ���");
			}
			else if(number == 3) {
				price += 4000;
				System.out.println("����󶼸� �ֹ��ϼ̽��ϴ� �߰��� ���Ͻô� �ֹ���ȣ�� �Է��ϼ���");
			}
			else if(number == 4) {
				price += 2500;
				System.out.println("������ �ֹ��ϼ̽��ϴ� �߰��� ���Ͻô� �ֹ���ȣ�� �Է��ϼ���");
			}
			else break;
		}
		
		scan.close();
		
		System.out.println("�� �ֹ� �ݾ��� " + price + "�Դϴ�! " + "���ݸ� ��ٷ� �ּ���");
	}
}
