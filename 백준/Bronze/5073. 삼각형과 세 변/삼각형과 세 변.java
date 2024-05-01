import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			if (a == 0 && b == 0 && c == 0) {
				break;

			} else {

				if (a == c && a == b) {
					System.out.println("Equilateral");
				} else if (a >= b + c || b >= a + c || c >= a + b) {
					System.out.println("Invalid");
				} else if (a == c || a == b || b == c) {
					System.out.println("Isosceles");
				} else if (a != c && a != b && c != b) {
					System.out.println("Scalene");

				}

			}

		}

	}
}
