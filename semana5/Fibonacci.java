public class Fibonacci {
    public void fibonacci() {
        
        int cont = 0;
        int x = 1;
        int y = 1;
        int z = 1;

        while (cont <= 6) {
            cont = cont + 1;
            z = x + y;
            System.out.print(" - " + z );

            x = y;
            y = z;
        }
    }
}
