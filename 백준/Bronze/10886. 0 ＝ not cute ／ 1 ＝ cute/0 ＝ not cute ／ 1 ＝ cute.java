import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int count = 0;
		int notcount = 0;

		for (int i = 0; i < num; i++) {
			int cute = sc.nextInt();

			if (cute == 1) {
				count++;
			} else if (cute == 0) {
				notcount++;
			}

		}
		if (count > notcount) {
			System.out.println("Junhee is cute!");
		} else {
			System.out.println("Junhee is not cute!");
		}

	}
}