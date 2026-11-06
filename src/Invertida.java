import java.util.Scanner;

public class Invertida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        System.out.println(invertir(frase));
    }
    public static String invertir(String cadena){
        String[] palabras = cadena.split(" ");
        String resultado = "";
        for (int i = palabras.length - 1; i >= 0; i--) {
            resultado += palabras[i];
            if (i > 0){
                resultado += " ";
            }

        }
        return resultado.trim();

    }
}
