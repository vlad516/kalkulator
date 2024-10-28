import java.util.Scanner;

public class Main {
    public class Main6 {
        public static void main(String[] args) {
            while (true) {
                System.out.println("Введите сообщение");
                String input = new Scanner(System.in).nextLine();

                switch (input) {
                    case "Привет" -> System.out.println("И вам привет");
                    case "ку" -> System.out.println("ку");
                    default -> System.out.println("ыыы");
                }
            }
        }
    }
}