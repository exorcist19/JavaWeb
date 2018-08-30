
public class TestOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a = new A1();
		a.p(10);
		a.p(10.0);
		
		B1 b = new B1();
		b.p(10.0);
	    }
      }
		class B1 {
			public void p(double i) {
				System.out.println("From Class B1 " + i *2);
			}
		}
		class A1 extends B1 {
			
			public void p(double i) {
			System.out.println("From class A1 " +i);
			
			}

	

}
