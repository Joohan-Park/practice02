package prob2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("숫자를 입력하세요: ");
			int inputNumber = scanner.nextInt();
			int sum = 0;
			for (int i = 0; i <= inputNumber; i++) {
				if (inputNumber % 2 == 0) {
					sum += i;
				} else {
					sum += i;
				}
			}
	
			System.out.println(sum);
			if (inputNumber == 1)
				break;
		}
		scanner.close();
		/* 여기에 구현 코드를 작성 합니다. */

	}

}
