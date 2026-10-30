import java.util.Scanner;

public class LongitudII {
    public static boolean comprueba(String frase, int k) {
        String[] palabras = frase.split("\\s+");
        for (String palabra : palabras) {
            if (palabra.length() == k) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();
        System.out.println("y una longitud ");
        int k = sc.nextInt();
        boolean encontrado = comprueba(frase, k);
        if (encontrado) {
            System.out.println("Hay alguna palabra con una longitud de " + k + " caracteres");

        }else {
            System.out.println("No hay ninguna palabra con una longitud de " + k + " caracteres");
        }
    }
}
