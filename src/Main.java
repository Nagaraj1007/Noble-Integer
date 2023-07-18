import java.util.Arrays;

public class Main {

    public static int nobleInteger(int[] array){
        Arrays.sort(array);
        int greaterArrayValues[] = new int[array.length];
        for (int iterator = 0 ; iterator < array.length ; iterator++){
            int sum = 0;
            for (int iterator2 = iterator + 1 ; iterator2 < array.length ; iterator2++){
                sum += (array[iterator] < array[iterator2]) ? 1 : 0;
            }
            greaterArrayValues[iterator] = sum;
        }
        int count = 0;
        for (int iterator = 0 ;iterator < array.length ; iterator++){
            count += (array[iterator] == greaterArrayValues[iterator]) ? 1 : 0;
        }
        return (count == 0) ? -1 : count ;
    }

    public static void main(String[] args) {
        System.out.println(nobleInteger(new int[]{1, 1, 3, 3}));
    }
}