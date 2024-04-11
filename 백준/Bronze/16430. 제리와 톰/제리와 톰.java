import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		int result = B - A;

		String re = String.valueOf(result);

		System.out.println(re + " " + B);

	}
}