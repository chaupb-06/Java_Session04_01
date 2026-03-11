package baitap;

import java.util.Scanner;

public class Java_Session04_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        System.out.println("Nhập các phần tử của mảng:");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ "+(i+1)+": ");
            a[i] = sc.nextInt();
        }
        System.out.println("Mảng sau khi sắp xếp giảm dần:");
        bubbleSort(a);
        for  (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void bubbleSort(int[] arr) {
        boolean swapped;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
