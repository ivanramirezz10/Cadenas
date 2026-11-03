import java.util.Scanner;

public class Digitos {
    public static int cuantosSonDigitos; {
        String frase = "1 20 hola 234 45a";
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (Character.isDigit(frase.charAt(i))) {
                contador++;
            }
        }
        System.out.println(contador);
    }

}
