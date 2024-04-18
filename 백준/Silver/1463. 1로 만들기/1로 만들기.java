import java.util.*;
import java.util.concurrent.RecursiveAction;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		System.out.println(recur(num, 0));

	}

	static int recur(int num, int count) {

		if (num < 2) {
			return count;

		}
		return Math.min(recur(num / 2, count + 1 + (num % 2)), recur(num / 3, count + 1 + (num % 3)));

	}
}
