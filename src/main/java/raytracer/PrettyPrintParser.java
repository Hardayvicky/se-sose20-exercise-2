package raytracer;

import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;

public class PrettyPrintParser extends XMLParser {
    private int indentLevel = 0;

    public PrettyPrintParser(String filePath) {
        super(filePath);
    }


    @Override
    public void enter(StartElement element) { // indenting outwards → ...
        if (indentLevel != 0) {
            for (int count = 0; count < indentLevel; count++) {
                System.out.print(" ");
            }
        }
        System.out.println("\u2192  " + element.getName().toString());
        indentLevel  = indentLevel + 4;
    }


    @Override
    public void exit(EndElement element) { // indenting inwards ← ...
        if (indentLevel != 0) {
            indentLevel  = indentLevel - 4;
            for (int count = 0; count < indentLevel; count++) {
                System.out.print(" ");
            }
        }
        System.out.println("\u2190  " + element.getName().toString());
    }
}
