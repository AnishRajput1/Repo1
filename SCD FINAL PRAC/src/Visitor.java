interface Shape
{
	int accept(Exportvisitor visitor);
}
class Circle implements Shape
{
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public int accept(Exportvisitor visitor) 
	{
		return visitor.visit(this);
	}

}
class Square implements Shape
{
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	public int accept(Exportvisitor visitor)
	{
		return visitor.visit(this);
	}
}
interface Exportvisitor
{
	int visit(Circle c);
	int visit(Square s);
}
class Exportvisitorimpl implements Exportvisitor
{

	@Override
	public int visit(Circle c) 
	{
		c.setSize(30);
		return c.getSize();
	}

	@Override
	public int visit(Square s) 
	{
		s.setSize(40);
		return s.getSize();
	}
}
public class Visitor 
{
	public static void main(String[] args) 
	{
		Circle a = new Circle();
		System.out.print(""+a.getSize());
		Square s = new Square();
		System.out.print(""+s.getSize());
		//helloosupp

	}
}
