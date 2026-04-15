//Pattern 1 : Solid Square Pattern

public class Pattern1 {
    public static void main(String a[]){
        int n = 4;

        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                System.out.print("* " );
            }
            System.out.println();
        }

    }
    
}
