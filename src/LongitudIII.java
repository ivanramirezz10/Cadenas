import java.util.Scanner;

public class LongitudIII {
    public static boolean comprueba(String frase,int k){
        String[] palabras = frase.split("\\s+");

        for (String palabra : palabras) {
            if (palabra.length() >= k) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();
        System.out.println("Y una longitud:");
        int k = sc.nextInt();
        boolean result = comprueba(frase, k);
        if (result) {
            System.out.println("Todas las cadenas son cortas");
        }else  {
            System.out.println("Hay alguna palabra larga");
        }
    }
}
