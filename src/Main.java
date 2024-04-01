public class Main {
    public static void main(String[] args) {
        //Задача 1
        byte by = 127;
        short sh = 32000;
        int in = 157000;
        long lo = 12_345_654_321L;
        float fl = 0.1234567F;
        double  dob= 1.123456789;
        System.out.println("Значение переменной by с типом byte равно " + by + "\n" +
                "Значение переменной sh с типом short равно " + sh + "\n" +
                "Значение переменной in с типом int равно " +in + "\n" +
                "Значение переменной lo с типом long равно " + lo + "\n" +
                "Значение переменной fl с типом float равно " + fl + "\n" +
                "Значение переменной dob с типом double равно " + dob + "\n");
        //Задача 2
        float a = 27.12F;                   //В задании указано "перечислить все типы переменных"
        long b = 987_678_965_549L;          //Но также указано о "корректном" присвоении значений типам переменных
        double c = 2.786;                   //Если говорить о корректности с точки зрения расхода памяти,
        short d = 569;                      //Не было бы правильней использовать не все типы, а лишь подходящие?
        int e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f + "\n" + g + "\n");
        //Задача 3
        byte ludmilaPavlovna = 23, annaSergeevna = 27, ekaterinaAndreevna = 30;
        short allPaper = 480;
        byte student = (byte) (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        short paperByStudent = (short) (allPaper / student);
        System.out.println("На каждого ученика расчитано " + paperByStudent + " листов бумаги" + "\n");
        //Задача 4
        byte perfBase = 16 / 2;
        short perfBy20 = (short) (perfBase * 20);
        int perfBy1day = perfBase * (60*24);            //Можно использовать тип short
        int perfBy3days = perfBy1day * 3;
        int perfByMonth = perfBy3days * 10;
        System.out.println("За 20 минут машина произвела " + perfBy20 + " штук бутылок" + "\n" +
                "За сутки машина произвела " + perfBy1day + " штук бутылок" + "\n" +
                "За 3 дня машина произвела " + perfBy3days + " штук бутылок" + "\n" +
                "За месяц машина произвела " + perfByMonth + " штук бутылок" + "\n");
        //Задача 5
        byte allCans = 120;
        byte expenses = 2 + 4;
        byte clasS = (byte) (allCans / expenses);
        byte whiteCans = (byte) (clasS * 2);
        byte brownCans = (byte) (clasS * 4);
        System.out.println("В школе, где " + clasS + " классов, нужно " + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски" + "\n");
        //Задача 6
        byte bananas = (byte) (5 * 80);
        short milk = (short) (2 * 105);
        short iceCream = (short) (2 * 100);
        short eggs = (short) (4 * 70);
        short weight = (short) (bananas + milk + iceCream + eggs);
        double weightKg = (double) weight / 1000;
        System.out.println("Масса в граммах равна " + weight + "\n" + "Масса в килограммах равна " + weightKg + "\n");
        //Задача 7
        short excWeight = 7 * 1000;
        short losWeight1 = 250;
        short losWeight2 = 500;
        System.out.println("При похудении на 250 грамм ежедневно потребуется " + (excWeight / losWeight1) + " дней" + "\n" +
                "При похудении на 500 грамм ежедневно потребуется " + (excWeight / losWeight2) + " дней" + "\n" +
                "В среднем потребуется " + excWeight / ((losWeight1 + losWeight2) / 2) + " дней" + "\n");
        //Задача 8
        int mashaMonth = 67760, denisMonth = 83690, crisrinaMonth = 76230;
        int mashaYear = mashaMonth * 12;
        int denisYear = denisMonth * 12;
        int cristinaYear = crisrinaMonth * 12;
        int mashaMonth2 = (int) ((double) mashaMonth * 1.1);
        int denisMonth2 = (int) ((double) denisMonth * 1.1);
        int crisrinaMonth2 = (int) ((double) crisrinaMonth * 1.1);
        System.out.println("Маша теперь получает " + mashaMonth2 + " рублей. Годовой доход вырос на " + ((mashaMonth2 * 12) - mashaYear) + " рублей" + "\n" +
                "Денис теперь получает " + denisMonth2 + " рублей. Годовой доход вырос на " + ((denisMonth2 * 12) - denisYear) + " рублей" + "\n" +
                "Кристина теперь получает " + crisrinaMonth2 + " рублей. Годовой доход вырос на " + ((crisrinaMonth2 * 12) - cristinaYear) + " рублей" + "\n");
    }
}