import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt(); // 영수증에 적힌 총 금액
		int N = sc.nextInt(); // 영수증에 적힌 구매한 물건의 종류의 수
		int result = 0;

		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			arr[i] = a * b;
			result += arr[i];
		}

		if (X == result) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
