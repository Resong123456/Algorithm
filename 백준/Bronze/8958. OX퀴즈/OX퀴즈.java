import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(); // ex. 5
		String[] arr = new String[a]; // 5개 배열

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next(); // 한 문자씩 입력 받음
		}
		for (int j = 0; j < arr.length; j++) {
			int count = 0;
			int sum = 0;

			for (int k = 0; k < arr[j].length(); k++) {
				if (arr[j].charAt(k) == 'O') {
					count++;
				} else {
					count = 0;
				}
				sum += count;
			}
			System.out.println(sum);
		}

	}
}