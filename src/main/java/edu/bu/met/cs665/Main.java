/** Project Description: Main method to run program. */

package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.observable.ConcereteShop;
import edu.bu.met.cs665.example1.observer.ConcereteDriver;
import edu.bu.met.cs665.example1.other.CustomerDetails;
import edu.bu.met.cs665.prototype.MapPizzaBuilder;
import edu.bu.met.cs665.prototype.Pizza;
import edu.bu.met.cs665.prototype.PizzaBuilder;
import java.util.ArrayList;
import java.util.List;

public class Main {

  /**
   * A main method to run examples.
   *
   * @param args String
   */
  public static void main(String[] args) {

    // Create VeganPizza
    String italianPizza = "Italian";
    String italianPizzaType = "thinCrust";
    String italianPizzaTopings = "Olives";

    PizzaBuilder veganPizza = MapPizzaBuilder.getPizza("VeganPizza");
    veganPizza.buildPizzaName(italianPizza);
    veganPizza.buildPizzaType(italianPizzaType);
    veganPizza.buildpizzaTopings(italianPizzaTopings);
    Pizza vegan = veganPizza.getPizza();

    System.out.println("Menu: " + veganPizza.getPizzaCategory());
    System.out.println(vegan.toString());
    System.out.println();
    System.out.println("Order notification is sent to the driver: ");

    ConcereteShop inboundShop = new ConcereteShop("Inbound Pizza");

    String[] driverNames = { // define string array for driver names
      "Taxi Driver Lucy", "Van Driver Bob", "Taxi Driver Keli"
    };

    List<ConcereteDriver> driverNameList = new ArrayList<ConcereteDriver>();

    for (int i = 0; i < driverNames.length; i++) {
      driverNameList.add(new ConcereteDriver(driverNames[i]));
    }

    for (int k = 0; k < driverNameList.size(); k++) {
      inboundShop.subscribeDriver(driverNameList.get(k));
    }

    CustomerDetails objcust1 = new CustomerDetails(11, "BU East");
    ConcereteShop inboundPizzaShop = new ConcereteShop(veganPizza);
    inboundShop.setDeliveryRequestToDriver("New Delivery ", objcust1, inboundPizzaShop);

    // Create Regular pizza
    System.out.println();
    ConcereteShop basilShop = new ConcereteShop("Basil Pizza");
    String caliPizza = "California Pizza";
    String caliPizzaType = "Thickcrust";
    String caliPizzaTopings = "Mushrooms";

    PizzaBuilder regularPizza = MapPizzaBuilder.getPizza("RegualrPizza");
    regularPizza.buildPizzaName(caliPizza);
    regularPizza.buildPizzaType(caliPizzaType);
    regularPizza.buildpizzaTopings(caliPizzaTopings);

    Pizza regPizza = regularPizza.getPizza();
    System.out.println("Menu: " + regularPizza.getPizzaCategory());
    System.out.println(regPizza.toString());
    System.out.println();
    System.out.println("Order notification is sent to the driver: ");

    for (int k = 0; k < driverNameList.size(); k++) {
      basilShop.subscribeDriver(driverNameList.get(k));
    }

    CustomerDetails objcust2 = new CustomerDetails(21, "BU Centeral");
    ConcereteShop basilPizzaShop = new ConcereteShop(regularPizza);
    basilShop.setDeliveryRequestToDriver("New Delivery ", objcust2, basilPizzaShop);
  }
}
