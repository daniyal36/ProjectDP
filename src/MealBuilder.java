
public class MealBuilder {
	public Meal Deal1()
	{
		System.out.println("Deal # 01");
		Meal meal = new Meal();
		meal.addItem(new Fajita(),new Zinger(),new Pepsi());
		return meal;
	}
	public Meal Deal2()
	{
		System.out.println("Deal # 02");
		Meal meal = new Meal();
		meal.addItem(new Tikka(),new ChikenBurger(),new Mirinda());
		return meal;
	}
}
