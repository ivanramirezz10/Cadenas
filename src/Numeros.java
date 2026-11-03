import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        String texto = "1 20 hola 234 45a";
        int contador = 0;

        String[] palabras = texto.split("\\s+");
        for (int i = 0; i < palabras.length; i++) {
            if(contarNumeros(palabras[i])){
                contador++;

            }
        }
    }
    public static boolean contarNumeros(String s) {
        boolean resultado = true;
        if (s == null || s.isEmpty()) {
            resultado = false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c < '0' || c > '9') {
                    resultado = false;
                }
            }
        }
        return resultado;
    }
}
