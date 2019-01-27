
public class EverestIngredientFactory implements IngredientFactory{
	
	public Dough createDough() {
		return new PanDough();
	}
	
	public Sauce createSauce() {
		return new FrozenSauce();
	}
	
	public Cheese createCheese() {
		return new FrozenCheese();
	}
	
	public Veggies[] createVeggies() {
		Veggies veggies[] = {new GreenPepperVeggie(), new OnionVeggie(), new MushroomVeggie()};
		return veggies;
	}
	
	public Meats[] createMeats() {
		Meats meats[] = {new ChickenMeat(), new BaconMeat()};
		return meats;
	}
}
