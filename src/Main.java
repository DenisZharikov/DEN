import java.net.SocketOption;

public class Main {
    public static void main(String[] args) {
        int a = 7; //16-9=7
        int b = 9; //7
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a);
        System.out.println(b);

    }
}
