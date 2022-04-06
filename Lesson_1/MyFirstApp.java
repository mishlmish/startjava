import java.nio.charset.Charset;
import java.util.Scanner;

public class MyFirstApp {
    public static void main(String[] args) {
        System.out.println("Бояре, вы зачем пришли?");
        System.out.println(Charset.defaultCharset().displayName());
        Scanner console = new Scanner(System.in,"cp866");
        System.out.println("Введите свое имя:");
        System.out.println(console.nextLine());
    }
}
