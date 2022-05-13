/*
 * Final project Description: VeganPizza is one of the types of pizza menu.
 * It is one of the ConcreteBuilder in builder pattern.
 */

package edu.bu.met.cs665.prototype;

public class VeganPizza extends PizzaBuilder {

  /** VeganPizza constructor. */
  public VeganPizza() {
    this.pizzaCategory = "VeganPizza";
    buildPizza.setSize("Small");
  }

  /**
   * VeganPizza and Regualr both pizza type has a different menu.
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
    buildPizza.setPizzaName(vegepizzname);
  }

  /**
   * Whether it is vegan California Pizza or Italian pizza.
   *
   * @param vegpizzatype String
   */
  @Override
  public void buildPizzaType(String vegpizzatype) {
    buildPizza.setPizzaType(vegpizzatype);
  }

  /**
   * Customize the pizza topings.
   *
   * @param vegpizzatopings String
   */
  @Override
  public void buildpizzaTopings(String vegpizzatopings) {
    buildPizza.setPizzaTopings(vegpizzatopings);
  }

  /**
   * Finally pizza is prepared and ready.
   *
   * @return
   */
  @Override
  public Pizza getPizza() {
    return buildPizza;
  }
}
