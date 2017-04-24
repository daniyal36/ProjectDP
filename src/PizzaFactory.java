
public class PizzaFactory extends AbstractFactory {

	public IPizza getPizza(String Pizza) {
		if(Pizza==null)
		{
			return null;
		}
		if(Pizza.equalsIgnoreCase("Tikka"))
		{
			return new Tikka();
		}
		if(Pizza.equalsIgnoreCase("Fajita"))
		{
			return new Fajita();
		}
		if(Pizza.equalsIgnoreCase("SouceTikka"))
		{
			return new Souce(new Tikka());
		}
		return null;
	}

	IBurger getBurger(String Burger) {
		return null;
	}

	IColdrink getColdrink(String cold) {
		return null;
	}

}
