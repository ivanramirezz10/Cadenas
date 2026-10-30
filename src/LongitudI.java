import java.util.Scanner;

public class LongitudI {
    public static int comprueba(String frase, int k) {

        int contador = 0;
        String[] palabras = frase.split("\\s+");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == k) {
                contador++;
            }
        }
        return contador;
    }

    public class LongitudIt {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String frase;
            int k;
            System.out.println("Introduce una frase:");
            frase = sc.nextLine();
            System.out.println("Introduce una longitud:");
            k = sc.nextInt();
            System.out.println("Hay " + comprueba(frase, k) + " palabras con una longitud de " + k + " caracteres");
        }

    }}

