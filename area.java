class rectengle{
	int length;
	int width;
	void getdata(){
		int a=length*width;
		System.out.println(a);
	}
}
class area{
	
	public static void main(String[] args){
		rectengle r=new rectengle();
		r.length=5;
		r.width=10;
		r.getdata();
	}
}