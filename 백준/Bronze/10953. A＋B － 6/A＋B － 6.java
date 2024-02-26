import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int A = 0;
		int B = 0;

		for (int i = 0; i < num; i++) {
			String[] arr = sc.next().split(",");

			A = Integer.parseInt(arr[0]);
			B = Integer.parseInt(arr[1]);

			System.out.println(A + B);
		}

	}
}