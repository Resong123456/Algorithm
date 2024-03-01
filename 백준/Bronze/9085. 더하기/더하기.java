import java.math.BigInteger;
import java.util.Scanner;

import javax.naming.ldap.HasControls;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			int num1 = sc.nextInt();

			for (int j = 0; j < num1; j++) {
				int sum = 0;
				sc.nextLine();
				String str = sc.nextLine();
				String[] strArr = str.split(" ");
				int[] arr = new int[strArr.length];

				for (int k = 0; k < strArr.length; k++) {
					arr[k] = Integer.parseInt(strArr[k]);

					sum += arr[k];

				}
				System.out.println(sum);
				break;

			}

		}
	}
}