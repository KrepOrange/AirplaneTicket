import java.util.Scanner;

public class AirplaneTicket {
    public static void main(String[] args) {
        /*
         * variables
         * distance in km
         * cost per km as tl
         */
        double distance, costPerDist = 0.1, totalCost;
        int journeyType, age;
        Scanner input = new Scanner(System.in);

        /*
         * getting infos from user
         */
        System.out.print("Yolculuk mesafenizi km cinsinden giriniz: ");
        distance = input.nextDouble();
        totalCost = distance * costPerDist;

        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();

        System.out.print("Yolculuk tipinizi tek yön için 1, gidiş-dönüş için 2 girerek belirtiniz: ");
        journeyType = input.nextInt();

        /*
         * checking infos
         */
        if (distance > 0 && age > 0 && (journeyType == 1 || journeyType == 2)) {
            if (age < 12)
                // %50 discount
                totalCost *= 0.5;
            else if (age < 24)
                // %10 discount
                totalCost *= 0.9;
            else if (age > 65)
                // %30 discount
                totalCost *= 0.7;

            if (journeyType == 2)
                // %20 discount and two times cause of gidiş-dönüş
                totalCost = (totalCost * 0.8) * 2;

            System.out.println("Toplam bilet fiyatınız " + totalCost + " tl'dir.");
        } else
            System.out.println("Hatalı veri girdiniz!");
    }
}
