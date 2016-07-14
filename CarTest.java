public class CarTest
{
  /**
   * @param args
   */
  public static void main(String[] args)
  {
    Car c = new Car();
    //System.out.println(c.fuel); // won't work unless public
    Car c2 = new Car("red", 20, 2, 0);
    c.print();
    c2.print();
    boolean result = c2.move(3, 5); // not using this, but could with additional functionality
    c2.print();
    c2.move(2, 3);
    c2.print();
    c2.move(20, 0);
    c2.print();
    c2.addFuel(40);
    c2.print();
    c2.move(20, 0);
    c2.print();
  }
}
