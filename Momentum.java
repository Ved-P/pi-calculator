/**
 *  Calculates pi using the Law of Conservation of Momentum.
 *
 *  Technique by Grant Sanderson.
 *
 *  @author Ved Pradhan
 *  @since  December 12, 2020
 */

public class Momentum {

  public static double pi(long d) {
    double m1 = 1.0;
    double m2 = Math.pow(100.0, d);
    double v1 = 0.0;
    double v2 = -100.0;
    long collisions = 0;

    while (v2 < v1 || v1 < 0) {
      if (v1 < 0) {
        v1 *= -1;
        collisions++;
      }
      else {
        double vi1 = v1;
        double vi2 = v2;
        v1 = ((m1 - m2) * vi1 + 2 * m2 * vi2) / (m1 + m2);
        v2 = (2 * vi1 + (m2 - m1) * vi2) / (m2 + m1);
        collisions++;
      }
    }

    return collisions / Math.pow(10.0, d);
  }

}
