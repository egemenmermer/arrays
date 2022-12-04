public class HarmonikOrtalama {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;
        double harmonic = 0;


        for(double j: numbers){
            if (j != 0){
                sum += (1/j);
                harmonic = numbers.length / sum;
            }
        }
        System.out.println("Harmonik ortalamasi: " + harmonic);
    }
}