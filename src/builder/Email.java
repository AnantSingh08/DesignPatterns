package builder;

import lombok.Getter;

import java.util.List;

@Getter
public class Email {
    private String to;
    private String subject;
    private String body;
    private String cc;
    private String bcc;
    private List<String> attachments;

    public Email(String to, String subject, String body, String cc, String bcc, List<String> attachments) {
        this.to = to;
        this.subject = subject;
        this.body = body;
        this.cc = cc;
        this.bcc = bcc;
        this.attachments = attachments;
    }

    // Multiple Constructors approach, we can make 2^6 constructors. This will lead to constructor explosion
    public Email(String to, String subject, String body) {
        this.to = to;
        this.subject = subject;
        this.body = body;
    }
}
