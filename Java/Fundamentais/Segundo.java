import java.util.Scanner;
//Contagem
public class Segundo {
    int n, nota, cont = 0, i = 0;
    Scanner prompt = new Scanner(System.in);

    public void contagem(){
        System.out.println("Número de notas");
        n = prompt.nextInt();
        while (i < n) {
            i = i+1;
            System.out.println("Nota do aluno:");
            nota = prompt.nextInt();
            if (nota >= 50) {
                cont = cont+1;
            }
        }
        System.out.println("Número de aprovações: " + cont);
    }
}
