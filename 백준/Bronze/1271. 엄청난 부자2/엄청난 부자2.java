import java.io.BufferedReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();

		System.out.println(A.divide(B));
		System.out.println(A.mod(B));

	}
}
