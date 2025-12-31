import java.util.Scanner;
class intrest{
	public static void main(String[] args){
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter Principle : ");
		int p=scn.nextInt();
		System.out.println("Enter Rate : ");
		int r=scn.nextInt();
		System.out.println("Enter Number of year : ");
		int n=scn.nextInt();
		float i=(p*r*n)/100f;
		System.out.println("Simple intrest is :"+i);
	}
}