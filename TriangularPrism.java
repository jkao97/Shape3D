public class TriangularPrism implements Shape3D
{
	// isosceles, scalene, equilateral? 
	private double side1;
	private double side2;
	private double side3;
	private double height;
	private double c; // half the perimeter
	
	public TriangularPrism(double side1, double side2, double side3, double height)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.height = height;
	}
	
	public double getBaseArea()
	{
		return Math.sqrt(c*(c-side1)*(c-side2)*(c-side3));
	}
	
	public double getVolume()
	{
		return height * this.getBaseArea();
	}
	
	public double getSurfaceArea()
	{
		return this.getBaseArea()*2 + side1*height + side2*height + side3*height;
	}
	
}