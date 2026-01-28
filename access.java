class A{
	int a=10;
}
class B{
	public int b=20;
}
class C{
	protected int c=30;
}
class D{
	private int d=40;
	D(){System.out.println(d);}
}
class access extends C{
	public static void main(String[] a){
		A a1=new A();
		B b1=new B();
		D d1=new D();
		access a2 =new access();
		System.out.println(a2.c);
		System.out.println(a1.a);
		System.out.println(b1.b);
	}
}