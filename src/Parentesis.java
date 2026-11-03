import java.util.Scanner;

public class Parentesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String texto = sc.nextLine();
        int contador = 0;
        boolean bienParentizda = true;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if(c == '(' || c == '{'){
                contador++;
            }else if(c == ')' || c == '}'){
                contador--;
            }
            if(contador < 0){
                bienParentizda = false;
                break;
            }
            if (contador != 0){
                bienParentizda = false;
            }
            if(bienParentizda){
                System.out.println("Está biem");
            }else {
                System.out.println("Está mal");
            }

        }
    }
}
