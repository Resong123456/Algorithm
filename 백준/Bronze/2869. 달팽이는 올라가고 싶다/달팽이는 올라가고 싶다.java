import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double A = sc.nextInt(); // 올라감
		double B = sc.nextInt(); // 내려감
		int V = sc.nextInt(); // 도착점

		int result = 0;
		
		 // (V - B)를 (A - B)로 나눈 값에 올림을 취한 결과가 도착점에 도달하기 위해 필요한 일 수
        result = (int) Math.ceil((double)(V - B) / (double)(A - B));

        System.out.println(result);
        
    }
}