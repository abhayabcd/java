class helper {
	public static int sum(int a,int b){
		return a+b;
	}
}
class Static{
	public static void main(String[] args){
		System.out.print("The sum of 10+20 is "+helper.sum(10,20));
	}
}