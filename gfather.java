class son{
	void role(){
		System.out.print("Base class");
	}
}
class father extends son{
	void role(){
		System.out.print("Derived class");
	}
}
class gfather{
	public static void main(String[] args){
		father f=new father();
		f.role();
	}
}