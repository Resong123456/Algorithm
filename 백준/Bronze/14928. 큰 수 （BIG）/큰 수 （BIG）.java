import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String num = sc.next();

		long remainder = 0;
		for (int i = 0; i < num.length(); i++) {
			remainder = (remainder * 10 + (num.charAt(i) - '0')) % 20000303;
		}

		System.out.println(remainder);

		sc.close();
	}
}