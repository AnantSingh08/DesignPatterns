package creational;

public class DBConnection {
    private static DBConnection connection;

    private DBConnection(String name) {
        System.out.println("Connection to DB is established by "+ name);
    }

    static synchronized DBConnection getDBConnection(String name) {
        if(connection == null) {
            connection = new DBConnection(name);
        }
        return connection;
    }
}
