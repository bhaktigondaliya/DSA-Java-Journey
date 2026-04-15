//Pattern 5 :Solid Pyramid Pattern

public class Pattern6 {

    public static void main(String a[]) {
        int n = 5;

        for (int rows = 1; rows <= n; rows++) {
            // for spaces
            for (int cols = 1; cols <= n - rows; cols++) {
                System.out.print("  ");
            }
            // for stars
            for (int cols = 1; cols <= (2 * rows) - 1; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
