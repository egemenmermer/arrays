import java.util.Arrays;
import java.util.Scanner;

public class EnYakinKucukBuyuk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = {56, 34, 1, 8, 101, -2, -33};
        int n;
        int lessThan = Integer.MIN_VALUE;
        int biggerThan = Integer.MAX_VALUE;

        System.out.println("Dizi: " + Arrays.toString(arr));
        System.out.print("Girilen Sayı : ");
        n = input.nextInt();
        Arrays.sort(arr);

        for (int i= 0; i < arr.length;i++){
            if (n > arr[i]){
                lessThan = arr[i];
            } else if (n < arr[i]) {
                if (arr[i] < biggerThan) {
                    biggerThan = arr[i];
                }
            }

        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + lessThan);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + biggerThan);
    }
}
