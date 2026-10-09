package builder;

public class Main {
    public static void main(String[] args) {

       EmailBuilder builder = new EmailBuilder();
       Email email = builder.setTo("anant@gmail.com")
               .setBody("Hey man how you doinnn")
               .setCc("n@gmail.com")
               .build();

        // Advantage of builder design patten
        // 1. creation of complex objects step by step
        // 2. immutable

        StringBuilder sb = new StringBuilder("abc");
        String s = sb.append("ccc").toString(); // Creates immutable string object
    }
}
