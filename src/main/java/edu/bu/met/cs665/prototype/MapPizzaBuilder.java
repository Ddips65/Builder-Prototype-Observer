/*
 * Final project Description: Abstract class PizzaBuilder, is the builder in build pattern.
 * Builds the vege and nonvege pizza using builder class here we are mapping the category
 * of the pizza.
 */

package edu.bu.met.cs665.prototype;

import java.util.HashMap;
import java.util.Map;

/** MapPizzaBuilder is a class which map the category of the pizza. */
public class MapPizzaBuilder {

  private static Map<String, PizzaBuilder> pizzaMap = new HashMap<String, PizzaBuilder>();

  static {
    pizzaMap.put("VeganPizza", new VeganPizza());
    pizzaMap.put("RegualrPizza", new RegularPizza());
  }

  /**
   * Here we are cloning the pizza category vege/nonvege.
   *
   * @param pizzaCategory String
   * @return
   */
  public static PizzaBuilder getPizza(String pizzaCategory) {
    return (PizzaBuilder) pizzaMap.get(pizzaCategory).clone();
  }
}
