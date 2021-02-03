import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) throws Exception {
        // 4 Viết chương trình nhập vào 1 mảng đa chiều, in mảng đó ra màn hình.

        // Tính tổng các phần tử chia hết cho 5 trong mảng đó
        System.out.println("Nhập vào số chiều của ma trận(12,3,4...): ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a == 1) {
            System.out.println("Nhập vào kích thước mảng: ");
            int n = scanner.nextInt();

            int arr[] = new int[n];
            System.out.println("Nhập vào các phần tử của mảng:");
            int sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                if (arr[i] % 5 == 0) {
                    sum += arr[i];
                }
            }
            System.out.println("Mảng đã nhập vào: ");
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i] + " ");
            }
            System.out.println("Tổng các số chia hết cho 5: " + sum);
        }
        if (a == 2) {
            System.out.println("Nhập vào kích thước mảng: ");
            System.out.println("Nhập n: ");
            int n = scanner.nextInt();
            System.out.println("Nhập m: ");
            int m = scanner.nextInt();
            int sum = 0;
            int arr[][] = new int[n][m];
            System.out.println("Nhập vào các phần tử của mảng:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = scanner.nextInt();
                    if (arr[i][j] % 5 == 0) {
                        sum += arr[i][j];
                    }
                }

            }

            System.out.println("Mảng đã nhập vào: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.println(arr[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("Tổng các số chia hết cho 5: " + sum);

        }
        if (a == 3) {
            System.out.println("Nhập vào kích thước mảng: ");
            System.out.println("Nhập n: ");
            int n = scanner.nextInt();
            System.out.println("Nhập m: ");
            int m = scanner.nextInt();
            System.out.println("Nhập p: ");
            int p = scanner.nextInt();
            int sum = 0;
            int arr[][][] = new int[n][m][p];

            System.out.println("Nhập các phần tử của mảng: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; i < n; j++) {
                    for (int k = 0; i < n; k++) {
                        arr[i][j][k] = scanner.nextInt();
                        if (arr[i][j][k] % 5 == 0) {
                            sum += arr[i][j][k];
                        }
                    }

                }

            }
            System.out.println("Mảng đã nhập vào: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; i < n; i++) {
                    for (int k = 0; i < n; i++) {
                        System.out.println(arr[i][j][k] + " ");
                    }
                    System.out.println("");

                }
                System.out.println("");

            }
            System.out.println("Tổng các số chia hết cho 5: " + sum);
        }
    }
}
