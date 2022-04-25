import java.util.Scanner;


public class sortnumber {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        // khởi tạo arr
        int [] arr = new int [n];
        System.out.print("Nhap cac phan tu cua mang: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
       
        sortASC(arr);
        System.out.println("Day so duoc xep sap tang dan: ");
        show(arr);
        ave(arr);
    }
    
    public static void sortASC(int [] arr) {
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
    }
  
    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void ave(int [] arr){
        double total = 0;
        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }
        double average = total / arr.length;
        System.out.println(arr.length);
        System.out.format("ket qua la: %.3f", average);
    }
}