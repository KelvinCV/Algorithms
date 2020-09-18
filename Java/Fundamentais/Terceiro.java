import java.util.Scanner;
//Soma de um conjunto de números
public class Terceiro {
    int n, num, soma = 0, i = 0;
    Scanner prompt = new Scanner(System.in);
    public void soma(){
        System.out.println("Quantidade de números: ");
        n = prompt.nextInt();
        while (i < n) {
            i = i + 1;
            System.out.println("Número: ");
            num = prompt.nextInt();
            soma = soma + num; // ou soma+=num
        }
        System.out.println("Soma dos " + n + " números: " + soma);
    }
}
