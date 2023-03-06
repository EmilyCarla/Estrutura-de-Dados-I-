import java.util.Scanner;
//certa
public class Algoritmo358 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double precocompra[] = new double[100], precovenda[] = new double[100], lucro;
        int totlucromenor10, totlucromenor20, totlucromaior20, A;

        totlucromenor10 = 0;
        totlucromenor20 = 0;
        totlucromaior20 = 0;

        for(A=0; A<100; A++){
            System.out.println("\nPreço de compra: " );
            precocompra[A] = input.nextInt();
            System.out.println("\nPreço de venda: ");
            precovenda[A] = input.nextInt();
        }

        for(A=0; A<100; A++){
            lucro = precovenda[A] - precocompra[A];
            if(lucro<10.0){
                totlucromenor10++;
            } else{
                if(lucro<=20.0){
                    totlucromenor20++;
                } else{
                    totlucromaior20++;
                }
            }

            System.out.println("\ntotal de mercadorias com lucro < 10%: " + totlucromenor10);
            System.out.println("\ntotal de mercadorias com 10% <= lucro <= 20%: " + totlucromenor20);
            System.out.println("\ntotal de mercadorias com lucro > 20%: " + totlucromaior20);
            System.out.println("\n");

            input.close();
        }
    }
}
