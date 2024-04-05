import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cPrice = sc.nextInt();
		int cNum = sc.nextInt();
		int money = sc.nextInt();

		int cookie = cPrice * cNum;
		int result = 0;

		if (cookie > money) {
			result = cookie - money;

		} else {
			result = 0;
		}

		System.out.println(result);

	}
}