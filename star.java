import java.util.Scanner;
class star{
	public static void main(String[]args){
		Scanner check =new Scanner(System.in);
		System.out.println("Enter a number");
		int n=check.nextInt();
		if(n%2 == 0){
			System.out.println("Given number is even");
		}
		else{
			System.out.println("Given number is odd");
		}
	}
}