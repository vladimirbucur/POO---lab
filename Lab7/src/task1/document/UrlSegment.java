package lab7.task1.document;

import lab7.task1.DocumentVisitor;

public class UrlSegment extends TextSegment {

    private String url;
    private String description;

    public UrlSegment(String url, String description) {
        super(null);
        this.url = url;
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public void accept(DocumentVisitor v) {
        v.visit(this);
    }
}

