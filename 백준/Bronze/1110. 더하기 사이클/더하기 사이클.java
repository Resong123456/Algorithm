import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int A = 0;
		int B = N;

		while (true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			A++;

			if (B == N) {
				break;
			}

			
		}
		System.out.println(A);

	}
}