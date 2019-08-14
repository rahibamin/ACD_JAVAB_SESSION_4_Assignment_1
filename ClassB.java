import Session4.Assignment1.ClassA;
	
	class ClassC extends ClassA{
		
		public ClassC() {
			
		}
		
		void calldisplay() {
			super.display();
		}
	}
public class ClassB {

	public static void main(String[] args) {
		ClassC cl = new ClassC();
		cl.calldisplay();
	}
}
