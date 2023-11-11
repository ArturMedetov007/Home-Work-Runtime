import java.util.Arrays;

public class Massiv {
    public static void main(String[] args) {

        System.out.println("1 zadanie");
        int[] number1 = {7, -3, 9, -11, 18, 99, 2, 11};

        for (int i = 0; i < 3; i++) {
            System.out.println(number1[i]);
        }
        System.out.println("2 zadanie");
        int[] number2 = {7, -3, 9, -11, 18, 99, 2, 11};

        for (int i = 0; i < number2.length/2; i++) {
            System.out.println(number2[i]);
        }

        System.out.println("3 zadanie");
        int[] number3 = {7, -3, 9, -11, 18, 99, 2, 11};

        for (int i = number3.length/2; i < number3.length; i++) {
            System.out.println(number3[i]);
        }

        System.out.println("4 zadanie");
        int[] number4 = {7, -3, 9, -11, 18, 99, 2, 11};
        int first = number4[0];

        for (int i = number4.length - first; i < number4.length-1; i++) {
            System.out.println(number4[i]);
        }
        System.out.println("5 zadanie");
        int[] number5 = {7, -3, 9, -11, 18, 99, 2, 11};

        for (int i = number5.length - 3; i < number5.length; i++) {
            System.out.print(" ");
            System.out.print(number5[i]);
        }
        System.out.println("6 zadanie");
        int[] number6 = {7, -3, 9, -11, 18, 99, 2, 11};

        for (int i = 1; i < number6.length; i+=2) {

            System.out.println(number6[i]);
        }

        System.out.println("7 zadanie");
        int[] number7 = {7, -3, 9, -11, 18, 99, 2, 11};

        int [] positiveCount = {7,9,18,99,2,11};
        int [] negativeCount = {-3,-11};
        System.out.println(Arrays.toString(positiveCount));
        System.out.println(Arrays.toString(negativeCount));

        System.out.println("8 zadanie");
        int[] number8 = {7, -3, 9, -11, 18, 99, 2, 11};

        int max = number8[0];
        int min = number8[0];

        for (int i = 1; i < number8.length; i++) {
            if(number8[i] > max){
                max = number8[i];
            }
            if(number8[i] < min){
                min = number8[i];
            }
        }
        System.out.println(max+" " + min);



    }

}
