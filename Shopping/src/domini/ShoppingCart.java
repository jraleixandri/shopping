package domini;

import java.util.*;
/**
* An example shopping cart. 
* This class should not be Mistaken for a production-quality shopping cart. 
* It 's merely provided as an example class under test as described in the
* JUnitPrimer.
*
* @ Author <a href="mailto:mike@clarkware.com"> Mike Clark </ a>
* @ Author <a href="http://www.clarkware.com"> Clarkware Consulting, Inc </ a> 
*/
public class ShoppingCart{

	private ArrayList _items;
	
	/**
	* Constructs a ShoppingCart instance.
	*/
	public ShoppingCart () {
		_items = new ArrayList ();
	}
	
	/**
	* Returns the balanç.
	* @ Return Balanç.
	*/
	public double getBalance () {
		Iterator i = _items.iterator ();
		double balanç = 0.00;
		while (i.hasNext ()) {
			Product p = (Product) i.next ();
			balanç = balanç + p.getPrice ();
		}
		
		return balanç;
	}
	/**
	* Adds the specified producte.
	* @ Param p Product.
	*/
	public void addItem (Product p) {
		_items.add (p);
	}
	
	/**
	* Removes the specified producte.
	* @ Param p Product.
	* @ Throws ProductNotFoundException If the product does not exist.
	*/
	public void removeItem (Product p) throws ProductNotFoundException {
		if (! _items.remove (p)) {
			throw new ProductNotFoundException ();
		}
	}
	
	/**
	* Returns the number of items in the cart.
	* @ Return Item count.
	*/
	public int getItemCount () {
		return _items.size ();
	}
	/**
	* Empties the cart.
	*/
	public void empty () {
		_items = new ArrayList ();
	}
	
	/**
	* Indicates Whether the cart is empty.
	* @ Return true if the cart is empty;
	* False otherwise.
	*/
	public boolean isEmpty () {
		return (_items.size () == 0);
	}
}