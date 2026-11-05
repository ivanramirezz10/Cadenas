import java.util.Scanner;

public class Siglas {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String frase;
        System.out.println("Introduce una frase: ");
        frase = sc.nextLine();
        System.out.println("Las siglas son: " + siglas(frase));
    }
    public static String siglas(String frase){
        String siglas = "";
        String palabra = "";

        frase = frase + " ";

        for (int i = 0; i < frase.length(); i++) {
            if (!frase.substring(i, i + 1).equals(" ")){
                palabra = palabra + frase.substring(i, i + 1);
            }else {
                if(!palabra.equals("")){
                    if (palabra.substring(0, 1).equals(palabra.substring(0, 1).toUpperCase())){
                        siglas = siglas + palabra.substring(0, 1);
                    }
                    palabra = "";
                }

            }
        }
        return siglas;
    }
}
