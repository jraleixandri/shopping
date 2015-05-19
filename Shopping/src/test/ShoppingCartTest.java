package test;

import domini.Product;
import domini.ProductNotFoundException;
import domini.ShoppingCart; 

import junit.framework.TestCase;

public class ShoppingCartTest extends TestCase {
	
	private ShoppingCart _bookCart;
	private Product _defaultBook;
	
	/**
	 * Constructs a ShoppingCartTest with the specified name.
	 * @ Param nom Test casi name.
	 */
	public ShoppingCartTest(String name) {
		super(name);
	}
	/**
	* Sets up the test fixture.
	* Called before every test case method.
	*/
	protected void setUp() {
		_bookCart = new ShoppingCart ();
		_defaultBook = new Product ("Extreme Programming", 23.95);
		_bookCart.addItem (_defaultBook);
	}
	/**
	* Tears down the test fixture.
	* Called after every test case method.
	*/
	protected void tearDown () {
		_bookCart = null;
	}

	public void testShoppingCart() {
		fail("Not yet implemented");
	}

	public void testGetBalance() {
		fail("Not yet implemented");
	}

	public void testAddItem() {
		fail("Not yet implemented");
	}

	public void testRemoveItem() {
		fail("Not yet implemented");
	}

	public void testGetItemCount() {
		fail("Not yet implemented");
	}

	/**
	* Tests the emptying of the cart.
	*/
	public void testEmpty () {

		_bookCart.empty ();
		assertTrue (_bookCart.isEmpty ());
	}
	
	public void testIsEmpty() {
		fail("Not yet implemented");
	}
	/**
	* Tests adding a product to the cart.
	*/
	public void testProductAdd () {
		Product newBook = new Product ("Refactoring", 53.95);
		_bookCart.addItem (newBook);
	
		double expectedBalance = _defaultBook.getPrice () + newBook.getPrice ();
		assertEquals (expectedBalance, _bookCart.getBalance (), 0.0);
	
		assertEquals (2, _bookCart.getItemCount ());
	}
	/*** Tests removing an unknown product from the cart. 
	*This test is successful if the
	* ProductNotFoundException is raised. 
	*/ 
	public void testProductNotFound () {
		try {
			Product book = new Product ("Ender s Game", 4.95); 
			_bookCart.removeItem (book); 
			fail ("Should raise a ProductNotFoundException");
		} catch (ProductNotFoundException success) {
			//successful test
		} 
	}

	/**
	* Tests removing a product from the cart.
	* @ Throws ProductNotFoundException If the product was not in the cart.
	*/
	public void testProductRemove () throws ProductNotFoundException {
		_bookCart.removeItem (_defaultBook);
		assertEquals (0, _bookCart.getItemCount ());
		assertEquals (0.0, _bookCart.getBalance (), 0.0);
	}
	
	
}