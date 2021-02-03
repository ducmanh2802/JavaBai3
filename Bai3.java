import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) throws Exception {
        // 3 Viết chương trình nhập vào 2 ma trận vuông A và B , in mảng đó ra màn hình.

        // Thực hiện cộng 2 ma trận

        // Tìm ma trận chuyển vị của 2 ma trận đó
        System.out.println("Nhập vào n à kích thước của ma trận vuông n*n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[][] = new int[n][n];
        int b[][] = new int[n][n];

        // Nhap vao cac phan tu ma tran a
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập vào phần tử thứ " + (i + 1) + " " + (j + 1) + " của ma trận a: ");
                a[i][j] = scanner.nextInt();
            }
        }
        // Nhap vao cac phan tu ma tran b
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập vào phần tử thứ " + (i + 1) + " " + (j + 1) + " của ma trận b: ");
                b[i][j] = scanner.nextInt();
            }
        }
        // Xuat ra cac gia tri cua mang 
        System.out.println("Các phần tử của ma trận a: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Các phần tử của ma trận b: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println("");
        }

        // Tính tổng 2 ma trận
        int c[][] = new int[n][n];
        System.out.println("Ma trận tổng: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = b[i][j] + a[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
