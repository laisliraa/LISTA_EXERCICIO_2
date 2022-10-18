import java.util.Scanner;

public class Escada {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        
        //variável
        int numero;

        //comando de entrada para o usuário inserir informações
        System.out.println("Digite um número");
        numero = input.nextInt();

        for (int i = 1; i <= numero; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        input.close();
    }
}
