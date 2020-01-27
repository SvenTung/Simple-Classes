import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void hasStartingPaper(){
        assertEquals(9, printer.getPaper());
    }

    @Test
    public void hasStartingToner(){
        assertEquals(10, printer.getToner());
    }

    @Test
    public void canAddPaper(){
        printer.addPaper(5);
        assertEquals(14, printer.getPaper());
    }

    @Test
    public void canAddToner(){
        printer.addToner(7);
        assertEquals(17, printer.getToner());
    }

    @Test
    public void canPrint(){
        String expected = "Printing complete.";
        assertEquals(expected, printer.print(2, 4));
        assertEquals(1, printer.getPaper());
        assertEquals(2, printer.getToner());
    }

    @Test
    public void notEnoughPaper(){
        String expected = "There is not enough paper.";
        assertEquals(expected, printer.print(5, 2));
    }

    @Test
    public void notEnoughToner(){
        printer.addPaper(7);
        String expected = "There is not enough toner.";
        assertEquals(expected, printer.print(4, 4));
    }

    @Test
    public void notEnoughPaperAndToner(){
        printer.addPaper(1);
        String expected = "There is not enough paper and toner.";
        assertEquals(expected, printer.print(3, 5));
    }

}
