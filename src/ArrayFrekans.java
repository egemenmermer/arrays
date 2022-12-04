import java.util.Arrays;

public class ArrayFrekans {

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicate = new int[arr.length];
        int visited = -1;

        for(int i = 0; i < arr.length; i++){
            int counter = 1;
            for(int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    counter++;
                    duplicate[j] = visited;
                }
            }
            if (duplicate[i] != visited)
                duplicate[i] = counter;
        }

        System.out.println("Dizi : " + Arrays.toString(arr));
        System.out.println("Tekrar Sayıları");
        for (int i = 0; i < duplicate.length; i++) {
            if (duplicate[i] != visited)
                System.out.println(arr[i] + " sayısı " + duplicate[i] + " kere tekrar edildi.");
        }
    }
}
