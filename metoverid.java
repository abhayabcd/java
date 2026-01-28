class a{
	void run(){System.out.print("In Base Class");}
}
class b extends a{
	void run(){System.out.print("In Child Class");}
}
class metoverid{
	public static void main(String[] overriding){
		//a A=new a();
		//A.run();
		b B=new b();
		B.run();
	}
}