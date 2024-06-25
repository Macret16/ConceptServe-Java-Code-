import java.util.Scanner;

public class arrPrac {
    public static void main(String[] args) {
        // 1 Dimensional Array
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.print("Original 1D array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        int arr2[] = new int[5];
        arr2[0] = 34;
        arr2[1] = 45;
        arr2[2] = 65;
        arr2[3] = 74;
        arr2[4] = 85;
        System.out.print("1D Array 2 : ");
        for (int j = 0; j <= arr2.length - 1; j++) {
            System.out.print(arr2[j] + "/t");
        }
        System.out.println();
        
        // Multidimensional Arrays
        int row, col;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        row = in.nextInt();
        System.out.println("Enter the number of columns: ");
        col = in.nextInt();
        int arr3[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter element for row :" + (i + 1));
                System.out.println("and column " + (j + 1) + ": ");
                arr3[i][j] = in.nextInt();
            }
        }
        System.out.println("\nMulti Dimensional Array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr3[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}