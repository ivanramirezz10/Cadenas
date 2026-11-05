import java.util.Scanner;

public class Parentesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String texto = sc.nextLine();
        if (esParentizada(texto)){
            System.out.println("Está bien");
        }else {
            System.out.println("Está mal");
        }
    }
    public static boolean esParentizada(String cadena){
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if(caracter == '('){
                contador++;
            }else if(caracter == ')'){
                contador--;
                if(contador < 0){
                    return false;
                }
            }
        }
        return contador == 0;
    }
}
