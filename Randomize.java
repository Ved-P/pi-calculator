/**
 *  Calculates pi using the random function in the Math class.
 *
 *  Technique by Joma (Joma Tech).
 *
 *  @author Ved Pradhan
 *  @since  February 24, 2021
 */

public class Randomize {

  public static void describe() {
    System.out.println("\nThis method uses an algorithm based on the random "
      + "function in the Math class to calculate pi to a certain accuracy. "
      + "This technique is by Joma (Joma Tech).");
  }

  public static double pi(long n) {
    long inCircle = 0;
    for (long i = 0; i < n; i++) {
      double x = Math.random();
      double y = Math.random();
      if (Math.pow(x, 2) + Math.pow(y, 2) < 1)
        inCircle++;
    }
    return 4 * inCircle / (double) n;
  }

}
