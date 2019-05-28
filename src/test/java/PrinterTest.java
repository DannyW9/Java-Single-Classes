import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(30, 60);
    }

    @Test
    public void hasPaper(){
        assertEquals(30, printer.getPaperQuantity());
    }

    @Test
    public void hasToner(){
        assertEquals(60, printer.getTonerVolume());
    }

    @Test
    public void canPrint(){
        assertEquals(10, printer.print(2, 10));
    }

    @Test
    public void cannotPrint__notEnoughPaper(){
        assertEquals(30, printer.print(5, 10));
    }

    @Test
    public void canReduceToner(){
        printer.print(2, 5);
        assertEquals(50, printer.getTonerVolume());
    }

}
