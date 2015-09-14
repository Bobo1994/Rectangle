import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		System.out.print("Enter the width and height of a rectangle");
		Scanner keyboard = new Scanner(System.in);
		int width = keyboard.nextInt();
		int height = keyboard.nextInt();
		System.out.println("The primeter of the rectangle is " + (2*width+2*height));
		System.out.println("The area of the rectangle is "+ width*height);
	}

}
