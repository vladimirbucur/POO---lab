package task1;

import task1.document.BoldTextSegment;
import task1.document.ItalicTextSegment;
import task1.document.PlainTextSegment;
import task1.document.UrlSegment;

public interface DocumentVisitor {
    public void visit(final ItalicTextSegment text);
    public void visit(final BoldTextSegment text);
    public void visit(final UrlSegment text);
    public void visit(final PlainTextSegment text);
    public StringBuilder getDocument();
}
