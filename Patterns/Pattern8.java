// Pattern 8 : Hollow Rectangle Pattern

public class Pattern8 {
    public static void main(String a[]){

        int n = 4;

        for(int rows = 1 ; rows <= n; rows++){
            for(int cols = 1; cols <= 6; cols++){
                if(rows == 1 || rows == n){
                    System.out.print("* ");
                }else{
                    if(cols == 1){
                        System.out.print("* ");
                    }
                    else if(cols == 6){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("  ");
        }

    }
    
}
