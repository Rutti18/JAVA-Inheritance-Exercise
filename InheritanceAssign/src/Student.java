
// Exercise 2
public class Student extends Person{
    private int credits;
    
    public Student(String name, String address) {
        super(name, address);
        this.credits=0;
    }
    
    public int credits(){
        return this.credits;
    }
    
    public void study(){
        this.credits++;
    }

    @Override
    public String toString() {
        return super.toString()+"\n  Study credits "+this.credits; //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
    	Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
    	System.out.println(ollie);
    	ollie.study();
    	System.out.println(ollie);
	}
    
}