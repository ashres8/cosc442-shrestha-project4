package edu.towson.cis.cosc442.project4.coffeemaker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import junit.framework.TestCase;

/**
 *
 */
public class CoffeeMakerTest extends TestCase {
	private CoffeeMaker cm;
	private Inventory i;
	private Recipe r1;

	public void setUp() {
		cm = new CoffeeMaker();
		i = cm.checkInventory();

		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(3);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(0);
	}

	public void testAddRecipe1() {
		assertTrue(cm.addRecipe(r1));
	}
	
	public void testAddRecipe2() {
		cm.addRecipe(r1);
		assertFalse(cm.addRecipe(r1));
	}
	
	public void testAddRecipe3() {
		
		Recipe r2 = new Recipe();
		r2.setName("Coffee 2");
		r2.setPrice(50);
		r2.setAmtCoffee(3);
		r2.setAmtMilk(1);
		r2.setAmtSugar(1);
		r2.setAmtChocolate(0);
		
		Recipe r3 = new Recipe();
		r3.setName("Coffee 3");
		r3.setPrice(50);
		r3.setAmtCoffee(3);
		r3.setAmtMilk(1);
		r3.setAmtSugar(1);
		r3.setAmtChocolate(0);
		
		Recipe r4 = new Recipe();
		r4.setName("Coffee 4");
		r4.setPrice(50);
		r4.setAmtCoffee(3);
		r4.setAmtMilk(1);
		r4.setAmtSugar(1);
		r4.setAmtChocolate(0);
		
		Recipe r5 = new Recipe();
		r5.setName("Coffee 5");
		r5.setPrice(50);
		r5.setAmtCoffee(3);
		r5.setAmtMilk(1);
		r5.setAmtSugar(1);
		r5.setAmtChocolate(0);
		
		cm.addRecipe(r1);
		cm.addRecipe(r2);
		cm.addRecipe(r3);
		cm.addRecipe(r4);
		assertFalse(cm.addRecipe(r5));
	}

	public void testDeleteRecipe1() {
		cm.addRecipe(r1);
		assertTrue(cm.deleteRecipe(r1));
	}
	
	public void testDeleteRecipe2() {
		assertFalse(cm.deleteRecipe(null));
	}
	
	public void testDeleteRecipe3() {
		assertFalse(cm.deleteRecipe(new Recipe()));
	}

	public void testEditRecipe1() {
		cm.addRecipe(r1);
		Recipe newRecipe = new Recipe();
		newRecipe = r1;
		newRecipe.setAmtSugar(2);
		assertTrue(cm.editRecipe(r1, newRecipe));
	}
	
	public void testEditRecipe2() {
		cm.addRecipe(r1);
		
		Recipe r2 = new Recipe();
		r2.setName("Coffee 2");
		r2.setPrice(50);
		r2.setAmtCoffee(3);
		r2.setAmtMilk(1);
		r2.setAmtSugar(1);
		r2.setAmtChocolate(0); 

		cm.addRecipe(r2);
		
		assertTrue(cm.editRecipe(r1, r2));
	}
	
	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 5:10 PM
	 */
	@Test
	public void testAddInventory_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 0;
		int amtChocolate = -1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 5:10 PM
	@Test
	public void testAddInventory_2()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtCoffee = 3;
		int amtMilk = 1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(true, result);
	}
	 */

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 5:10 PM
	 */
	@Test
	public void testAddInventory_3()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtCoffee = -1;
		int amtMilk = 1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 5:10 PM
	 */
	@Test
	public void testAddInventory_4()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtCoffee = 1;
		int amtMilk = -1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 5:10 PM
	 */
	@Test
	public void testAddInventory_5()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}
	
	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 5:10 PM
	 */
	@Test
	public void testAddInventory_6()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 0;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(true, result);
	}
	
	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 5:10 PM
	 */
	@Test
	public void testAddInventory_7()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtCoffee = 0;
		int amtMilk = 0;
		int amtSugar = 0;
		int amtChocolate = 0;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(true, result);
	}
	
	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 5:10 PM
	 */
	@Test
	public void testAddInventory_8()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = -1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		Inventory i = fixture.checkInventory();
		
		// add additional test code here
		assertEquals(true, (i.getChocolate() == 15 + amtChocolate) && 
				(i.getCoffee() == 15 + amtCoffee) &&
				(i.getMilk() == 15 + amtMilk) &&
				(i.getSugar() == 15 + amtSugar));
	}
	
	
	/**
	 * Run the Inventory checkInventory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 5:10 PM
	 */
	@Test
	public void testCheckInventory_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();

		Inventory result = fixture.checkInventory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Coffee: 15\r\nMilk: 15\r\nSugar: 15\r\nChocolate: 15\r\n", result.toString());
		assertEquals(15, result.getMilk());
		assertEquals(15, result.getChocolate());
		assertEquals(15, result.getCoffee());
		assertEquals(15, result.getSugar());
	}
	
	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 5:10 PM
	 */
	@Test
	public void testGetRecipeForName_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getAmtCoffee());
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 5:10 PM
	 */
	@Test
	public void testGetRecipeForName_2()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		fixture.addRecipe(r1);
		String name = "Coffee";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(name, result.getName());
		assertEquals(1, result.getAmtSugar());
		assertEquals(50, result.getPrice());
		assertEquals(1, result.getAmtMilk());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(3, result.getAmtCoffee());
	}
	
	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 5:10 PM
	 */
	@Test
	public void testMakeCoffee_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtPaid = 50;

		int result = fixture.makeCoffee(r1, amtPaid);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 5:10 PM
	 */
	@Test
	public void testMakeCoffee_2()
			throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtPaid = 40;

		int result = fixture.makeCoffee(r1, amtPaid);

		// add additional test code here
		assertEquals(40, result);
	}
	
	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 5:10 PM
	 */
	@Test
	public void testMakeCoffee_3()
			throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtPaid = 40;
		
		Recipe r2 = new Recipe();
		r2.setName("Coffee 2");
		r2.setPrice(50);
		r2.setAmtCoffee(20);
		r2.setAmtMilk(1);
		r2.setAmtSugar(1);
		r2.setAmtChocolate(0); 

		int result = fixture.makeCoffee(r2, amtPaid);

		// add additional test code here
		assertEquals(40, result);
	}
	
	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 5:10 PM
	 */
	@Test
	public void testMakeCoffee_4()
			throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtPaid = 50;

		Recipe r2 = new Recipe();
		r2.setName("Coffee 2");
		r2.setPrice(50);
		r2.setAmtCoffee(1);
		r2.setAmtMilk(1);
		r2.setAmtSugar(1);
		r2.setAmtChocolate(1); 
		
		int result = fixture.makeCoffee(r2, amtPaid);

		Inventory i = fixture.checkInventory();
		
		// add additional test code here
		assertEquals(true, (i.getChocolate() == 15 - 1) && 
				(i.getCoffee() == 15 - 1) &&
				(i.getMilk() == 15 - 1) &&
				(i.getSugar() == 15 - 1));
	}
	
	/**
	 * Run the Recipe[] getRecipes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 5:10 PM
	 */
	@Test
	public void testGetRecipes_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();

		Recipe[] result = fixture.getRecipes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].toString());
		assertEquals(null, result[0].getName());
		assertEquals(0, result[0].getAmtSugar());
		assertEquals(0, result[0].getPrice());
		assertEquals(0, result[0].getAmtMilk());
		assertEquals(0, result[0].getAmtChocolate());
		assertEquals(0, result[0].getAmtCoffee());
		assertNotNull(result[1]);
		assertEquals(null, result[1].toString());
		assertEquals(null, result[1].getName());
		assertEquals(0, result[1].getAmtSugar());
		assertEquals(0, result[1].getPrice());
		assertEquals(0, result[1].getAmtMilk());
		assertEquals(0, result[1].getAmtChocolate());
		assertEquals(0, result[1].getAmtCoffee());
		assertNotNull(result[2]);
		assertEquals(null, result[2].toString());
		assertEquals(null, result[2].getName());
		assertEquals(0, result[2].getAmtSugar());
		assertEquals(0, result[2].getPrice());
		assertEquals(0, result[2].getAmtMilk());
		assertEquals(0, result[2].getAmtChocolate());
		assertEquals(0, result[2].getAmtCoffee());
		assertNotNull(result[3]);
		assertEquals(null, result[3].toString());
		assertEquals(null, result[3].getName());
		assertEquals(0, result[3].getAmtSugar());
		assertEquals(0, result[3].getPrice());
		assertEquals(0, result[3].getAmtMilk());
		assertEquals(0, result[3].getAmtChocolate());
		assertEquals(0, result[3].getAmtCoffee());
	}

}