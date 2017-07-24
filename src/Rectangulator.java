public class Rectangulator {
	public static void main(String[] args) {
		int lenght = Integer.parseInt(args[0]);
		int width = Integer.parseInt(args[1];

	Rectangle myRectangle = new Rectangle(lenght, width);
	String output = String.format("Your rectangle \n\nLenght: %d\n Width: %d\nArea: %d\nPerimeter: %d\n\n", myRectangle.lenght, myRectangle.width, myRectangle.getArea(),myRectangle.getPerimeter());
        System.out.println(output);
 }
}
