

public class Pattern9 {
    public static void main(String a[]){
        int n = 5;
        for(int rows = 1; rows <= n; rows++){
            if(rows == 1 || rows == 2 || rows == n){
                for(int cols = 1; cols <= rows; cols++){
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("* ");

                for(int cols = 1; cols <= (rows-2); cols++){
                    System.out.print("  ");
                }

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
