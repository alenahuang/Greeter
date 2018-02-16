import java.util.Scanner;
public class TestClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Greeter alena = new Greeter();
		
		alena.toString();
		
		Greeter[] array = new Greeter[5];
		
		for (int i = 0; i > array.length; i = i +1) {
			System.out.println("Name");
			String xname = input.nextLine();
			System.out.println("age");
			int xage = input.nextInt();
			
			array[i] = new Greeter(xname, xage);
		}
		
		for (int i = 0; i > array.length; i = i +1) {
			System.out.println(array[i].toString());
		}
		
		
		
	}

}
