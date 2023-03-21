/**
 * @author fazliberkordek 21 mart 2023 - 15:20 utc +3
 */

import java.util.Scanner;

/*todo:
    -Taksimetre Programı
    -Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
    -KM kullanıcıdan alınılacak. (ditance double) ✅
    -Taksimetre KM başına 2.20 TL tutmaktadır. (double) ✅
    Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.(starting_tip int)
    Taksimetre açılış ücreti 10 TL'dir. (starting tip) ✅
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distance, totalPrice, costPerKm = 2.20, startingTip = 10;

        //User defines the distance;
        System.out.print("Kaç km gidilecek:");
        distance = input.nextDouble();

        // Total price by km:
        totalPrice = startingTip + (distance * costPerKm);
        // Total cost:
        System.out.println(totalPrice <= 20 ? "Total cost for customer is : 20" : "Total cosst for user:" + totalPrice);

    }
}