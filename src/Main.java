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
        int newAge = 24;
        if (newAge>=7 &&  newAge<18){
            System.out.println("Ребенок ходит в школу");
        } else if (newAge>=18 && newAge<24){
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }else if (newAge >=24){
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        System.out.println("Задание 3");
        int capacityCarriage = 102;
        int sittingPlace = 60;
        int standingPlace = capacityCarriage -sittingPlace;
        int sittingUsed = 60;
        int otherPlace=60;

        if (sittingUsed<sittingPlace){
            System.out.println("Есть еще " + (sittingPlace - sittingUsed) + " сидячих мест");

//            if (sittingUsed ==sittingPlace){
//                System.out.println("Сидячих мест нет");
           } else {
            System.out.println("сидячих мест нет");
        }
            if (otherPlace<sittingPlace){
                System.out.println("Есть еще " + (standingPlace - otherPlace + " стоячих мест"));
            }
            else {
                System.out.println("Стоячих мест нет");
            }
//            if (otherPlace==standingPlace){
//                System.out.println("Стоячих мест нет");
//            }

        }
    }

