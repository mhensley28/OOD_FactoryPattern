
public class CreatePizza {

	public static void main(String[] args) {
		PizzaStore everestStore = new EverestPizzaStore();
		PizzaStore kilaueaStore = new KilaueaPizzaStore();
 
		Pizza pizza = everestStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = kilaueaStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = everestStore.orderPizza("meat");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = kilaueaStore.orderPizza("meat");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = everestStore.orderPizza("veggie");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = kilaueaStore.orderPizza("veggie");
		System.out.println("Joel ordered a " + pizza + "\n");
	}
}
