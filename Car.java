public class Car
{
  private String        color;
  private int           fuel;
  private int           X;
  private int           Y;
  private double        moneySpent;
  private static double GAS_PRICE_PER_GALLON = 2.93;
  public Car()
  {
    color = "unknown";
  }
  public Car(String myColor, int myFuel, int myX, int myY)
  {
    color = myColor;
    fuel = myFuel;
    setX(myX); //initially: X = myX;
    setY(myY); //initially: Y = myY;
  }
  public void print()
  {
    System.out.println("________________________");
    System.out.println("Color: " + color);
    System.out.println("Fuel: " + fuel);
    System.out.println("X-position: " + X);
    System.out.println("Y-position: " + Y);
    System.out.println("Money spent: $" + moneySpent);
  }
  public int getFuel()
  {
    return fuel;
  }
  public int getX()
  {
    return X;
  }
  public int getY()
  {
    return Y;
  }
  public double getMoneySpent()
  {
    return moneySpent;
  }
  private void setX(int newX)
  {
    X = newX;
  }
  private void setY(int newY)
  {
    Y = newY;
  }
  private boolean setFuel(int newFuel)
  {
    if (newFuel > 0)
    {
      fuel = newFuel;
      return true;
    }
    return false;
  }
  private boolean spendMoney(double amount)
  {
    if (amount > 0)
    {
      moneySpent += amount;
      return true;
    }
    return false;
  }
  public boolean move(int xDistance, int yDistance)
  {
    int fuelNeeded = xDistance + yDistance;
    if (fuelNeeded <= fuel)
    {
      setFuel(fuel - fuelNeeded);
      setX(X + xDistance);
      setY(Y + yDistance);
      return true;
    }
    return false;
  }
  public void addFuel(int additionalFuel)
  {
    if (additionalFuel > 0)
    {
      setFuel(fuel + additionalFuel);
      spendMoney(additionalFuel * GAS_PRICE_PER_GALLON);
    }
  }
}
