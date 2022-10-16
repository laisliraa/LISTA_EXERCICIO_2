import java.util.Scanner;

public class SomaImpares {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //a variável foi criada já dentro do comando de repetição for
        
        for (int i = 100; i <= 200; i ++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
