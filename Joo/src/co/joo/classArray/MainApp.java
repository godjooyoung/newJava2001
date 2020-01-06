package co.joo.classArray;

public class MainApp {
	public static void main(String[] args) {
		Friends[] FriendArry = new Friends[10];
		FriendArry[0] = new UnivF("김영희", "1234", "Philosophy");
		FriendArry[1] = new ComF("박만식", "4567", "Sales");
		FriendArry[3] = new Friends("안미리", "1111", null);

	
			FriendArry[0].toString();
			FriendArry[1].toString();
		}
	}
