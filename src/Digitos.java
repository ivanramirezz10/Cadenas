import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        System.out.println("Introduce una cadena: ");
        cadena = sc.nextLine();

        System.out.println(cuantosSonDigitos(cadena) + " dígitos ");
    }
    public static int cuantosSonDigitos(String cadena) {
      int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.substring(i, i +1).matches("[0-9]+")) {
                contador++;
            }
        }
        return contador;
    }
}
