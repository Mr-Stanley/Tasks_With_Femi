package Task;

public class CheckProduct {
   public static int theProducts(int[] number){
        int firstDigit = number[0];
        int secondDigit = number[0];

        for (int count = 1; count < number.length; count++) {
            if (count == 0) firstDigit = number[count];
            if (count == 1) secondDigit = number[count];
        }

            return (firstDigit * secondDigit);

    }
    public static void main(String[] args) {
        int [] number = {-10, -3, 5, 6, -2 };

        System.out.printf("The Product of element at index 1 and index 0 is: %d",theProducts(number));
    }
}
