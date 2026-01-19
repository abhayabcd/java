class varg{
	public static void name(String... n){
		for(String i:n){
			System.out.print(i+" ");
		}
	System.out.println();
	}


	public static void main(String[] args){
		name("hi","by");
	}
}