import java.util.Scanner;
//Conversão de caractere para número
public class Nono {
    String string;
    int n;
    int decimal;
    int base;
    int digito;
    Scanner prompt = new Scanner(System.in);

    public void conversaoCaractereNumero() {
        System.out.println("String numérica:");
        string = prompt.next();
        n = string.length();
        decimal = 0;
        base = Character.codePointAt("0", 0);
        for (int i = 0; i < n; i++) {
            digito = (int) string.charAt(i) - base;
            decimal = decimal * 10 + digito;
        }
        System.out.println("Formato decimal: " + decimal);
    }
}
