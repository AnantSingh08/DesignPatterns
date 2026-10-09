package builder;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class EmailBuilder {
    private String to;
    private String subject;
    private String body;
    private String cc;
    private String bcc;
    private List<String> attachments = new ArrayList<>();

    public EmailBuilder setTo(String to) {
        this.to = to;
        return this;
    }

    public EmailBuilder setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public EmailBuilder setBody(String body) {
        this.body = body;
        return this;
    }
    public EmailBuilder setCc(String cc) {
        this.cc = cc;
        return this;
    }
    public EmailBuilder setBcc(String bcc) {
        this.bcc = bcc;
        return this;
    }
    public EmailBuilder setAttachments(String attachments) {
        this.attachments.add(attachments);
        return this;
    }

    public Email build() {
        return new Email(this);
    }
}
