import java.util.Scanner;

public class Pasatiempos {

    public static String quitarVocales(String frase) {
        String resultado = "";

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);

            if ("aeiouAEIOU".indexOf(letra) != -1) {
                resultado += ".";
            } else {
                resultado += letra;
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.println(quitarVocales(frase));

        sc.close();
    }
}

