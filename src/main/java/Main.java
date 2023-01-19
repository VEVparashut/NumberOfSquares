import ru.netology.sqr.NubberOfSquares.services.SQRService;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println(service.calcSqrt(100, 9801));
    }
}
