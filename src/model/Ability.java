package model;

public abstract class Ability 
{
	private String name;
	private String explanation;
	public Ability ()
	{
		
	}
	public Ability(String name, String explanation)
	{
		this.name = name;
		this.explanation= explanation;
	}
	
	public void run()
	{
		System.out.println("ability " + name +" does " + explanation);
	}
}
