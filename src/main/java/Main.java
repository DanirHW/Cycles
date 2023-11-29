import ru.netology.services.VacationService;

public class Main {
    public static void main(String[] args) {

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        VacationService service = new VacationService();
        System.out.println(service.calculate(100_000, 60_000, 150_000));

    }
}