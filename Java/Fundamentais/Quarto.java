import java.util.Scanner;
//Cálculo fatorial
public class Quarto {
    double n, prod = 1, i = 0;
    Scanner prompt = new Scanner(System.in);
    public void fatorial(){
        System.out.println("Valor de n:");
        n = prompt.nextInt();
        while (i < n) {
            i = i + 1;// ou i++
            prod = prod * i; // ou prod *=
    }
        System.out.println("Fatorial de " + n + " = " + prod);

    }
}
