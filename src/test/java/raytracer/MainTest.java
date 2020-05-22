package raytracer;

import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import static junit.framework.TestCase.assertTrue;

public class MainTest {
    @Test
    public void inheritanceTest() throws Exception {
        // If PrettyPrint Parser is not of base type raytracer.XMLParser, the assertion will fail!
        final Object PrettyPrintParser = new XMLParser("./res/foo.xml");
        assertTrue(PrettyPrintParser instanceof XMLParser);
    }
}

