class overload{
	int en;
	String name;
	overload(){
		en=2894;
		name="abhay";
	}
	overload(int en){
		this.en=en;
		name="abhay";
	}
	overload(int en,String name){
		this.en=en;
		this.name=name;
	}
	void display(){
		System.out.println("Name is "+name+" Enrollment number is "+en);
	}
	public static void main(String[] args){
		overload o1=new overload();
		o1.display();
		overload o2=new overload(2893);
		o2.display();
		overload o3=new overload(2892,"abhay");
		o3.display();
	}
}