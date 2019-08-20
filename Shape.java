/**
*
*@author Aaron Kurth
*/

public abstract class Shape 
{
	//private instance variables
	private int height;
	private int width;

	//constructor
	public Shape (int height, int width)
	{
		if(height <= 0 || width <= 0)
		{
			throw new IllegalArgumentException();
		}

		this.height = height;
		this.width = width;
	}

	//height set method
	public void setHeight(int height)
	{
		this.height = height;
	}

	//width set method
	public void setWidth(int width)
	{
		this.width = width;
	}

	//height get method
	public int getHeight()
	{
		return this.height;
	}

	//width get method
	public int getWidth()
	{
		return this.width;
	}

	//toString method for universal shape output
	public String toString()
	{
		String output = "Height = " + this.height + ", Width = " + this.width;
		return output; 
	}

	//abstract getArea method
	public abstract double getArea();

}