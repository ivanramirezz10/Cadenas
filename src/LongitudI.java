public class LongitudI {
    public static void main(String[] args) {
        String frase = "Hola cómo estás hoy";
        int k = 10;
        System.out.println(comprueba(frase,k));
    }
    public static int comprueba(String frase, int k) {
        String[] palabras = frase.split("\\s+");
        int cuantas= 0;
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == k) {
                cuantas++;
            }
        }
        return cuantas;
    }
}
