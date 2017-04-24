
public class Souce extends PizzaDecorator {
	public Souce(IPizza pizza)
	{
		super(pizza);
	}
	public String name()
	{
		return piz.name()+" "+setSouce();
	}
	public float cost()
	{
		return piz.cost()+setCost();
	}
	public String setSouce()
	{
		return " With Souce ";
	}
	public float setCost()
	{
		return 2.0f;
	}
}
