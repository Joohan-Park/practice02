package prob4;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		/* 구현코드 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액: ");
		int inputNumber = scanner.nextInt();

		int[] Money = { 50000, 10000, 5000, 1000, 500, 100, 10, 5, 1 };
		int[] count = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		for (int i = 0; i < Money.length; i++) {
			while (true) {
				if (inputNumber / Money[i] > 0) {
					count[i]++;
					inputNumber-=Money[i];
				}
				else {
					break;
				}
			}
			if(Money[i]==0){
				break;
			}
		}
		for (int i= 0; i<Money.length; i++){
			System.out.println(Money[i]+"원 : "+count[i]);
		}
		scanner.close();
	}
	
	

	

	/*int count50000 = 0;
	int count10000 = 0;
	int count5000 = 0;
	int count1000 = 0;
	int count500 = 0;
	int count100 = 0;
	int count50 = 0;
	int count10 = 0;
	int count5 = 0;
	int count1=0;

	while(true)
	{
		if (inputNumber > 50000) {
			count50000++;
			inputNumber -= 50000;
		} else if (inputNumber > 10000) {
			count10000++;
			inputNumber -= 10000;
		} else if (inputNumber > 5000) {
			count5000++;
			inputNumber -= 5000;
		} else if (inputNumber > 1000) {
			count1000++;
			inputNumber -= 1000;
		} else if (inputNumber > 500) {
			count500++;
			inputNumber -= 500;
		} else if (inputNumber > 100) {
			count100++;
			inputNumber -= 100;
		} else if (inputNumber > 50) {
			count50++;
			inputNumber -= 50;
		} else if (inputNumber > 5) {
			count5++;
			inputNumber -= 5;
		} else if (inputNumber >= 1) {
			count1++;
			inputNumber -= 1;
		}
		if (inputNumber == 0) {
			break;
		}

	}*/

}