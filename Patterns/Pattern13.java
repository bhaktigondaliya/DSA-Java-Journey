public class Pattern13 {
    public static void main(String a[]){
        int n = 4;

        for(int row = 1; row <= n ; row++){

            //part 1
            for(int cols = 1; cols <= row; cols++){
                System.out.print("* ");
            }

            //part 2  
            for(int cols = 1; cols <= 2*(n-row);cols++){
                System.out.print("  ");
            }

            //part 3
            for(int cols = 1; cols <= row; cols++){
                System.out.print("* ");
            }
            System.out.println();

        }


        for(int row = 1; row <= n ; row++){

            //part 4
            for(int cols = 1; cols <= n-row +1 ; cols++){
                System.out.print("* ");
            }

            //part 5
            
            for(int cols = 1; cols <= 2*(row - 1); cols++){
                System.out.print("  ");
            }

            //part 6

            for (int cols = 1; cols <= n - row + 1; cols++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    
        
    }
    
}
