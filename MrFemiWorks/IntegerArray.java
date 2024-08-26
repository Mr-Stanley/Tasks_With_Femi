package MrFemiWorks;
public class IntegerArray {


    static int arrayDifference(int [] numbers) {
        int bigDigit = numbers[0];
        int smallDigit = numbers[0];



        for (int index = 0; index < numbers.length; index++) {
            if(index == 2) bigDigit = numbers[index];
            if(bigDigit == 0)smallDigit = numbers[index];
        }

        return (bigDigit - smallDigit);


    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 9, 5, 1, 3, 5};

        System.out.printf("The difference between the element at index 2 and index 0 is: %d",arrayDifference(numbers));
    }

}