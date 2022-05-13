/**
 * Name : Dipti Doshi
 * Course : MET CS 665
 * Date : 5/5/2022
 * Description: ConcereteShop is a type of observerable which implement subject (shop interface).
 */

package edu.bu.met.cs665.example1.observable;

import edu.bu.met.cs665.example1.interfacesubjectobserver.DriverInterface;
import edu.bu.met.cs665.example1.interfacesubjectobserver.ShopInterface;
import edu.bu.met.cs665.example1.other.CustomerDetails;
import edu.bu.met.cs665.prototype.PizzaBuilder;
import java.util.ArrayList;

/**
 * ConcereteShop has a basic detials about the shop and implement subscribe unsubscribe and
 * notifysubscribe driver methods.
 */
public class ConcereteShop implements ShopInterface {
  private String shopName;
  private ArrayList<DriverInterface> driverList = new ArrayList<DriverInterface>();
  private CustomerDetails cd;
  private DeliveryRequest request;
  private String latestDeliveryUpdate;
  private ConcereteShop csm;
  private PizzaBuilder food;

  /**
   * ConcereteShop constructor.
   *
   * @param food PizzaBuilder
   */
  public ConcereteShop(PizzaBuilder food) {
    this.food = food;
  }

  /**
   * Getter food.
   *
   * @return
   */
  public PizzaBuilder getFood() {
    return this.food;
  }

  /**
   * setter food.
   *
   * @param food PizzaBuilder
   */
  public void setFood(PizzaBuilder food) {
    this.food = food;
  }

  /**
   * parameterize constructor set the shop name and product name.
   *
   * @param shopName String
   */
  public ConcereteShop(String shopName) {
    this.shopName = shopName;
  }

  /**
   * get shop name.
   *
   * @return shop Name.
   */
  public String getShopName() {
    return shopName;
  }

  /**
   * set shop name.
   *
   * @param shopName String
   */
  public void setShopName(String shopName) {
    this.shopName = shopName;
  }

  /**
   * getter of name Driver list.
   *
   * @return driverList
   */
  public ArrayList<DriverInterface> getDriverList() {
    return driverList;
  }

  /**
   * setter name of driver list.
   *
   * @param driverList ArrayList
   */
  public void setDriverList(ArrayList<DriverInterface> driverList) {
    this.driverList = driverList;
  }

  /**
   * Send delivery request to driver.
   *
   * @param latestDeliveryUpdate String
   * @param cd CustomerDetails
   * @param csm ConcereteShop
   */
  public void setDeliveryRequestToDriver(
      String latestDeliveryUpdate, CustomerDetails cd, ConcereteShop csm) {
    this.latestDeliveryUpdate = latestDeliveryUpdate;
    this.cd = cd;
    this.csm = csm;
    this.notifySubscribeDrivers();
  }

  /**
   * Add subscriber driver to the Arraylist(driverList) of subscribers.
   *
   * @param di DriverInterface
   */
  @Override
  public void subscribeDriver(DriverInterface di) {
    driverList.add(di);
  }

  /**
   * Remove subscriber driver to the Arraylist(driverList) of subscribers.
   *
   * @param di DriverInterface
   */
  @Override
  public void unsubscribeDriver(DriverInterface di) {
    driverList.remove(di);
  }

  /** Call the updateDriver() on each subscriber when the data changes. */
  @Override
  public void notifySubscribeDrivers() {
    for (DriverInterface di : driverList) {
      request = new DeliveryRequest(di, this, cd);
      di.updateDriver(this.latestDeliveryUpdate, this.shopName, request);
    }
  }
}
