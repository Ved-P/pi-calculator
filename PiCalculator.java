/**
 *  Calculates pi using various techniques.
 *
 *  @author Ved Pradhan
 *  @since  December 12, 2020
 */

public class PiCalculator {

  public static void main(String[] args) {

    Momentum.describe();
    System.out.println(Momentum.pi(1));
    System.out.println(Momentum.pi(2));
    System.out.println(Momentum.pi(3));
    System.out.println(Momentum.pi(4));
    System.out.println(Momentum.pi(5));

    Randomize.describe();
    System.out.println(Randomize.pi(1000));
    System.out.println(Randomize.pi(10000));
    System.out.println(Randomize.pi(100000));
    System.out.println(Randomize.pi(1000000));
    System.out.println(Randomize.pi(10000000));

  }

}
