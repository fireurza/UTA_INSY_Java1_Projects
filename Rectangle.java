/**
*
*@author Aaron Kurth
*/

public class Rectangle extends Shape
{
	//private instance variable
	private String color;

	//constructor
	public Rectangle(int height, int width, String color)
	{
		super(height, width);
		this.color = color;
	}

	//color set method
	public void setColor(String color)
	{
		this.color = color;
	}

	//color get method
	public String getColor()
	{
		return this.color;
	}

	//toString method for rectangle output
	public String toString()
	{
		String output = "Color = " + this.color + ", ";
		output += super.toString();
		return output;
	}

	//getArea method for rectangle area
	public double getArea()
	{
		return(super.getHeight()*super.getWidth());
	}
}