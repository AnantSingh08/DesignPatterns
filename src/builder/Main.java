package builder;

public class Main {
    public static void main(String[] args) {
        Email email = new Email(
                "a@gmail.com",
                "Learning stuff",
                "Hey man how you been",
                null,
                null,
                null
        );
        // Drawbacks
        // 1. But suppose we had 50 attributes and we needed only 3 we would have to pass null values
        // 2. If we don't want to via option 1 then we would need to make multiple constructors which again is tiresome
    }
}
