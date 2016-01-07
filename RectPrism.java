public class RectPrism implements Shape3D
{
	private double height;
	private double length;
	private double depth;
	
	public RectPrism(double height, double length, double depth)
	{
		this.height = height;
		this.length = length;
		this.depth = depth;
	}
	
	public double getVolume()
	{
		return height*length*depth;
	}
	
	public double getSurfaceArea()
	{
		return height*length*2 + height*depth*2 + length*depth*2;
	}
	
	public double getLength()
	{
		return length;
	}
}