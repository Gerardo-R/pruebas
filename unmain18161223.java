
import java.util.Scanner;
import java.lang.Math;

public class unmain18161223{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int y, x;
		Long n;


		y = 1;
		x = 1;

		System.out.println("Please insert a number greater than 0");
		n = input.nextLong();
		n = n-1;

		for (int i = 0;i<n;i++){
			y = x+y;
			x = y-x;
		}
		System.out.println(x);
	}
}