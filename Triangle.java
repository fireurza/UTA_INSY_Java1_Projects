/**
*
*@author Aaron Kurth
*/

public class Triangle extends Shape
{
	//private instance variable
	private String classification;

	//constructor
	public Triangle(int height, int width, String classification)
	{
		super(height, width);
		this.classification = classification;
	}

	//classification set method
	public void setClassification(String classification)
	{
		this.classification = classification;
	}

	//classification get method
	public String getClassification()
	{
		return this.classification;
	}

	//toString for output of Triangle shapes
	public String toString()
	{
		String output = "Classification = " + this.classification + ", ";
		output += super.toString();
		return output;
	}

	//getArea for area of Triangles
	public double getArea()
	{
		return((super.getHeight()*super.getWidth())/2);
	}
}