import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.NubberOfSquares.services.SQRService;

public class SQRServiceTest {

    @Test
    public void shouldCalcExactOne() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSqrt(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcExactTwo() {
        SQRService service = new SQRService();

        int expected = 5;
        int actual = service.calcSqrt(100, 200);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcExactThree() {
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.calcSqrt(0, 100);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcExactFour() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqrt(0, 99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcExactFive() {
        SQRService service = new SQRService();

        int expected = 90;
        int actual = service.calcSqrt(100, 9801);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcExactSix() {
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.calcSqrt(9801, 10_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcExactSeven() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqrt(9802, 10_000);

        Assertions.assertEquals(expected, actual);
    }
}
