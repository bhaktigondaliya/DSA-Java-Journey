public class Pattern18 {

    public static void main(String a[]) {
        int n = 5;


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


        for (int rows = 1; rows <= n; rows++) {

            if(rows == 1){
                continue;
            }
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
