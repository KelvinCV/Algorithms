import java.util.Scanner;
//Cálculo de uma série infinita
public class Quinto {
    int n;
    float x;
    float termo;
    float s;
    int i;
    float x2;
    Scanner prompt = new Scanner(System.in);

    public void serieInfinita(){
        System.out.println("Número de termos:");
        n = prompt.nextInt();
        System.out.println("Valor de x: ");
        x = prompt.nextFloat();
        termo = x;
        s = x;
        i = 1;
        x2 = x * x;

        for (int j = 1; j < n; j++ ){
            i = i + 2;// ou i +=
            termo = - termo * x2 / (i * (i - 1));
            s = s + termo;// ou s +=
        }
        System.out.println("S = " + s );
    }
}
