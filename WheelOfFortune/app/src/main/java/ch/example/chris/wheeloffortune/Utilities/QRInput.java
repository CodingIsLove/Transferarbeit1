package ch.example.chris.wheeloffortune.Utilities;

public class QRInput {
    private String content;
    private String fileName;

    public QRInput(String content, String fileName) {
        this.content = content;
        this.fileName = fileName;
    }

    public String getContent() {
        return content;
    }

    public String getFileName() {
        return fileName;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
