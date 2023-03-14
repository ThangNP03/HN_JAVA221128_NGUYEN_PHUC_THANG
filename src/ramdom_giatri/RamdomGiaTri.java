package ramdom_giatri;

import java.util.Arrays;
import java.util.Random;

public class RamdomGiaTri {
    public static void main(String[] args) {
        int[] arr = new int[50];
        Random rand = new Random();

        // Sinh ngẫu nhiên các phần tử và lưu vào mảng
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(arr));

        // In ra các phần tử lớn nhất trong mảng
         int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
        //timg phần tử bé nhất
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <  min) {
                min = arr[i];
            }
        }
        System.out.println("Phàn tử bé nhất trong mảng là : " + min);
        //sắp xếp mảng tăng dần
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        //Đếm số lần số nguyên tó xuất hiện trong mảng
        int count = 0;
        for (int i = 0 ; i < arr.length; i++){
            if(isPrime(arr[i])){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của số nguyên tố trong mảng là: " + count);
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
