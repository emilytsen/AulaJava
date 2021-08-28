/* Aumente a quantidade de números que terão os fatoriais impressos,
até 20, 30, 40. Em um determinado momento, além desse cálculo demorar, vai começar a mostrar respostas completamente erradas. Por quê? Mude de int para long para ver alguma mudança no caso do fatorial de 20? e de 30 e 40? */


public class Ex1 { //classe

    public void fatoreal() { //método 
        int fat20 = 1;
        int fat30 = 1;
        int fat40 = 1;

        for(int x=20; x>=1; x--){
            fat20 = fat20*x;
        }
        for(int y=30; y>=1; y--){
            fat30 = fat30*y;
        }
        for(int z=40; z>=1; z--){
            fat40 = fat40*z;
        }

        System.out.println("fatoreal de 20: " + fat20);
        System.out.println("fatoreal de 30: " + fat30);
        System.out.println("fatoreal de 40: " + fat40);
    }
}