import java.util.ArrayList;

public class Meal {
	private ArrayList<IPizza> items = new ArrayList<IPizza>();
	private ArrayList<IBurger> items1 = new ArrayList<IBurger>();
	private ArrayList<IColdrink> items2=new ArrayList<IColdrink>(); 
	public void addItem(IPizza item,IBurger item1,IColdrink item2)
	{
		items.add(item);
		items1.add(item1);
		items2.add(item2);
	}
	public float getCost()
	{
		float cost = 0.0f;
		 for (IPizza item : items) {
	         cost += item.cost();
	      }		
		 for (IBurger item1 : items1) {
	         cost += item1.cost();
	      }		
	      return cost;
	}
	 public void showItems(){
		   
	      for (IPizza item : items) {
	         System.out.print("Item : " + item.name());
	         System.out.print(", Price : " + item.cost());
	      }	
	      for (IBurger item1 : items1) {
		         System.out.print("\nItem : " + item1.name());
		          System.out.print(", Price : " + item1.cost());
		      }	
	      for (IColdrink item2 : items2) {
		         System.out.print("\nItem : " + item2.name());
		      }	
	   }	
}
