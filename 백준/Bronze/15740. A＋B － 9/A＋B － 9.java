import java.math.BigInteger;
import java.util.Scanner;

import javax.naming.ldap.HasControls;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();

		BigInteger sum = A.add(B);

		System.out.println(sum);

	}
}