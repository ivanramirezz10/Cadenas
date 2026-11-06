import java.util.Scanner;

public class Alfabetica {

    public static boolean esAlfabetica(String palabra) {
        palabra = palabra.toLowerCase();

        for (int i = 0; i < palabra.length() - 1; i++) {
            if (palabra.charAt(i) > palabra.charAt(i + 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();

        if (esAlfabetica(palabra)) {
            System.out.println("Sí");
        } else {
            System.out.println("No");
        }

    }
}
