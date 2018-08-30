import java.io.FileNotFoundException;

public class WriteData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        java.io.File file = new java.io.File("scores2.txt");
        if (file.exists()) {
        	System.out.println("File already exists");
        	System.exit(0);
        }
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        
        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);
        
        output.close();
	}

}
