public class Ex3 {
    public void encadeados(){

        for (int x=1; x<=4; x++){
            System.out.println("rodada"+x);
            for(int y=1; y<=x; y++){
                int z = x * y;
                System.out.print(z + " ");
            }
            System.out.println();
        }
    }
}
