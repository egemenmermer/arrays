import java.util.Arrays;

public class RepeatedEvenNumbers {

    static boolean isRepeated(int[] arr, int value){
        for (int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = { 7, 5, 6, 88, 155, 6, 78 , 14, 5, 88};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list.length; j++){
                if ((i != j) && (list[i] == list[j] && list[i] % 2 == 0)){
                    if (!isRepeated(duplicate, list[i])){
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        for (int value : duplicate){
            if(value != 0){
                System.out.println(value);
            }
        }
    }
}
