import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BigInteger numA = sc.nextBigInteger();
		BigInteger numB = sc.nextBigInteger();

		BigInteger result = numA.multiply(numB);

		System.out.println(result);

	}

}