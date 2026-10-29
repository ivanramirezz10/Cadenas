import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = sc.nextLine();
        String frasesSinEspacios;
        frasesSinEspacios = frase.replace(" ","".toLowerCase());


        String invertida = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
             invertida = invertida + frase.charAt(i);
        }
        System.out.println("Invertida: " + invertida);

        if (frase.replace(" ", "").equalsIgnoreCase(invertida.replace(" ", ""))) {
            System.out.println("¿Es palíndromo? Sí");
        } else {
            System.out.println("¿Es palíndromo? No");
        }
    }
}
