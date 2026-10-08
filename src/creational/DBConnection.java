package creational;

public class DBConnection {
    private static volatile DBConnection connection;

    private DBConnection(String name) {
        System.out.println("Connection to DB is established by "+ name);
    }

    static DBConnection getDBConnection(String name) {
        if (connection == null) {
            synchronized (DBConnection.class) {
                if(connection == null) {
                    connection = new DBConnection(name);
                }
            }
        }

        return connection;
    }
}
