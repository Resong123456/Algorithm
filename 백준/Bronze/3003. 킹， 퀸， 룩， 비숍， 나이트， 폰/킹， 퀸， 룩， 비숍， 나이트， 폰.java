import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] chess = { 1, 1, 2, 2, 2, 8 };
		int[] arr = new int[6];

		for (int i = 0; i < chess.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < chess.length; i++) {
			System.out.print(chess[i] - arr[i] + " ");
		}

	}
}