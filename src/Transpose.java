import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 3, 4, 5 } };
        int width = arr.length;
        int height = arr[0].length;

        int[][] array_new = new int[height][width];

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                array_new[y][x] = arr[x][y];
            }
        }
        System.out.println("Matris : ");
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Transpoze : ");
        System.out.print(Arrays.deepToString(array_new));

    }
}
