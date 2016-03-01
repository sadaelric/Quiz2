package test;
import java.util.Scanner;
public class Tuition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your InitialTuition:");
		int InitialTuition = scan.nextInt();
		System.out.println("");

		System.out.print("Enter your Percent Increase:");
		int PercentIncrease = scan.nextInt();
		System.out.println("");

		System.out.print("Enter your Term:");
		float Term = scan.nextFloat();
		System.out.println("");

		System.out.print("Enter your APR:");
		float APR = scan.nextFloat();
		System.out.println("");

		double TotalCost = 0;
		for (double i = 4;1>0;i-- ){
			InitialTuition *= (1+PercentIncrease);
			TotalCost+=InitialTuition;
		}
		TotalCost = TotalCost * Math.pow((1+APR/12),(12*Term));
		double Monthly = TotalCost / (12*Term);

		System.out.printf("The Total cost is: %d\n"+TotalCost);
		System.out.printf("The Monthly payment is: %f\n"+Monthly);
	}

}
