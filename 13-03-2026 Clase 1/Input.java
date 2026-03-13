import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
    }

    public static int inputInt() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }

    public static int inputIntTexto(String texto) {
        System.out.println(texto);
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }

    public static String inputStr() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    public static String inputStrTexto(String texto) {
        System.out.println(texto);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }
}
