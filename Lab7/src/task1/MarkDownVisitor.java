package task1;

import task1.document.BoldTextSegment;
import task1.document.ItalicTextSegment;
import task1.document.PlainTextSegment;
import task1.document.UrlSegment;

public class MarkDownVisitor implements DocumentVisitor{
    private StringBuilder doc = new StringBuilder();

    @Override
    public void visit(final ItalicTextSegment text) {
        StringBuilder newText = new StringBuilder();
        newText.append("*" + text.getContent() + "*");
        this.doc.append(newText);
    }

    @Override
    public void visit(final BoldTextSegment text) {
        StringBuilder newText = new StringBuilder();
        newText.append("**" + text.getContent() + "**");
        this.doc.append(newText);
    }

    @Override
    public void visit(final UrlSegment text) {
        StringBuilder newText = new StringBuilder();
        newText.append("[" + text.getDescription() + "](" + text.getUrl() + ")");
        this.doc.append(newText);
    }

    @Override
    public void visit(final PlainTextSegment text) {
        StringBuilder newText = new StringBuilder();
        newText.append(text.getContent());
        this.doc.append(newText);
    }

    @Override
    public StringBuilder getDocument() {
        return this.doc;
    }
}
