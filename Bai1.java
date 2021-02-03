import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) throws Exception {
        // 1 Viết chương trình nhập vào một mảng gồm n số nguyên và thực hiện các công
        // việc sau:

        // · Xuất các giá trị của mảng ra

        // · Tìm min, max

        // · Tìm và đếm các số chẵn trong mảng

        // · Tìm các số nguyên tố có trong mảng

        // · Sắp xếp mảng theo thứ tự tăng dần

        // · Sắp xếp theo thứ tự giảm dần
        System.out.println("Nhập vào số phần tử của mảng: ");
        int n = new Scanner(System.in).nextInt();
        int arr[] = new int[n];

        // Nhap vao cac phan tu mang
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1) + " của mảng: ");
            arr[i] = new Scanner(System.in).nextInt();
        }

        // Xuat ra cac gia tri cua mang, tim min max
        int min = arr[0], max = arr[0], countEven = 0, countPrime = 0, count = 0;
        System.out.println("Các phần tử của mảng đã nhập: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
            // tìm min
            if (min > arr[i]) {
                min = arr[i];
            }
            // tìm max
            if (max < arr[i]) {
                max = arr[i];
            }
            // tìm số chẵn
            if (arr[i] % 2 == 0) {
                countEven++;
            }
            // tìm số nguyên tố
            for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                if (arr[i] % j == 0 && arr[i] >= 2) {
                    count++;
                }
            }
            if (count == 0) {
                countPrime++;
            }
        }
        System.out.println("\nGiá trị lớn nhất: " + max);
        System.out.println("Giá trị nhỏ nhất: " + min);
        System.out.println("Số các số chẵn: " + countEven);
        System.out.println("Số các số nguyên tố: " + countPrime);

        // Sắp xếp mang tăng, giảm dần
        // Tăng dần
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Dãy số tăng dần: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        // Giảm dần
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Dãy số tăng dần: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
