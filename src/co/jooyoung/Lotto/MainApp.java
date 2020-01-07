package co.jooyoung.Lotto;

import java.util.Scanner;

public class MainApp extends Lotto{
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Lotto game = new Lotto();
	
	
		System.out.println("금액을 입력하세요 : ");
		game.money = scanner.nextInt();
		scanner.nextLine();
		
			
		game.run();
		///game.print();
		
		
		
		
		
		
	
		
	}

}

