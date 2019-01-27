
public class KilaueaPizzaStore extends PizzaStore{
	
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		IngredientFactory ingredientFactory =
		new KilaueaIngredientFactory();

		if (item.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Kilauea Style Melted Cheese Pizza");
			
		} else if (item.equals("veggie")) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Kilauea Style Veggie Pizza");
			
		} else if (item.equals("meat")) {
			pizza = new MeatPizza(ingredientFactory);
			pizza.setName("Kilauea Style Meat Pizza");
		}
		return pizza;
	}
}
