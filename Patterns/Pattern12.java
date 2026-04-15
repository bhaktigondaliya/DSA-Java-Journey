public class Pattern12 {
    public static void main(String a[]) {
        int n = 5;

        for (int rows = 1; rows <= n; rows++) {

            // spaces
            for (int cols = 1; cols <= n - rows; cols++) {
                System.out.print("  ");
            }

            // stars
            if (rows == 1) {
                for (int cols = 1; cols <= 2 * rows - 1; cols++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("* ");
                for (int cols = 1; cols <= 2 * rows - 3; cols++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }

            System.out.println();
        }



        for(int rows = 1; rows <= n-1; rows++){

            for(int cols = 1; cols <= rows; cols++){
                System.out.print("  ");
            }

            if(rows == n-1){
                System.out.print("* ");
            }else{

                System.out.print("* ");

                for (int cols = 1; cols <= 2 * (n-rows)-3; cols++){
                    System.out.print("  ");
                }

                System.out.print("* ");
            }
            System.out.println();


        }


        
    }
}