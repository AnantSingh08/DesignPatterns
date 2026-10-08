package creational;

public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            DBConnection.getDBConnection("Connection 1");
        });

        Thread t2 = new Thread(() -> {
            DBConnection.getDBConnection("Connection 2");
        });

        t1.start();
        t2.start();
    }
}