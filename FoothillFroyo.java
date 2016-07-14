import java.util.Scanner;

/**
 * acknowledgement - Foothill College CS class
 */
public class FoothillFroyo
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    //int i = 0; // use temporarily for "insurance" against infinite loop
    int credits = 0;
    while (true)
    {
      System.out.print("Do you want frozen yogurt? ");
      String continueChoice = input.next();
      if (continueChoice.equals("N"))
      {
        break;
      }
      else if (!continueChoice.equals("Y"))
      {
        System.out.println("Please choose Y or N.");
        continue;
      }
      //      i++;
      //      if (i > 4)
      //        break;
      if (credits >= 10)
      {
        System.out.print("You have " + credits + " credits. Do you want to buy yogurt (B) or use credits (C)?");
        String buyChoice = input.next();
        if (buyChoice.equals("C"))
        {
          credits -= 10;
          System.out.println("You have received one free froyo and your balance is " + credits + " credits.");
        }
        else
        {
          credits = buyYogurt(input, credits);
        }
      }
      else
      {
        credits = buyYogurt(input, credits);
      }
    }
  }
  private static int buyYogurt(Scanner input, int credits)
  {
    System.out.print("How many? ");
    credits += input.nextInt();
    System.out.println("You have " + credits + " credits.");
    return credits;
  }
}
