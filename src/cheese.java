
public class cheese extends BurgerDecorator {
	public cheese(IBurger burger)
	{
		super(burger);
	}
	public String name()
	{
		return burger.name()+" "+setCheese();
	}
	public float cost()
	{
		return burger.cost()+setCost();
	}
	public String setCheese()
	{
		return " With Cheese ";
	}
	public float setCost()
	{
		return 2.0f;
	}
}
