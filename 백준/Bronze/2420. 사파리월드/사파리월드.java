import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		long M = sc.nextLong();

		long sum = N - M;

		System.out.println(Math.abs(sum));

	}
}