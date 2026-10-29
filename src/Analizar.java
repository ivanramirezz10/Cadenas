import java.util.Scanner;

public class Analizar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra = sc.nextLine();

        System.out.println("Longitud " + palabra.length());
        System.out.println("Primera letra: " +  palabra.charAt(0));
        System.out.println("Última letra: " +  palabra.charAt(palabra.length()-1));
        System.out.println("Mayúsculas " + palabra.toUpperCase());
        System.out.println("Minúsculas " + palabra.toLowerCase());

        int contador = 0;
        for (int i = 0; i <= palabra.length()-1; i++) {
            if (palabra.charAt(i) == 'a'){
                contador++;
            }
        }
        System.out.println("Número de 'a': " + contador);
    }
}
