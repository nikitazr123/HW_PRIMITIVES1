public class Main {
    public static void main(String[] args) {
        int price = 25600; //Стоимость билета
        int bonusPrice = 20; //Стоимость одного бонуса

        int flightBonus;

        System.out.println("Вам начислено бонусов: "+ (price / bonusPrice));
    }
}