
public class Student  {
private String name;
private int height,weight;
	
	Student(String name,int weight,int height)
	{
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setWeight(int weight)
	{
		this.weight=weight;
	}
	public int getWeight()
	{
		return weight;
	}
	public void setHeight(int height){
		this.height=height;
	}
	public int getHeight()
	{
		return height;
	}
	public String toString()
	{
		return "Name: "+this.name+" "+"Height:"+this.height+" "+"Weight:  "+this.weight;
	}
}
