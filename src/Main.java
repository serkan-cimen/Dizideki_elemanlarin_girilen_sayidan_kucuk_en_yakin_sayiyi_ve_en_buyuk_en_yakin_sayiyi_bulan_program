import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] dizi = {15, 12, 788, 1, -1, 788, 2, 0};
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int girilenSayi = input.nextInt();

        int enKucukYakin = findClosetSmaller(dizi, girilenSayi);
        int enBuyukYakin = findClosetLarger(dizi, girilenSayi);

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + enKucukYakin);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + enBuyukYakin);
    }

    public static int findClosetSmaller(int[] arr, int target) {
        int closest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num < target && num > closest) {
                closest = num;
            }
        }

        return closest;
    }

    public static int findClosetLarger(int[] arr, int target) {
        int closest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > target && num < closest) {
                closest = num;
            }
        }

        return closest;
    }
}