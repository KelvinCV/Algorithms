import java.util.Scanner;
//Conversão de base
public class Oitavo {
    int n;
    int q;
    int nDigit = 0;
    int nova [] = new int[1024];
    int r;
    Scanner prompt = new Scanner(System.in);

    public void conversaoBase() {
    System.out.println("Informe um número inteiro decimal:");
    n = prompt.nextInt();
    q = n;
    do {
        r = q % 2;
        nova[nDigit] = r;
        nDigit++;
        q = q / 2;
    }
    while (q != 0);
        System.out.println("Número " + n + " na base binária: ");
        for (int i = nDigit - 1; i >= 0; i--) {
            System.out.print(nova[i]);
        }
    }
}
