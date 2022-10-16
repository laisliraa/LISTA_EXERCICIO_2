import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //variáveis 

        int n;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        //comandos de entrada para o usuário inserir informações junto com o comando de repitição for
        // a variável "i" já foi criada dentro do próprio for
        for (int i = 0; i < 12; i++){
            System.out.println("Digite o " +(i+1)+ " ° número:");
            n = input.nextInt();

            if (n > maior){
                maior = n; 
            } if (n < menor){
                menor = n;
            }
        }

        // fora do laço for vai ser printado a resposta sobre a maior e menor idade
        System.out.println("O mais velho é " +maior);
        System.out.println("O mais novo é " +menor);

        input.close();

    }
}
