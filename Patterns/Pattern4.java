public class Pattern4 {
    //Pattern 4 : Solid Rhombus Pattern

    public static void main(String a[]){
        int n = 5;

        for(int rows = 1; rows <= n; rows++){
            for(int col = 1; col <= n - rows; col++){
                System.out.print(" ");
            }
            for(int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
