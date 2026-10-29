import java.util.Scanner;

public class NombreUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre completo:");
        String nombre = sc.nextLine();
        nombre = nombre.trim().replaceAll("\\s+", " ").toLowerCase();
        String[] palabras = nombre.split(" ");

        if(palabras.length == 3){
            String nombreFormateado = "";
            String iniciales = "";
            String usuario = "";

            for(int i = 0; i < palabras.length; i++){
                nombreFormateado = nombreFormateado + palabras[i].substring(0, 1).toUpperCase() + palabras[i].substring(1) + " ";
                iniciales = iniciales + palabras[i].substring(0, 1) + " ";
            }
            usuario = palabras[0].substring(0, 1) + palabras[1] + palabras[2].substring(0, 1);
            System.out.println("Nombre formateado: " + nombreFormateado.trim());
            System.out.println("Iniciales: " + iniciales);
            System.out.println("Usuario: " + usuario);
        }else {
            System.out.println("ERROR");
        }
    }
}
