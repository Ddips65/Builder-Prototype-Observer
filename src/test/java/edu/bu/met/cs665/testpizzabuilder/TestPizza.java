/**
 * Project Description: Diffetent test cases for test pizza class.
 */


package edu.bu.met.cs665.testpizzabuilder;

import edu.bu.met.cs665.example1.interfacesubjectobserver.DriverInterface;
import edu.bu.met.cs665.example1.observable.ConcereteShop;
import edu.bu.met.cs665.example1.observer.ConcereteDriver;
import edu.bu.met.cs665.prototype.MapPizzaBuilder;
import edu.bu.met.cs665.prototype.PizzaBuilder;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Test pizza class test the different test cases like testPizzaCategory ,testNameOfPizza
 * testTypeOfPizza,testTopingsOfPizza,testSizeofPizza,testTopingsOfPizza,testPizzaOrder
 * testNameOfRegularPizza,testAddNewSubscribeDriver,testUnsubscribeDriver
 */
public class TestPizza {

  String[] driverNames = {"Driver Lucy", "Driver Bob", "Driver Keli"};

  List<ConcereteDriver> driverNameList = new ArrayList<ConcereteDriver>();
  ConcereteShop inboundShop = new ConcereteShop("Inbound Pizza");

  /** There are two types of the pizza category VegePizza and and nonvegepizza. */
  @Test
  public void testPizzaCategory() {

    String italianPizza = "Italian";
    String italianPizzaType = "thinCrust";
    String italianPizzaTopings = "Olives";

    PizzaBuilder pb = MapPizzaBuilder.getPizza("VeganPizza");
    pb.buildPizzaName(italianPizza);
    pb.buildPizzaType(italianPizzaType);
    pb.buildpizzaTopings(italianPizzaTopings);

    assertEquals("VeganPizza", pb.getPizzaCategory());
  }

  /** Test Name of the pizza Italian/California Pizza */
  @Test
  public void testNameOfPizza() {
    String italianPizza = "Italian";
    String italianPizzaType = "thinCrust";
    String italianPizzaTopings = "Olives";

    PizzaBuilder pb = MapPizzaBuilder.getPizza("VeganPizza");
    pb.buildPizzaName(italianPizza);
    pb.buildPizzaType(italianPizzaType);
    pb.buildpizzaTopings(italianPizzaTopings);

    ConcereteShop italianorder = new ConcereteShop(pb);
    assertEquals("Italian", italianorder.getFood().getPizza().getPizzaName());
  }

  /** Test the pizza is thinCrust/thickCrust. */
  @Test
  public void testTypeOfPizza() {
    String italianPizza = "Italian";
    String italianPizzaType = "thinCrust";
    String italianPizzaTopings = "Olives";

    PizzaBuilder pb = MapPizzaBuilder.getPizza("VeganPizza");
    pb.buildPizzaName(italianPizza);
    pb.buildPizzaType(italianPizzaType);
    pb.buildpizzaTopings(italianPizzaTopings);

    ConcereteShop italianorder = new ConcereteShop(pb);
    assertEquals("thinCrust", italianorder.getFood().getPizza().getPizzaType());
  }

  /** Test the topings of the pizza. */
  @Test
  public void testTopingsOfPizza() {
    String italianPizza = "Italian";
    String italianPizzaType = "thinCrust";
    String italianPizzaTopings = "Olives";

    PizzaBuilder pb = MapPizzaBuilder.getPizza("VeganPizza");
    pb.buildPizzaName(italianPizza);
    pb.buildPizzaType(italianPizzaType);
    pb.buildpizzaTopings(italianPizzaTopings);

    ConcereteShop italianorder = new ConcereteShop(pb);
    assertEquals("Olives", italianorder.getFood().getPizza().getPizzaTopings());
  }

  /** Test the size of the pizza Small/Large. */
  @Test
  public void testSizeofPizza() {
    String italianPizza = "Italian";
    String italianPizzaType = "thinCrust"; // thickcrust
    String italianPizzaTopings = "Olives";

    PizzaBuilder pb = MapPizzaBuilder.getPizza("VeganPizza");

    pb.buildPizzaName(italianPizza);
    pb.buildPizzaType(italianPizzaType);
    pb.buildpizzaTopings(italianPizzaTopings);
    assertEquals("Small", pb.getSize());
  }

  /** Test the pizza order. */
  @Test
  public void testPizzaOrder() {
    String italianPizza = "Italian";
    String italianPizzaType = "thinCrust"; // thickcrust
    String italianPizzaTopings = "Olives";

    PizzaBuilder pb = MapPizzaBuilder.getPizza("VeganPizza");
    pb.buildPizzaName(italianPizza);
    pb.buildPizzaType(italianPizzaType);
    pb.buildpizzaTopings(italianPizzaTopings);
  }

  @Test
  public void testNameOfRegularPizza() {
    String caliPizza = "California Pizza";
    String pizzaName = "Thickcrust";
    String typeOfPizzaTopings = "Mushrooms";

    PizzaBuilder pb = MapPizzaBuilder.getPizza("RegualrPizza");
    pb.buildPizzaName(caliPizza);
    pb.buildPizzaType(pizzaName);
    pb.buildpizzaTopings(typeOfPizzaTopings);

    ConcereteShop italianorder = new ConcereteShop(pb);
    assertEquals("California Pizza", italianorder.getFood().getPizza().getPizzaName());
  }

  @Test
  public void testAddNewSubscribeDriver() {
    ArrayList<DriverInterface> arListDriver = null;
    for (int i = 0; i < driverNames.length; i++) {
      driverNameList.add(new ConcereteDriver(driverNames[i]));
      inboundShop.subscribeDriver(driverNameList.get(i));
    }
    ConcereteDriver addNewDriver = new ConcereteDriver("Taxi Driver Joel");
    inboundShop.subscribeDriver(addNewDriver);
    assertEquals(4, inboundShop.getDriverList().size());
  }

  /** test case for unsubscribe or remove the driver from driverList */
  @Test
  public void testUnsubscribeDriver() {
    for (int i = 0; i < driverNames.length; i++) {
      driverNameList.add(new ConcereteDriver(driverNames[i]));
      inboundShop.subscribeDriver(driverNameList.get(i));
      inboundShop.unsubscribeDriver(driverNameList.get(0));
    }
    assertEquals(2, inboundShop.getDriverList().size());
  }
}
