class abc {
	int i,j;
	public String toString(){
		return "i=="+i+"j=="+j;
	}
}
class shellow{
	public static void main(String[] args){
		abc a= new abc();
		a.i=6;
		a.j=5;
		System.out.println(a);
		abc a1= a;
		a1.i=6;
		a1.j=9;
		System.out.println(a1);
	}
}