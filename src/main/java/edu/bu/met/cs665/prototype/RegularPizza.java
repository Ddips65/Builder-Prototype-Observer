/*
 * Final project Description: Regular is one of the types of pizza menu.
 * It is one of the ConcreteBuilder in builder pattern.
 */

package edu.bu.met.cs665.prototype;

public class RegularPizza extends PizzaBuilder {

  public RegularPizza() {
    this.pizzaCategory = "RegualrPizza";
    buildPizza.setSize("Large");
  }

  /**
   * There are two categories while selecting the pizzza vegan and regular.
   *
   * @return
   */
  public String getPizzaCategory() {
    return this.pizzaCategory;
  }

  /**
   * Get the size of the pizza.
   *
   * @return
   */
  public String getSize() {
    return this.buildPizza.getSize();
  }

  /**
   * Construct the pizza.
   *
   * @param vegepizzname String
   */
  @Override
  public void buildPizzaName(String vegepizzname) {
    // TODO Auto-generated method stub
    buildPizza.setPizzaName(vegepizzname);
  }

  /**
   * Whether it is vegan California Pizza or Italian pizza.
   *
   * @param vegpizzatype String
   */
  @Override
  public void buildPizzaType(String vegpizzatype) {
    // TODO Auto-generated method stub
    buildPizza.setPizzaType(vegpizzatype);
  }

  /**
   * Customize the pizza topings.
   *
   * @param vegpizzatopings String
   */
  @Override
  public void buildpizzaTopings(String vegpizzatopings) {
    // TODO Auto-generated method stub
    buildPizza.setPizzaTopings(vegpizzatopings);
  }

  /**
   * Finally pizza is prepared and ready.
   *
   * @return
   */
  @Override
  public Pizza getPizza() {
    // TODO Auto-generated method stub
    return buildPizza;
  }
}
