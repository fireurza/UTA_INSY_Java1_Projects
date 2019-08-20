/**
*
*@author Aaron Kurth
*/

public class ShapeTest
{
	public static void main(String[] args)
	{
		//objects for rectangle and triangle
		Rectangle r1 = new Rectangle(3,5,"Red");
		Triangle t1 = new Triangle(3,4,"Obtuse");

		//array of shapes
		Shape[] shapeRef = new Shape[2];
		shapeRef[0] = r1;
		shapeRef[1] = t1;

		//enhanced for loop
		for(Shape it : shapeRef)
		{
			//checks if it is a rectangle if not a rectangle then checks if it is a triangle
			if(it instanceof Rectangle)
			{
				System.out.println("This is a Rectangle\n" + it.toString());
				System.out.println("The area of the Rectangle = " + it.getArea());
			} else if(it instanceof Triangle) 
			{
				System.out.println("This is a Triangle\n" + it.toString());
				System.out.println("The area of the Triangle = " + it.getArea());
			}
		}
	}
}