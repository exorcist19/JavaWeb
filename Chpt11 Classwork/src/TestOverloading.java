
public class TestOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.p(10);
		a.p(10.0);
	    }
      }
		class B {
			public void p(double i) {
				System.out.println("Calling the method p from Class B " + i *2);
			}
		}
		class A extends B {
			
			public void p(int i) {
			System.out.println("Calling the method p from class A " +i);
			
			}
		}