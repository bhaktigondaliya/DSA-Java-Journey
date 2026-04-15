//Pattern 7 : Inverted Solid Pyramid Pttern

public class Pattern7 {
    public static void main(String a[]) {
        int n = 4;

        for (int rows = 1; rows <= n; rows++) {
            // for spaces
            for (int cols = 1; cols <= rows - 1; cols++) {
                System.out.print("  ");
            }
            for (int cols = 1; cols <= (n * 2) - rows - (rows - 1); cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
