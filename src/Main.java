//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        byte pen = 5;
        System.out.println("Значение переменной pen с типом byte равно " + pen);
        short milk = 754;
        System.out.println("Значение переменной milk с типом short равно " + milk);
        int car = 44521;
        System.out.println("Значение переменной car с типом int равно " + car);
        long star = 9365654789L;
        System.out.println("Значение переменной star с типом long равно " + star);
        float candy = 3.5f;
        System.out.println("Значение переменной candy с типом float равно " + candy);
        double apple = 4.25655896;
        System.out.println("Значение переменной apple с типом double равно " + apple);
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short g = 27897;
        byte k = 67;
        byte oneClass = 23;
        byte twoClass = 27;
        byte threeClass = 30;
        short boughtSheets = 480;
        int studentsTogether = oneClass + twoClass + threeClass;
        int sheetsForEach = boughtSheets / studentsTogether;
        System.out.println("На каждого ученика расчитано " + sheetsForEach + " листов бумаги.");
        byte twoMinutes = 16;
        byte productivityInOneMinute = 16 / 2;
        System.out.println("За одну минуту" + " машина произвела " + productivityInOneMinute + " бутылок.");
        short inTwentyMinutes = 20 * 8;
        System.out.println("За 20 минут машина произвела " + inTwentyMinutes + " бутылок.");
        short bottlesInOneDay = 60 * 24 * 8;
        System.out.println("За сутки машина произвела " + bottlesInOneDay + " бутылок.");
        int bottlesInThreeDay = bottlesInOneDay * 3;
        System.out.println("За три дня машина произвела " + bottlesInThreeDay + " бутылок.");
        int bottlesInOneMonth = bottlesInOneDay * 30;
        System.out.println("За 1 месяц машина произвела " + bottlesInOneMonth + " бутылок.");
        byte classesAtSchool = 120 / (2 + 4);
        int whitePaint = classesAtSchool * 2;
        int brownPaint = classesAtSchool * 4;
        System.out.println("В школе, где " + classesAtSchool + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски.");
        byte banans = 5;
        short milk200Ml = 210;
        byte plombirIceCream = 2;
        byte rawEgg = 4;
        int weightOfBreakfastInGrams = (banans * 80) + milk200Ml + (plombirIceCream * 100) + (rawEgg * 70);
        System.out.println("Вес спортзавтрака состовляет " + weightOfBreakfastInGrams + " грамм.");
        float weightOfBreakfastInKilograms = weightOfBreakfastInGrams / 1000f;
        System.out.println("Вес спортзавтрака составляет " + weightOfBreakfastInKilograms + " килограмм.");
        byte lostWieght = 7;
        float lostWieghtInDayMin = 0.250f;
        float lostWeightInDayMax = 0.500f;
        float daysMin = lostWieght / lostWieghtInDayMin;
        System.out.println(daysMin + " дней уйдет на похудение спортсмена если он будет терять в день по 250 грамм.");
        float daysMax = lostWieght / lostWeightInDayMax;
        System.out.println(daysMax + " дней уйдет на похудение спортсмена если он будет терять в день по 500 грамм.");
        float daysAverage = (daysMin + daysMax) / 2;
        System.out.println(daysAverage + " дней на похудение уйдет в среднем.");
        int mashaMonthlySalary = 67760;
        float mashaDifferenceInAMonth = mashaMonthlySalary * 0.1f;
        float mashaNewSalary = mashaMonthlySalary + mashaDifferenceInAMonth;
        float mashaYearDifference = mashaDifferenceInAMonth * 12;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей." + " Годовой доход вырос на " + mashaYearDifference + " рублей.");
        int denisMonthlySalary = 83690;
        float denisDifferenceInAMonth = denisMonthlySalary * 0.1f;
        float denisNewSalary = denisMonthlySalary + denisDifferenceInAMonth;
        float denisYearDifference = denisDifferenceInAMonth * 12;
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей." + " Годовой доход вырос на " + denisYearDifference + " рублей.");
        int kristinaMonthlySalary = 76230;
        float kristinaDifferenceInAMonth = kristinaMonthlySalary * 0.1f;
        float kristinaNewSalary = kristinaMonthlySalary + kristinaDifferenceInAMonth;
        float kristinaYearDifference = kristinaDifferenceInAMonth * 12;
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей." + " Годовой доход вырос на " + kristinaYearDifference + " рублей.");


    }
}