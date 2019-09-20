package jbhembise.testauto.example7;

import java.util.List;

public class EmailDto {
    private String subject;
    private String content;
    private String from;
    private List<String> to;

    public EmailDto() {

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

    public List<String> getTo() {
        return this.to;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTo(List<String> collect) {
        this.to = to;
    }
}
