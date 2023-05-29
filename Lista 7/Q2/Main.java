public class Main {
    public static void main(String[] args) {
        Time time = new Time(7,30);
        Time time2 = new Time(17,10);
        Time time3 = Time.diffTime(time, time2);
        Time time4 = Time.diffTime(time);
        
        time3.prnTime();
        time4.prnTime();

        Boolean teste = Time.isAm(time);
        Boolean teste2 = Time.isPm(time);
        Boolean teste3 = Time.isAm(time2);
        Boolean teste4 = Time.isPm(time2);

        System.out.println(teste);
        System.out.println(teste2);
        System.out.println(teste3);
        System.out.println(teste4);


    }
}