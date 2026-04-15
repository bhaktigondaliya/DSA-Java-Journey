//Pattern 5 : Inverted Right angle

public class Pattern5 {
    public static void main(String a[]){
        int n = 5;
        
        for(int rows = 1; rows <= n ; rows++){
            for(int cols = 1; cols <= n - rows + 1; cols++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
