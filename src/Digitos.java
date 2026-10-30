import java.util.Scanner;

public class Digitos {
    public static int cuantosSonDigitos(String cadena){
        int contador = 0;
        for(int i = 0; i < cadena.length(); i++){
            char c = cadena.charAt(i);
            if (Character.isDigit(c)){
                contador++;
            }

        }
        return contador;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena de dígitos");
        String cadena = sc.nextLine();
        int cuantosSonDigitos = cuantosSonDigitos(cadena);
        System.out.println(cadena + " : " + cuantosSonDigitos + " dígitos");
    }
}
