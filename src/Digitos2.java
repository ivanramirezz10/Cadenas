import java.util.Scanner;

public class Digitos2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String cadena;
        System.out.println("Introduce una cadena: ");
        cadena = sc.nextLine();
        System.out.println(contarNumeros(cadena));
    }
    public static int contarNumeros(String cadena){
    int contador = 0;
    String palabra = "";

    cadena = cadena + " ";

        for (int i = 0; i < cadena.length(); i++) {
            if(!cadena.substring(i, i + 1).equals(" ")){
                palabra = palabra + cadena.substring(i, i + 1);
            }else {
                if (!palabra.equals("")){
                    if(palabra.matches("[0-9]+")){
                        contador++;
                    }
                    palabra = "";
                }
            }
        }
        return contador;
    }
}
