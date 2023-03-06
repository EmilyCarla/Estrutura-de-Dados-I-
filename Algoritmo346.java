import java.util.Scanner;
//certa
public class Algoritmo346 {
    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);
         
        String frase;
        int op, x, tam;

        do{

            System.out.println("\nMENU");
        System.out.println("\n1 - Imprime o comprimento da frase ");
        System.out.println("\n2 - Imprime os dois primeiros e os dois ultimos caracteres da frase ");
        System.out.println("\n3 - Imprime a frase espelhada ");
        System.out.println("\n4 - Termina o algoritmo ");
        System.out.println("\nOPÇÃO");

        op = input.nextInt();

        if (op==1){
            System.out.println("\nDigite uma frase: " );
            input.nextLine();
            frase = input.nextLine();
            System.out.println("\nNumero de caracteres da frase: " + frase.length());
        } else{
            if(op==2){
                System.out.println("\nDigite uma frase: " );
                input.nextLine();
                frase = input.nextLine();
                System.out.println("\nos dois primeiros caracteres: " + frase.substring(0,2));
                tam = frase.length() -2;
                System.out.println("\nos dois ultimos caracteres: " + frase.substring(tam));
            
            } else{
                if(op==3){
                    System.out.println("\nDigite uma frase: ");
                    input.nextLine();
                    frase = input.nextLine();
                    for(x = frase.length()-1; x>=0; x--){
                        System.out.print(frase.charAt(x));
                        
                       
                    }
                } else{
                    if(op==4){
                        System.out.println("\nFim do algoritmo");
                    } else{
                        System.out.println("\nopção não disponivel");
                    }
                }
            
            System.out.println("\n\n");

        }
    }
} while(op!=4);
    System.out.println("\n\n");
}
    }

