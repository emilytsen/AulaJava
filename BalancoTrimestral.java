public class BalancoTrimestral{
    public static void main (String args[]){
        int gastoJaneiro = 15000; 
        int gastoFevereiro = 23000;
        int gastoMarco = 17000;
        int gastoTrimestre =  gastoJaneiro + gastoFevereiro + gastoMarco;
        int gastoMensal = gastoTrimestre/3;
        System.out.println("Gasto trimestral: " + gastoTrimestre);
        System.out.println("Gasto mensal: " + gastoMensal);
    }
} 