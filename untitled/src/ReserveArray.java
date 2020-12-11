import java.util.Scanner;

public class ReserveArray {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so luong cua mang");
        int n = scanner.nextInt();
        while (n>20){
            System.out.println("nhap lai so nho hon 20");
            n = scanner.nextInt();
        }
        int[] arr = insert(n);
        int[] result = reverse(arr);
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < result.length; j++) {
            System.out.print(result[j] + "\t");
        }
    }

    public static int[] insert(int n) {
        int[] arr = new int[n];
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao phan tu trong mang");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr ;
    }
    public static int[] reverse(int arr[]){
        for (int i = 0;i<=(arr.length-1)/2;i++) {
            int tem = arr[i];
            arr[i]= arr[arr.length-1-i];
            arr[arr.length-1-i] = tem;
        }
        return arr;
    }
}
