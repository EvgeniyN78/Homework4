public class Main {
    public static void main(String[] args) {
        // Задание 2.1
        System.out.println("Задание 2.1");
        int age = 19;
        if (age > 17) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Вы пока не достигли возраста совершеннолетия. Нужно немного подождать.");
        }
        System.out.println("");

        // Задание 2.2
        System.out.println("Задание 2.2");
        int age2 = 24;
        if (age2 > 6)
            if (age2 < 18)  {
            System.out.println("Ребёнок ходит в школу.");
        } else if (age2 < 24){
            System.out.println("Ребёнок закончил школу. Пора учиться в университете.");
        } else {
            System.out.println("Человек окончил университет, и ему пора искать первую работу.");
        }
        System.out.println("");

        // Задание 2.3
        System.out.println("Задание 2.3");
        int van = 25;
        if (van < 61) {
            System.out.println("В вагоне осталось " + (60 - van) + " мест для сидения и 42 мест для поездки стоя.");
        } else if (van > 60)
            if (van < 102) {
            System.out.println("Все сидячие места в вагоне заняты. Количество мест для поездки стоя: " + (102 - van) + ".");
        } else if (van > 101) {
            System.out.println("Вагон полностью забит.");
        }
        System.out.println("");

        // Задание 3.1
        System.out.println("Задание 3.1");
        int ageHuman = 19;
        System.out.print("Если возраст человека равен " + ageHuman + ", то ему нужно ходить ");
        if (ageHuman > 1 && ageHuman < 7) {
            System.out.println("в детский сад.");
        } else if (ageHuman > 6 && ageHuman < 19) {
            System.out.println("в школу.");
        } else if (ageHuman > 18 && ageHuman < 24) {
            System.out.println("в университет.");
        } else if (ageHuman > 23) {
            System.out.println("на работу.");
        }
        System.out.println("");

        // Задание 3.2
        System.out.println("Задание 3.2");
        int ageChild = 7;
        int adults = 0;
        boolean isAdults = adults > 0;
        if (ageChild < 5) {
            System.out.println("Ребёнок не достигший возраста 5 лет, не может кататься на атракционе.");
        } else if (ageChild > 4 && ageChild < 14 && isAdults) {
            System.out.println("Ребёнок в возрасте от 5 до 14 лет - может кататься на атракционе только в сопровождении взрослого.");
        } else if (ageChild > 4 && ageChild < 14) {
            System.out.println("Ребёнок в возрасте от 5 до 14 лет - НЕ МОЖЕТ КАТАТЬСЯ НА АТРАКЦИОНЕ БЕЗ СОПРОВОЖДЕНИЯ ВЗРОСЛОГО.");
        } else if (ageChild > 13) {
            System.out.println("Ребёнок старше 14 лет, может кататься на атракционе без сопровождения взрослого.");
        }
        System.out.println("");

        // Задание 3.3
        System.out.println("Задание 3.3");
        int one = 1;
        int two = 2;
        int free = 3;
        if (((one - two) > 0) && ((one - free) > 0)){
            System.out.println(one + " самое большее из этих трёх чисел.");
        } else if (((two - one) > 0) && ((two - free) > 0)){
            System.out.println(two + " самое большее из этих трёх чисел.");
        } else if (((free - two) > 0) && ((free - one) > 0)){
            System.out.println(free + " самое большее из этих трёх чисел.");
        }
        System.out.println("");

    }

}