import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjectMain {

	public static void main(String[] args) {
		
		int totalCost=0;
		int count=0;
		int Icount=0;
		ArrayList<String> name=new ArrayList<String>();
		
		System.out.println("\tDeals..\n");
		MealBuilder c=new MealBuilder();
		Meal Deal1=c.Deal1();
		Deal1.showItems();
		System.out.println("\nDeal # 01 :Price: " + Deal1.getCost());
		
		System.out.println("\n");
		Meal Deal2=c.Deal2();
		Deal2.showItems();
		System.out.println("\nDeal # 02 :Price: " + Deal2.getCost());
		
		System.out.println("\n");
		System.out.println("\tOther Items..\n");
		AbstractFactory pizzaFactory=FactoryProducer.getFactory("Pizza");
		IPizza piz=pizzaFactory.getPizza("Tikka");
		System.out.println(piz.name()+" "+piz.cost());
		IPizza piz1=pizzaFactory.getPizza("Fajita");
		System.out.println(piz1.name()+" "+piz1.cost());
		IPizza piz2=pizzaFactory.getPizza("SouceTikka");
		System.out.println(piz2.name()+" "+piz2.cost());
		
		AbstractFactory burgerFactory=FactoryProducer.getFactory("Burger");
		IBurger burg=burgerFactory.getBurger("Zinger");
		System.out.println(burg.name()+" "+burg.cost());
		IBurger burg1=burgerFactory.getBurger("Chiken");
		System.out.println(burg1.name()+" "+burg1.cost());
		IBurger burg2=burgerFactory.getBurger("CheeseBurger");
		System.out.println(burg2.name()+" "+burg2.cost());
		
		AbstractFactory coldrinkFactory=FactoryProducer.getFactory("Coldrink");
		IColdrink cold=coldrinkFactory.getColdrink("Pepsi");
		System.out.println(cold.name()+" "+cold.cost());
		IColdrink cold1=coldrinkFactory.getColdrink("Mirinda");
		System.out.println(cold1.name()+" "+cold1.cost());
		
		System.out.println("==========================================================================");
		while(true)
		{
			//System.out.println("\nEnter 1 for Deal # 01");
			//System.out.println("Enter 2 for Deal # 02");
			//System.out.println("Enter 3 for Tikka.");
			//System.out.println("Enter 4 for Fajita.");
			//System.out.println("Enter 5 for Tikka With Souce.");
			//System.out.println("Enter 6 for Zinger Burger.");
			//System.out.println("Enter 7 for Chiken Burger.");
			//System.out.println("Enter 8 for Chiken Burger with Cheese.");
			//System.out.println("Enter 9 for Pepse.");
			//System.out.println("Enter 10 for Mirinda.");
			System.out.println("\nEnter Item Name :");
			Scanner reader = new Scanner(System.in); 
			String input = reader.next();
			AbstractItem item=ItemFactory.getItem(input);
			System.out.println(item.getName());
			if(input.equalsIgnoreCase("Deal1"))
			{
				count++;
				totalCost+=Deal1.getCost();
				name.add("Deal # 01");
			}
			else if(input.equalsIgnoreCase("Deal2"))
			{
				count++;
				totalCost+=Deal2.getCost();
				name.add("Deal # 02");
			}
			else if(input.equalsIgnoreCase("Tikka"))
			{
				Icount++;
				totalCost+=piz.cost();
				name.add(piz.name());
			}
			else if(input.equalsIgnoreCase("Fajita"))
			{
				Icount++;
				totalCost+=piz1.cost();
				name.add(piz1.name());
			}
			else if(input.equalsIgnoreCase("TikkaSouce"))
			{
				Icount++;
				totalCost+=piz2.cost();
				name.add(piz2.name());
			}
			else if(input.equalsIgnoreCase("Zinger"))
			{
				Icount++;
				totalCost+=burg.cost();
				name.add(burg.name());
			}
			else if(input.equalsIgnoreCase("Chiken"))
			{
				Icount++;
				totalCost+=burg1.cost();
				name.add(burg1.name());
			}
			else if(input.equalsIgnoreCase("ChikenCheese"))
			{
				Icount++;
				totalCost+=burg2.cost();
				name.add(burg2.name());
			}
			else if(input.equalsIgnoreCase("pepsi"))
			{
				Icount++;
				totalCost+=cold.cost();
				name.add(cold.name());
			}
			else if(input.equalsIgnoreCase("mirinda"))
			{
				Icount++;
				totalCost+=cold1.cost();
				name.add(cold1.name());
			}
			System.out.println("\nDo you want to Continue 1 for Yes 2 for No.");
			Scanner readers = new Scanner(System.in); 
			int inputs = reader.nextInt();
			if(inputs==2)
			{
				break;
			}
		}
		System.out.println("==========================================================================");
		System.out.println("\n\nYou buy "+count+" Deal(s) and "+Icount+" Item(s)");
		System.out.println("\n");
		for (String item1 : name) {
	         System.out.println("Item Name :"+item1);
	      }	
		System.out.println("\nTotal Cost :"+totalCost+" Rs.");
	}

}
