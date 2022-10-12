import java.util.Scanner;

public class CategoriaCNH {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
 
        //variáveis 
         int quantidade_rodas;
         float peso_veiculo;
         int quantidade_pessoas;
        //comandos de entrada para o usuário colocar informaçôes

         System.out.println("Informe a quantidade de rodas do veículo:");
         quantidade_rodas = input.nextInt();

         System.out.println("Informe o peso do veículo em kilos:");
         peso_veiculo = input.nextFloat();

         System.out.println("Informe a quantidade de pessoas que o veículo comporta:");
         System.out.println("1");
         System.out.println("2");
         System.out.println("3");
         System.out.println("4");
         System.out.println("5");
         System.out.println("6");
         System.out.println("7");
         System.out.println("8");
         quantidade_pessoas = input.nextInt();

        //comandos de saída para o usuário
         if (quantidade_rodas <= 3 && quantidade_pessoas <= 4 && peso_veiculo <= 3500){
             System.out.println("CNH Tipo A.");
         } else if (quantidade_rodas >= 4 && quantidade_pessoas <= 8 && peso_veiculo <= 3500){
             System.out.println("CNH do Tipo B.");
         } else if (quantidade_rodas >= 4 && peso_veiculo <= 6000){
             System.out.println("CNH Tipo C.");
         } else if (quantidade_rodas >= 4 && quantidade_pessoas >= 8){
             System.out.println("CNH Tipo D.");
         } else if (quantidade_rodas <= 4 && peso_veiculo > 6000){
            System.out.println("CNH Tipo E.");
         }










        

    }
}
