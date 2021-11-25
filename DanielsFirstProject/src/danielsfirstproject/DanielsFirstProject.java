/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielsfirstproject;

/**
 *
 * @author dsilva
 */

import java.util.Scanner;
import java.util.HashMap;



    /**
     * @param args the command line arguments
     */
    
    
class MyKey {
  @Override
  public int hashCode(){
  return (int) System.currentTimeMillis();
  }
}
public class DanielsFirstProject {
  HashMap<MyKey, String> h = new HashMap();
  public static void main(String[] args) throws InterruptedException {
  DanielsFirstProject test = new DanielsFirstProject();
  MyKey key1 = new MyKey();
  test.h.put(key1, "MyFirstKey");
  MyKey key2 = new MyKey();
  test.h.put(key2, "SecondKey");
  System.out.println("Started ..but wait");
  Thread.sleep(3000);
  System.out.println("Reading...this shall be MyFirstKey-> "+ test.h.get(key1));
  System.out.println("Reading...this shall be SecondKey-> "+ test.h.get(key2));
  }
}
