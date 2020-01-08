package co.jooyoung.Lotto;

public class Lotto {

	int balls[] = new int[6];
	int money = 0;
	int n = money / 1000;

	Lotto() {
	}

<<<<<<< HEAD
	public void setMoney(int money) {
		this.money = money;
	}

	private void runLotto() {
		
		int n = money / 1000;
		for (int i = 0; i < n; i++) {

			for (int x = 0; x < 6; x++) {
				balls[x] = (int) (Math.random() * 45) + 1;
				for (int k = 0; k < x; k++) {
					if (balls[x] == balls[k]) {
						x++;
=======
	public void run() {

		for (int i = 0; i < (money / 1000); i++) {
			for (int j = 0; j < 6; j++) {
				balls[j] = (int) (Math.random() * 45) + 1;
				for (int k = 0; k < j; k++) {
					if (balls[j] == balls[k]) {
						balls[j]--;
						if (balls[j] == 0) {
							balls[j] = (int) (Math.random() * 45) + 1;
						}
>>>>>>> branch 'master' of https://github.com/godjooyoung/newJava2001
					}
				}
				System.out.print(balls[j] + "  ");
			}
			System.out.println();
		}
		System.out.println("----------------");
	}

	public void print() {
		for (int i = 0; i < (money / 1000); i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(balls[j] + "  ");

			}
			System.out.println(" ");

		}
		System.out.println(balls[3]);
		System.out.println("====================");
	}
}
