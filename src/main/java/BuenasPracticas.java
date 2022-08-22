import java.util.Scanner;

public class BuenasPracticas {
    public static void main(String [] args) {
        llamarMetodos();
    }

    private static void llamarMetodos() {
        String inputUsuario = pedirInputUsuario();
        inputUsuario = quitarEspaciosEnBlanco(inputUsuario);
        int numeroDeCaracteres = contarCaracteres(inputUsuario);
        inputUsuario = pasarTextoAMayuscula(inputUsuario);
        imprimirResultados(numeroDeCaracteres, invertirTexto(inputUsuario));
    }

    public static String pedirInputUsuario() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese una palabra o frase.");
        return leer.nextLine();
    }

    public static String quitarEspaciosEnBlanco(String texto) {
        return texto.replaceAll("", " ");
    }

    public static int contarCaracteres(String texto) {
        return convertirTextoAArreglo(texto).length;
    }

    public static String pasarTextoAMayuscula(String texto) {
        return texto.toUpperCase();
    }

    public static char[] invertirTexto(String texto) {
        char [] arregloTexto = convertirTextoAArreglo(texto);
        char [] textoInvertido = new char[arregloTexto.length];

        for (int i = arregloTexto.length - 1, j = 0; i >= 0; i--, j++) {
            textoInvertido[j] = arregloTexto[i];
        }

        return textoInvertido;
    }

    public static char [] convertirTextoAArreglo(String texto) {
        return texto.toCharArray();
    }

    public static void imprimirTexto(char [] arreglo) {
        for (char c : arreglo) {
            System.out.print(c);
        }
    }

    public static void imprimirResultados(int numeroDeCaracteres, char [] texto) {
        System.out.println("El input ingresado contiene " + numeroDeCaracteres + " caracteres.\n" +
                "Resultado: ");

        imprimirTexto(texto);
    }
}
