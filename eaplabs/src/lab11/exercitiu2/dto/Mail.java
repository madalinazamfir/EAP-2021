package lab11.exercitiu2.dto;

import static lab11.exercitiu2.utils.Constants.DEFAULT_MAIL_CONTENT;

public class Mail {

    private String from;
    private String to;
    private boolean isRead = false;
    private String title;
    private String content;

    public Mail() {
        this.content = DEFAULT_MAIL_CONTENT;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
