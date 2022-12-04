import java.util.Arrays;
import java.util.Scanner;

public class ElemanSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int value;
        int startIndex = 0;


        System.out.print("Dizinin boyutu n : ");
        n = input.nextInt();
        System.out.println("Dizinin elemanlarını giriniz : ");
        int[] arr = new int[n];


        for (int i = 1; i <= n; i++){
            System.out.print(i + ". Elemanı : ");
            value = input.nextInt();
            arr[startIndex++] = value;
        }
        Arrays.sort(arr);
        System.out.println("Sıralama : " + Arrays.toString(arr));
    }
}
