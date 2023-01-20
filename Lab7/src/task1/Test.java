package task1;

import java.util.ArrayList;


public class Test {

    public static void main(final String[] args) {

        List<TextSegment> textSegments = getTextSegments();

        WikiGenerator generator = new WikiGenerator(textSegments);

        System.out.println("----------------------Dokuwiki----------------------");
        System.out.println(generator.getDokuWikiDocument());
        System.out.println("---------------------MardownWiki--------------------");
        System.out.println(generator.getMarkdownDocument());
    }
    public static List<TextSegment> getTextSegments() {
        List<TextSegment> textSegments = new ArrayList<>();

        textSegments.add(new PlainTextSegment("Mecanismul din spatele pattern-ului "));
        textSegments.add(new ItalicTextSegment("Visitor"));
        textSegments.add(new PlainTextSegment(" poartă numele de "));
        textSegments.add(new BoldTextSegment("double-dispatch"));
        textSegments.add(new PlainTextSegment(".\n"));
        textSegments.add(new UrlSegment("https://ocw.cs.pub.ro/courses/poo-ca-cd/laboratoare/tutorial-doubledispatch",
                "Tutorialul de double-dispatch"));
        textSegments.add(new PlainTextSegment(" oferă mai multe detalii legate de acest mecanism.\n"));
        textSegments.add(new PlainTextSegment("Pattern-ul "));
        textSegments.add(new BoldTextSegment("Visitor"));
        textSegments.add(new PlainTextSegment(" este util când se doreşte prelucrarea unei "));
        textSegments.add(new ItalicTextSegment("structuri complexe"));
        textSegments.add(new PlainTextSegment(", ce cuprinde mai multe "));
        textSegments.add(new ItalicTextSegment("obiecte de tipuri diferite"));
        textSegments.add(new PlainTextSegment(".\n"));

        return textSegments;
    }
}
