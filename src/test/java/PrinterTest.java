import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(50, 80);
    }

    @Test
    public void hasPaper(){
        assertEquals(50, printer.getSheetsOfPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(80, printer.getTonerVolume());
    }


}