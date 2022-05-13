/*
 * Final project Description: Pizza class is a blueprint of the how to build pizza.
 */

package edu.bu.met.cs665.prototype;

/**
 * Pizza class contains the information about pizzaName,Pizzatype,Size of the pizza and pizza
 * topings.
 */
public class Pizza {

  public String pizzaName;
  public String pizzaType;
  public String size;
  public String pizzaTopings;

  /**
   * Get the pizza name.
   *
   * @return pizzaName
   */
  public String getPizzaName() {
    return pizzaName;
  }

  /**
   * Set the pizza name.
   *
   * @param pizzaName String
   */
  public void setPizzaName(String pizzaName) {
    this.pizzaName = pizzaName;
  }

  /**
   * Get types of the pizza whether it is California Pizza or Italian.
   *
   * @return
   */
  public String getPizzaType() {
    return pizzaType;
  }

  /**
   * Set types of the pizza whether it is California Pizza or Italian.
   *
   * @param pizzaType String
   */
  public void setPizzaType(String pizzaType) {
    this.pizzaType = pizzaType;
  }

  /**
   * Get size of the Pizza.
   *
   * @return String
   */
  public String getSize() {
    return size;
  }

  /**
   * set the size of the pizza.
   *
   * @param size String
   */
  public void setSize(String size) {
    this.size = size;
  }

  /**
   * Get pizza topings.
   *
   * @return
   */
  public String getPizzaTopings() {
    return pizzaTopings;
  }

  /**
   * set pizza topings.
   *
   * @param pizzaTopings String
   */
  public void setPizzaTopings(String pizzaTopings) {
    this.pizzaTopings = pizzaTopings;
  }

  /**
   * Display the data.
   *
   * @return
   */
  public String toString() {
    String tostring =
        ("Name of the Pizza is: "
            + this.getPizzaName()
            + "\n"
            + "type of the pizza is "
            + this.getPizzaType()
            + "\n"
            + "Size of the pizza is "
            + this.getSize()
            + "\n"
            + "Customize pizza topings is "
            + this.getPizzaTopings());
    return tostring;
  }
}
