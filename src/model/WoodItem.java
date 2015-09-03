/**
 * Class defining the elements of a wood type
 */
package model;

/**
 * @author Arshad
 *
 */
public class WoodItem {

	String type;
	Double baseDeliveryTime;
	Double price;
	int quantity;
	Double total_price;
	
	/**
	 * Default constructor 
	 */
	public WoodItem(){
		this.type = "Empty";
		this.baseDeliveryTime = 0.0;
		this.price = 0.0;
		this.quantity = 0;
		this.total_price = 0.0;
	}
	
	/**
	 * Constructor of a WoodItem element with parameters
	 * @param type Name of the wood type
	 * @param daseDeliveryTime base delivery time
	 * @param price price per Bare Foot
	 */
	public WoodItem(String type, Double baseDeliveryTime, Double price, int quantity, double total_price) {
		this.type = type;
		this.baseDeliveryTime = baseDeliveryTime;
		this.price = price;
		this.quantity = quantity;
		this.total_price = total_price;
	
	}

	/**
	 * Get the type of Wood
	 * 
	 * @return Name of the WoodItem
	 */
	public String getType() {
		return type;
	}

	/**
	 * Get the base delivery time
	 * 
	 * @return the baseDeliverytime
	 */
	public Double getBaseDeliveryTime() {
		return baseDeliveryTime;
	}

	/**
	 * 
	 * Get the price per Bare Foot
	 * 
	 * @return the price for 1 Bare Foot of this WoodItem
	 */
	public Double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public Double getTotal(){
		return total_price;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * You may implement this method to fit your needs
	 */
	@Override
	public String toString() {	
		return "";
	}
	
}
