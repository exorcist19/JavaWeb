package Chpt13;

public class ClassC implements InterfaceA, InterfaceB {
	public void show()
	{
		System.out.println("Show");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassC obj = new ClassC();
		obj.show();
		}
            
        
}
