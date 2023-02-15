package JUnitTests;
import model.Polynomial;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class JUnitTestsClass {

    @Test
    void AdditionTest() {
        Polynomial result = new Polynomial();
        assertEquals("X^3+6X^2+5X+3", result.addition("X^2+5X-1", "X^3+5X^2+4"), "The result is X^3+6X^2+5X+3.");
        assertEquals("-X^2-2X+9", result.addition("-X^3-6X^2-2X+5", "X^3+5X^2+4"), "The result is -X^2-2X+9.");
        assertEquals("0", result.addition("X^2+5X-1", "-X^2-5X+1"), "The result of this addition is 0.");
    }
    @Test
    void SubtractionTest(){
        Polynomial result = new Polynomial();
        assertEquals("-X^3-4X^2+5X-5", result.subtraction("X^2+5X-1", "X^3+5X^2+4"), "The result is -X^3-4X^2+5X-5.");
        assertEquals("-2X^3-11X^2-2X+1", result.subtraction("-X^3-6X^2-2X+5", "X^3+5X^2+4"), "The result is -X^2-2X+9.");
        assertEquals("2X^2+10X-2", result.subtraction("X^2+5X-1", "-X^2-5X+1"), "The result is 2X^2+10X-2.");
    }
    @Test
    void MultiplyTest(){
        Polynomial result = new Polynomial();
        assertEquals("X^5+10X^4-X^2+24X^3+20X-4", result.multiply("X^2+5X-1", "X^3+5X^2+4"), "The result is X^5+10X^4-X^2+24X^3+20X-4.");
        assertEquals("-X^6-11X^5-9X^3-32X^4+X^2-8X+20", result.multiply("-X^3-6X^2-2X+5", "X^3+5X^2+4"), "The result is -X^6-11X^5-9X^3-32X^4+X^2-8X+20.");
        assertEquals("-X^4-10X^3-23X^2+10X-1", result.multiply("X^2+5X-1", "-X^2-5X+1"), "The result is -X^4-10X^3-23X^2+10X-1.");
    }
    @Test
    void DerivateTest(){
        Polynomial result = new Polynomial();
        assertEquals("2X+5", result.derivative("X^2+5X-1"), "The result is 2X+5.");
        assertEquals("-3X^2-12X-2", result.derivative("-X^3-6X^2-2X+5"), "The result is -3X^2-12X-2.");
        assertEquals("0", result.derivative("-4"), "The result is 0.");
    }
    @Test
    void IntegrateTest(){
        Polynomial result = new Polynomial();
        assertEquals("0.33333334X^3+2.5X^2-X + C", result.integrate("X^2+5X-1"), "The result is 0.33333334X^3+2.5X^2-X + C.");
        assertEquals("-0.25X^4-2X^3-X^2+5X + C", result.integrate("-X^3-6X^2-2X+5"), "The result is -0.25X^4-2X^3-X^2+5X + C.");
        assertEquals("-4X + C", result.integrate("-4"), "The result is -4X + C.");
    }

}
