package week4;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("exit�� �Է��ϸ� �����մϴ�");
		
		while(true) {
			System.out.println("> >");
			String text = scan.nextLine();
			if(text.contentEquals("exit"))
				break;
		}
		
		System.out.println("�����մϴ�");
		scan.close();
	}

}
