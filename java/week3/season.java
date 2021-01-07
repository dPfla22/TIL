package week3;

import java.util.Scanner;

public class season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("월을 입력하세요 : ");
		int season = scan.nextInt();
		switch(season) {
		case 12: case 1: case 2:
			System.out.print("겨울입니다!");
			break;
		case 3: case 4: case 5:
			System.out.print("봄입니다!");
			break;
		case 6: case 7: case 8:
			System.out.print("여름입니다!");
			break;
		case 9: case 10: case 11:
			System.out.print("가을입니다!");
			break;
		}
	}

}
