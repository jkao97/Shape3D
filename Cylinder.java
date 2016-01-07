public class Cylinder implements Shape3D
{
	private double radius;
	private double height;
	
	public Cylinder(double radius, double height)
	{
		this.radius = radius;
		this.height = height;
	}
	
	public double getVolume()
	{
		return Math.PI*radius*radius*height;
	}
		
	public double getSurfaceArea()
	{
		return Math.PI*radius*radius*2 + Math.PI*radius*2*height;
	}
	
}