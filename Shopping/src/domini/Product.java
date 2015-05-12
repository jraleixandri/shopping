package domini;

/**
* An example product for use in the example shopping cart.
* @ Author Mike Clark
* @ Author Clarkware Consulting, Inc 
*/
public class Product {

	private String _title;
	private double _price;

	/**
	* Constructs a Product .
	* @ Param title Product title.
	* @ Param price Product price.
	*/
	public Product (String title, double price) {
		_title = title;
		_price = price;
	}

	/**
	* Returns the product title.
	* @ Return Title.
	*/
	public String getTitle () {
		return _title;
	}
	
	/**
	* Returns the product price.
	* @ Return Price.
	*/
	public double getPrice () {
		return _price;
	}
	
	/**
	* Tests product equality.
	* @ Return true if the products
	* Are equal.
	*/
	public boolean equals (Object o) {
		if (o instanceof Product) {
			Product p = (Product) o;
			return p.getTitle ().equals (_title);
		}	
		return false;
	}
}