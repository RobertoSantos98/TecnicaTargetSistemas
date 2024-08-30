import java.util.Scanner;

public class ContarLetraA {
    public static int contarLetraA(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String texto = scanner.nextLine();
        
        int quantidade = contarLetraA(texto);
        System.out.println("A letra 'a' aparece " + quantidade + " vezes na string.");
    }
}
