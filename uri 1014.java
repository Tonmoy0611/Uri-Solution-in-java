

import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    double X;
    double Y;
      X = sc.nextDouble ();
      Y = sc.nextDouble ();
      System.out.printf ("%.3f km/l\n", X / Y);
  }

}
