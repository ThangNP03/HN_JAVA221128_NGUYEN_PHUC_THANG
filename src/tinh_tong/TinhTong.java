package tinh_tong;

import java.util.Scanner;

public class TinhTong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }

        }
        System.out.println("Tổng các số chẵn là " + sum);
    }
}
