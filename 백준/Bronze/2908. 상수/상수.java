import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        
        // 숫자를 거꾸로 읽는 함수를 호출하여 결과를 저장
        int reversedNumber1 = reverseNumber(A);
        int reversedNumber2 = reverseNumber(B);
    
        // 거꾸로 읽은 숫자 중 큰 수를 찾아 출력
        System.out.println(reversedNumber1 > reversedNumber2 ? reversedNumber1 : reversedNumber2);
    }
	
    // 주어진 숫자를 거꾸로 읽는 메서드
    public static int reverseNumber(int A) {
        int reversed = 0;
        while (A != 0) {
            reversed = reversed * 10 + A % 10;
            A /= 10;
        }
        return reversed;
    }
}