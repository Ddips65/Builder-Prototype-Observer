/**
 * Name : Dipti Doshi
 * Course : MET CS 665
 * Date : 5/05/2022
 * Project Description: Shop interface contains methods about subscribe(Register) drivers
 * unsubscribe driver and send delivery notification to notify subscriber driver.
 */

package edu.bu.met.cs665.example1.interfacesubjectobserver;

/** Shop interface is subject or observable in the observer pattern. */
public interface ShopInterface {

  void subscribeDriver(DriverInterface di); // register driver method

  void unsubscribeDriver(DriverInterface di); // remove driver

  void notifySubscribeDrivers(); // send delivery notification to registered driver.
}
