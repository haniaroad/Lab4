import java.util.Scanner;

public class PowerTable {

	public static void main(String[] args) {

		int userNum;
		String newGame;

		do {

			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter a number: ");
			userNum = scanner.nextInt();

			for (int i = 1; i <= userNum; i++) {

				System.out.println(i + " squared equals:");
				System.out.println(Math.pow(i, 2));

			}

			for (int j = 1; j <= userNum; j++) {
				System.out.println(j + " cubed equals:");
				System.out.println(Math.pow(j, 3));
			}

			System.out.println("Try again? Y/N");
			newGame = scanner.next();

		} while (newGame.equalsIgnoreCase("Y"));

	}
}
