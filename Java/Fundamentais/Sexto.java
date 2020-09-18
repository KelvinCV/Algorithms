import java.util.Scanner;
//Geração da sequência de Fibonacci
public class Sexto {
    int n;
    int a = 0;
    int b = 1;
    int i = 2;
    Scanner prompt = new Scanner(System.in);
    public void fibonacci(){
        System.out.println("Número de termos");
        n = prompt.nextInt();
        while (i < n) {
            System.out.print(a + ", " + b + ", ");
            a = a + b;// ou a +=
            b = a + b;// ou b +=
            i = i + 2;// ou i +=
        }
        if (i == n)
            System.out.print(a + ", " + b);
        else
            System.out.print(a);
    }
}
