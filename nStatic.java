class Helper {
	public int sum(int a,int b){
		return a+b;
	}
}
class nStatic{
	public static void main(String[] args){
		Helper h=new Helper();
		System.out.print("The sum of 10+20 is "+h.sum(10,20));
	}
}