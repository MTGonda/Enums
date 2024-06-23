import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DayOfTheWeek dayOfTheWeek = DayOfTheWeek.TUE;
        System.out.println(dayOfTheWeek);
        for (int i=0;i<10;i++) {
            dayOfTheWeek = getRandomDay();
//            System.out.printf("Name is %s, Ordinal Value = %d%n", dayOfTheWeek.name(), dayOfTheWeek.ordinal());
//
//            if(dayOfTheWeek == DayOfTheWeek.FRI){
//                System.out.println("Its Friday Again");
//            }
            switchDayOfWeek(dayOfTheWeek);
        }
            for (Topping topping: Topping.values()){
                System.out.println(topping.name() + " : " + topping.getPrice());
            }
        }

    public static DayOfTheWeek getRandomDay (){
        int randomInt = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInt];
    }
    public static void switchDayOfWeek(DayOfTheWeek weekDay){
        int weekDayInteger = weekDay.ordinal() +1;

        switch (weekDay){
            case WED -> System.out.println("Wednesday is Day " + weekDayInteger);
            case SAT -> System.out.println("Saturday is Day " + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0)+weekDay.name().substring(1).toLowerCase()
            + "day is Day " + weekDayInteger);
        }
    }
}