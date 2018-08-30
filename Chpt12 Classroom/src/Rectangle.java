
public class Rectangle extends GeometricObject {
	
	private double width;
	private double height;
	
	public Rectangle() {
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(
		double width, double height, String cor, boolean filled) {
	  this.width = width;
	  this.height = height;
	  setColor(color);
	  setFilled(filled);
	}
	
	public double getWidth() {
		return width;
	}
	
	
	{
}

}
