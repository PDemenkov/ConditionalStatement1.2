public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 18;
        if (age>=18) {
            System.out.println("Поздравляем с совершенолетием!");
        }else {
            System.out.println("Совершенолетие еще не наступило");
        }

        System.out.println("Задание 2");
        int newAge = 8;
        if (newAge >=24){
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        } else if (newAge>=18){
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        else if (newAge<7){
            System.out.println("Ребенок ходит в садик");
        }
        else {
            System.out.println("Ребенок ходит в школу");
        }

        System.out.println("Задание 3");
        int capacityCarriage = 102;
        int sittingPlace = 60;
        int standingPlace = capacityCarriage -sittingPlace;
        int sittingUsed = 60;
        int otherPlace=60;

        if (sittingUsed<sittingPlace){
            System.out.println("Есть еще " + (sittingPlace - sittingUsed) + " сидячих мест");
           } else {
            System.out.println("Cидячих мест нет");
        }
            if (otherPlace<sittingPlace){
                System.out.println("Есть еще " + (standingPlace - otherPlace + " стоячих мест"));
            }
            else {
                System.out.println("Стоячих мест нет");
            }
        }
    }

