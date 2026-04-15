public class Pattern21 {

    public static void main(String args[]) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            
            for (int j = 1; j <= i; j++) {
                int a = j;
                int b = 'A' - 1;
                int ans = a + b;
                char finalAns = (char) ans;
                System.out.print(finalAns + " ");
            }

            char toprint = (char)(i + 'A' - 2);

            for (int j = 1; j <= i - 1; j++) {
                System.out.print(toprint + " ");
                toprint--;
            }
            System.out.println();
        }
    }

}
