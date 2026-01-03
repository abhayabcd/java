import java.util.Arrays;
class jagged{
	public static void main(String[] args){
		int[][] jagged=new int[2][];
		jagged[0]=new int[3];
		jagged[1]=new int[2];
		jagged[0][0]= 10;
		jagged[0][1]= 20;
		jagged[1][0]= 30;
		System.out.println(Arrays.deepToString(jagged));
	}
}