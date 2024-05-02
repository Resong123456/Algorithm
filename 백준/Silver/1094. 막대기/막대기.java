import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int A = 64;
		int count = 0;

		while (X > 0) {

			if (A > X) {
				A /= 2;
			} else {
				X -= A;
				count++;
			}

		}
		System.out.println(count);

	}

}
