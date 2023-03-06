import java.util.Scanner;
//arrumar
public class Algoritmo360 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int ultdia[] = new int[12];
        int data, i, dia, mes;
        String[] signo = new String[12];

        for(i=0; i<12; i++){
            System.out.println("\nDigite signo: ");
            signo[i] = input.next();
            System.out.println("\ndigite ultimo dia: ");
            ultdia[i] = input.nextInt();
        }

        System.out.println("\ndigite data no formato ddmm ou 9999 para terminar: ");
        data = input.nextInt();

        while(data != 9999){
            dia = data/100;
            mes = data%100;
            mes--;

            if(dia>ultdia[mes]){
                mes = (mes+1) % 12;
            }
                System.out.println("\nsigno: " + signo[mes] + "\n");
                System.out.println("\ndigite data no formato ddmm ou 9999 para terminar: ");
                data = input.nextInt();
            
            System.out.println("\n");
        }
        
    } 
}
