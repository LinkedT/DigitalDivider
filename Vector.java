package digitalDivider;

public class Vector 
{
	double[] vectorS = new double[2];
	double[] vectorE = new double[2];
	
	public Vector(double sX, double sY, double eX, double eY)
	{
		vectorS[0] = sX;
		vectorS[1] = sY;
		vectorE[0] = eX;
		vectorE[1] = eY;
	}
	
	public void editPosition(double dx, double dy)
	{
		vectorS[0] += dx;
		vectorS[1] += dy;
		vectorE[0] += dx;
		vectorE[1] += dy;
	}
	
	public double getX()
	{
		return vectorS[0]-vectorE[0];
	}
	
	public double getY()
	{
		return vectorS[1]-vectorE[1];
	}
	
	public double getXS()
	{
		return vectorS[0];
	}
	
	public double getYS()
	{
		return vectorS[1];
	}
	
	public double getXE()
	{
		return vectorE[0];
	}
	
	public double getYE()
	{
		return vectorE[1];
	}

	public double getSize()
	{
		return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
	}
	
	public void adding(Vector other)
	{
		vectorE[0] += other.getX();
		vectorE[1] += other.getY();
	}
	
	public void times(double d)
	{
		vectorE[0] *= d;
		vectorE[1] *= d;
	}
}
