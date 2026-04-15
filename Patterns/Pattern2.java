//Pattern 2 : Solid Rectangular Pattern

public class Pattern2 {
    public static void main(String a[]){
        int n = 3;
        for(int rows = 1; rows <= n; rows++){
            for(int cols = 1; cols <= 5; cols++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
