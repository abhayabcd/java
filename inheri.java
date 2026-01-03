class car{
	String name;
	void speed(){
		System.out.println("In car class");
	}
}
class alto extends car{
	void display(){
		System.out.println("In alto class");
	}
}
class inheri{
	
	public static void main(String[] args){
		alto a=new alto();
		a.name="alto";
		a.speed();
		a.display();
	}
}