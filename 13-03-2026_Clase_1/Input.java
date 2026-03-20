import java.util.Scanner;

public class Input {
    public static int inputInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int inputIntTexto(String texto) {
        System.out.println(texto);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String inputStr() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String inputStrTexto(String texto) {
        System.out.println(texto);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}