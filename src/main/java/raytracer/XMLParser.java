package raytracer;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.*;


/**
 * .xml file parser
 */
public class XMLParser{
    private static String filePath;
    public XMLParser(String filePath){
        XMLParser.filePath = filePath;
    }

    public void enter(StartElement openTag){
        System.out.print(openTag);
    }

    void exit(EndElement closeTag){
        System.out.print(closeTag);
    }


    /**
     * @see "https://www.geeksforgeeks.org/stax-xml-parser-java/"
     */
    public void parse() throws XMLStreamException, FileNotFoundException {

        File file = new File(filePath); // input file

        // XMLInputFactory for identifying XML tags
        //
        XMLInputFactory factory = XMLInputFactory.newInstance();

        // initializing handler to access the XML tags
        //
        XMLEventReader eventReader = factory.createXMLEventReader(new FileReader(file));

        // iterating through all tags
        //
        while (eventReader.hasNext()) {
            XMLEvent event = eventReader.nextEvent();

            if (event.isStartElement()){ // for the opening tag ...
                StartElement element = (StartElement)event;
                enter(element);
            }

            if (event.isEndElement()){ // for the closing tag ...
                EndElement element = (EndElement) event;
                exit(element);
            }
        }
    }
}

