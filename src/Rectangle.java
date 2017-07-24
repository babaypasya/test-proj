public class Rectangle {
	public int lenght;
        public int width;
	
	public Rectangle(int lenght){
		this.lenght = lenght;
		this.width = width;
	} 

	public int getArea() {
		return lenght * width;
	}

	public int getPerimeter() {
		return 2 * (lenght + width);
	}
}
