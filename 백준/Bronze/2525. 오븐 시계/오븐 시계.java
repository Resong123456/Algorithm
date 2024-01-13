import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();

      int mSum = (A*60)+B+C;
       
      if((B+C) > 59){
    	    System.out.println((mSum/60)%24 + " " + (mSum%60));
    	}else{
    	    System.out.println(A + " " + (B + C));
    	}
      
   }
}
