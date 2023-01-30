package Thread;


public class main {
    public static void main(String[] args) {
        Casino casino = Casino.getInstance();
        casino.start();
    }
}