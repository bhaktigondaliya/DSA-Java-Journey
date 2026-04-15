//Pattern 4 : Solid Right - Angle Triangle Pattern

public class Pattern3{
    public static void main(String a[]){

        int n = 5;
        for(int rows = 1; rows <= n; rows++){
            for(int cols = 1; cols <= rows; cols++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}