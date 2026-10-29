import java.util.Scanner;

public class Longitud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();
        System.out.println("Introduce una longitud: ");
        String longitud = sc.nextLine();

        String[] palabras = frase.split("\\s+");
        int contador = 0;

        for (int i = 0; i < palabras.length; i++) {
            if (palabras.length > contador) {}
        }

    }
}
