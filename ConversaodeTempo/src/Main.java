import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var time = scanner.nextInt();
        var hour = time / 3600;
        var minute = time % 3600 / 60;
        var second = time % 60;

        System.out.println(
                hour + ":" + minute + ":" + second
        );
    }
}