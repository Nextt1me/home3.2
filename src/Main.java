public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate(80, 1.90); // расчетное значение индекса тела
        System.out.println(bmi);
    }
}