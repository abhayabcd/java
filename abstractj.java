abstract class ab {

    public abstract void display();
    
}
class abcd extends ab {

    public void display() {
        System.out.println("Abstract class method implemented.");
    }
    
}
class abstractj {
    public static void main(String args[]) {
        ab obj = new abcd();
        obj.display();
    }
}
