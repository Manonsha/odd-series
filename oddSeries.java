package projectUpload;

import java.util.Scanner;

public class oddSeries {
	
	public static void main(String []args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to get the odd number series : ");
		int n=sc.nextInt();

		for(int i=1;i<=n;i++) {
			if (i%2==1) {
			System.out.println(i);
			
			}
		}
	}
}