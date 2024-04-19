import java.util.*;
import java.util.concurrent.RecursiveAction;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String words = sc.next();
		String blank = "";

		for (int i = words.length() - 1; i >= 0; i--) {
			blank += words.charAt(i);

		}
		if (words.equals(blank)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}
}
