public class Main {
    public static void main(String[] args) {
        Data data = new Data(9,8,2001);
        System.out.println(Data.dayToPrintShort(data));
        System.out.println(Data.dayToPrintLong(data));

        int days = Data.howManyDaysUntilEndYear(data);
        System.out.println(days);

        days = Data.howManyDaysUntilNextMonth(data);
        System.out.println(days);

        System.out.println(Data.dayOfWeek(data));
        System.out.println(Data.isBisexto(data));
    }
}