
public class EverestPizzaStore extends PizzaStore{
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		IngredientFactory ingredientFactory =
		new EverestIngredientFactory();

		if (item.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Everest Style Frozen Cheese Pizza");
			
		} else if (item.equals("veggie")) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Everest Style Veggie Pizza");
			
		} else if (item.equals("meat")) {
			pizza = new MeatPizza(ingredientFactory);
			pizza.setName("Everest Style Meat Pizza");
		}
		return pizza;
	}
}
