import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //variáveis
        int numero;
        int resultado1;
        int resultado2;
        int resultado3;
        int resultado4;
        int resultado5;
        int resultado6;
        int resultado7;
        int resultado8;
        int resultado9;
        int resultado10;

        //calculando as variáveis

        System.out.println("Digite um número:");
        //leitura da variável numeros
        numero = input.nextInt();


        resultado1 = numero * 1;
        resultado2 = numero * 2;
        resultado3 = numero * 3;
        resultado4 = numero * 4;
        resultado5 = numero * 5;
        resultado6 = numero * 6;
        resultado7 = numero * 7;
        resultado8 = numero * 8;
        resultado9 = numero * 9;
        resultado10 = numero * 10;

        //comandos de saída para o usuário
        System.out.println("A tabuada do " +numero+ " é:");
        System.out.println(numero + "x1 = " + resultado1);
        System.out.println(numero + "x2 = " + resultado2);
        System.out.println(numero + "x3 = " + resultado3);
        System.out.println(numero + "x4 = " + resultado4);
        System.out.println(numero + "x5 = " + resultado5);
        System.out.println(numero + "x6 = " + resultado6);
        System.out.println(numero + "x7 = " + resultado7);
        System.out.println(numero + "x8 = " + resultado8);
        System.out.println(numero + "x9 = " + resultado9);
        System.out.println(numero + "x10 = " + resultado10);
        
        input.close();
    }
}
