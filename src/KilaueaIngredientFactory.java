
public class KilaueaIngredientFactory implements IngredientFactory{
	
	public Dough createDough() {
		return new HandtossedDough();
	}
	
	public Sauce createSauce() {
		return new FireSauce();
	}
	
	public Cheese createCheese() {
		return new MeltedCheese();
	}
	
	public Veggies[] createVeggies() {
		Veggies veggies[] = {new GreenPepperVeggie(), new OnionVeggie(), new MushroomVeggie()};
		return veggies;
	}
	
	public Meats[] createMeats() {
		Meats meats[] = {new OstrichMeat(), new BaconMeat()};
		return meats;
	}
}
