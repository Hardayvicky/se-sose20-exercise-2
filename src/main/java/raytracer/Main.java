package raytracer;

public class Main {
    public static void main(String [] args) throws Exception {
        String file = "./resources/foo.xml"; // path to foo.xml

        XMLParser prettyPrintParser = new PrettyPrintParser(file);
        prettyPrintParser.parse(); // printing pretty foo.xml to std out
    }
}
