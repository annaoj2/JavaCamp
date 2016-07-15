public class Receipt
{
  public static void main(String[] args)
  {
    double price = 10.27;
    String item = "Package of socks";
    String name = "Joanna";
    int quantity = 2;
    printReceipt(price, item, name, quantity);
  }
  private static void printReceipt(double price, String item, String name, int quantity)
  {
    double totalPrice = quantity * price;
    System.out.println("Receipt");
    System.out.println("--------------");
    System.out.println(item + ": $" + price);
    System.out.println("Quantity of items: " + quantity);
    System.out.println("Total price:" + totalPrice);
    System.out.println();
    System.out.println("Thanks for shopping with us, " + name + "! Have a great day.");
  }
}
