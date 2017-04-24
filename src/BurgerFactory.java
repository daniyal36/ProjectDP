
public class BurgerFactory extends AbstractFactory {

	IPizza getPizza(String Pizza) {
		return null;
	}

	IBurger getBurger(String Burger) {
		if(Burger==null)
		{
			return null;
		}
		if(Burger.equalsIgnoreCase("Zinger"))
		{
			return new Zinger();
		}
		if(Burger.equalsIgnoreCase("Chiken"))
		{
			return new ChikenBurger();
		}
		if(Burger.equalsIgnoreCase("CheeseBurger"))
		{
			return new cheese(new ChikenBurger());
		}
		return null;
	}

	IColdrink getColdrink(String cold) {
		return null;
	}

}
