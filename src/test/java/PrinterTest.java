import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {printer = new Printer (100, 50); }

    @Test
    public void hasSheets() {
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void hasToner() {
        assertEquals(50, printer.getToner());
    }

    @Test
    public void canPrint() {
        printer.print(2, 10);
        assertEquals(80, printer.getSheets());
    }

    @Test
    public void cannotPrint() {
        printer.print(6, 10);
        assertEquals(100, printer.getSheets());
    }


}
