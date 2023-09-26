/*
 * Given a point in a Euclidean plane (x and y), return the quadrant the point
 * exists in: 1, 2, 3 or 4 (integer). x and y are non-zero integers, therefore
 * the given point never lies on the axes.
 */

public class Quadrants {
    public static int quadrant(int x, int y) {
        return x > 0 ? y > 0 ? 1 : 4 : y > 0 ? 2 : 3;
    }

    public static void main(String[] args) {
        System.out.println(quadrant(1, 2));  // 1
        System.out.println(quadrant(3, 5));  // 1
        System.out.println(quadrant(-10, 100)); // 2
        System.out.println(quadrant(-1, -9));      // 3
        System.out.println(quadrant(19, -56));  // 4
    }
}