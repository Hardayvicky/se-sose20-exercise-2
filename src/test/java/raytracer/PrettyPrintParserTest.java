package raytracer;

import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class PrettyPrintParserTest {
    /*
     * If expected methods do not exist,
     * an exception will be thrown to causing the test to fail!
     */

    @Test
    public void enterMemberTest() throws Exception {
        Method enter = raytracer.PrettyPrintParser.class.getDeclaredMethod("enter", StartElement.class);
    }

    @Test
    public void exitMemberTest() throws Exception {
        Method exit = PrettyPrintParser.class.getDeclaredMethod("exit", EndElement.class);
    }
}
