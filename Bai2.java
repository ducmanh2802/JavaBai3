import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) throws Exception {
        // 2 Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên
        // dương.

        // In ra màn hình mảng đó

        // Sắp xếp các phần tử mảng theo thứ tự giảm dần

        // Tìm phần tử lớn nhất và lớn thứ 2 trong mảng cùng chỉ số của các số đó.
        System.out.println("Nhập vào số phần tử của mảng: ");
        int n = new Scanner(System.in).nextInt();
        int arr[] = new int[n];

        // Nhap vao cac phan tu mang
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1) + " của mảng: ");
            arr[i] = new Scanner(System.in).nextInt();
        }

        // Xuat ra cac gia tri cua mang
        System.out.println("Các phần tử của mảng đã nhập: ");
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
        System.out.println("\nDãy số tăng dần: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        // tìm giá trị lớn nhất
        int max = arr[0], max2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("\nPhần tử lớn nhất: " + max);

        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                continue;
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.println("Phần tử lớn thứ hai: " + max2);

    }
}
