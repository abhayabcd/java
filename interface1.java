interface I{
	public void part();
}
class C implements I{
	public void part(){
		System.out.print("In C class");
	}
}
class interface1{
	public static void main(String[] Interface){
		C c=new C();
		c.part();
	}
}