package jbhembise.testauto.example7;

public class Email {
    private String subject;
    private String content;
    private String from;
    private String[] to;

    public Email(String subject, String content, String from, String[] to) {
        this.subject = subject;
        this.content = content;
        this.from = from;
        this.to = to;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getContent() {
        return this.content;
    }

    public String getFrom() {
        return this.from;
    }

    public String[] getTo() {
        return this.to;
    }
}
