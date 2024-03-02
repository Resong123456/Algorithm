import java.math.BigInteger;
import java.util.Scanner;

import javax.naming.ldap.HasControls;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();

		double C = A / B;

		System.out.println(C);

	}
}