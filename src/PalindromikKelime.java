import java.util.Scanner;
public class PalindromikKelime {
    static boolean isPalindrome(String str){
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        System.out.println("Kelime giriniz: ");
        word = sc.nextLine();
        if(isPalindrome(word) == true){
            System.out.println("Kelime palindromik'tir.");
        }else {
            System.out.println("Kelime palindromik degildir.");
        }
    }
}
