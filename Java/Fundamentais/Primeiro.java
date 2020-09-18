import java.util.Scanner;
//Troca dos valores de duas variáveis
public class Primeiro {
    Scanner prompt = new Scanner(System.in);
    public void troca(int a, int b){
        System.out.print("A: ");
        a = prompt.nextInt();
        System.out.print("B: ");
        b = prompt.nextInt();
        int aux = a;
        a = b;
        b = aux;
        System.out.print("A: " + a + "\nB: " + b);
    }
}
