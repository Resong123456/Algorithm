import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int price = sc.nextInt();
		int[] arr = new int[9];
		int result = 0;
		
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			result += arr[i];
		}
		System.out.println(price - result);
	}
}