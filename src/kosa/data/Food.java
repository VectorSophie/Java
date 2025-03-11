package kosa.data;

public class Food {
	private String foodName;
	private int price;
	
	public Food () {}
	
	public Food(String foodName, int price) {
		this.foodName = foodName;
		this.price = price;
	}
	
	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
	    return foodName + " - " + price + "¿ø";
	}
}
