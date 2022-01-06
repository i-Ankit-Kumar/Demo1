
public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Apple a = new Apple();
         a.text();
         a.selfie();
         a.browse();
	}

}
class Apple{
	
	void text() {
		System.out.println("Texting....");
	}
void selfie() {
	System.out.println("Taking a selfie....");
	}
	
void browse() {
	System.out.println("Browsing....");
}
		
}