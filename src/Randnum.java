import java.util.Random;
import java.util.Scanner;
public class Randnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner one=new Scanner(System.in);
		System.out.println("enter 1st num");
		int Low = one.nextInt();
		System.out.println("enter 2st num");
		int High = one.nextInt();
		int Result = r.nextInt(High-Low) + Low;
		System.out.println(Result);
	}

}
