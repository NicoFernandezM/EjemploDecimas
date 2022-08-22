import java.util.Scanner;

public class resultadocorrecto {
    public static void main(String [] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Por favor ingrese una palabra o frase.");
        String iU = d.nextLine();
        int a = iU.toCharArray().length;
        iU = iU.replaceAll(" ", "");
        iU = iU.toUpperCase();
        char [] b = iU.toCharArray();
        char [] c = new char[b.length];

        for (int i = b.length - 1, j = 0; i >= 0; i--, j++) {
            c[j] = b[i];
        }

        System.out.println("El input ingresado contiene " + a + " caracteres.\n" +
                "Resultado: ");

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
    }
}
