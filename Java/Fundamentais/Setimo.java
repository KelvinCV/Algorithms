import java.util.Scanner;
//Inversão dos dígitos de um número inteiro
public class Setimo {
    int n;
    int invertido = 0;
    int digito;
    Scanner prompt = new Scanner(System.in);
public void inversaoDigitos() {
    System.out.println("Informe um número inteiro positivo:");
    n = prompt.nextInt();
    while (n > 0) {
        digito = n % 10;
        invertido = invertido * 10 + digito;
        n = (n / 10);
    }
    System.out.println("Número invertido: " + invertido);
    }
}
