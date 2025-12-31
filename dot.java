class person{
	String name;
	int age;
}
class dot{
	public static void main(String[] args){
		person p=new person();
		p.name="Abhay";
		p.age=19;
		System.out.println("Name is "+p.name);
		System.out.println("Age is"+p.age);
	}
}