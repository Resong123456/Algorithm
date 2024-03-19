import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigDecimal A = sc.nextBigDecimal();
		BigDecimal B = sc.nextBigDecimal();
		
		BigDecimal c = A.divide(B, 32, RoundingMode.HALF_UP).stripTrailingZeros();;
		
		System.out.println(c);

	}
}