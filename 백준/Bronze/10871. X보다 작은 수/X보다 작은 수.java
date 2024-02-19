import java.awt.print.Printable;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int arr[] = new int[num];
		int num2 = sc.nextInt();

		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < num; i++) {
			if (arr[i] < num2) {
				System.out.print(arr[i] + " ");
			}
		}

	}
}
