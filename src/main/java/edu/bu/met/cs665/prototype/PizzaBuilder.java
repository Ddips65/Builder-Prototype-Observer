/**
 * Final project Description: Abstract class PizzaBuilder, is the builder in build pattern
 * It builds or construct the pizza.
 */

package edu.bu.met.cs665.prototype;

/** PizzaBuilder implements the cloneable interface. */
public abstract class PizzaBuilder implements Cloneable {

  protected Pizza buildPizza = new Pizza();

  // Define the pizza name from vegetarian  category.
  public abstract void buildPizzaName(String vegepizzname);

  // Define the pizza type.
  public abstract void buildPizzaType(String vegpizzatype);

  // Define the pizza topings.
  public abstract void buildpizzaTopings(String vegpizzatopings);

  // Getpizza.
  public abstract Pizza getPizza();

  // Get size of the pizza.
  public abstract String getSize();

  protected String pizzaCategory;

  /**
   * Object cloning refers to the creation of an exact copy of an object. It creates a new instance
   * of the class of the current object. clone() method of an object class is used to clone an
   * object.
   *
   * @return
   */
  public Object clone() {
    Object clone = null;
    try {
      clone = super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return clone;
  }

  public abstract String getPizzaCategory();
}
