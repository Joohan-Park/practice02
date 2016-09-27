package prob8;

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		Goods[] goodsArray = new Goods[3];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {

			goodsArray[i] = new Goods();
			String line = scanner.nextLine();
			String[] infos = line.split(" ");

			goodsArray[i].setName(infos[0]);
			goodsArray[i].setPrice(Integer.parseInt(infos[1]));
			goodsArray[i].setCountStock(Integer.parseInt(infos[2]));
		}

		for (int i = 0; i < 3; i++) {
			System.out.println(goodsArray[i].getName() + "(가격:" + goodsArray[i].getPrice() + ")이 "
					+ goodsArray[i].getCountStock() + "개 입고 되었습니다.");
		}
		scanner.close();
	}

}
		