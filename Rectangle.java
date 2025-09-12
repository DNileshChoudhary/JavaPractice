public class Rectangle
{
	private float length = 1.0f;
	private float width = 1.0f;
	public Rectangle()
	{
	}
	public Rectangle(float length,float width)
	{
		this.length=length;
		this.width=width;
	}
	public float getLength()
	{
		return length;
	}
	public void setLength(float length)
	{
		this.length=length;
	}
	public float getWidth()
	{
		return width;
	}
	public void setWidth(float width)
	{
		this.width=width;
	}
	public double getArea()
	{
		return length*width;
	}
	public double getPerimeter()
	{
		return 2.0*(length+width);
	}
	@Override
	public String toString()
	{
		return "Rectangle[length="+length+",width="+width+"]";
	}
	public static void main(String []args)
	{
		Rectangle r1=new Rectangle(1.2f,3.4f);
		Rectangle r2=new Rectangle();
		Rectangle r3=new Rectangle(5.6f,7.8f);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println("length is: "+ r3.getLength());
		System.out.println("width is: "+r3.getWidth());
		System.out.println("area is: "+r3.getArea());
		System.out.print("perimeter is: "+r3.getPerimeter());
	}
}