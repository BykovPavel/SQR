import ru.netology.sqr.SQR.services.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println(service.numberOfSquares(200, 300));
    }
}
