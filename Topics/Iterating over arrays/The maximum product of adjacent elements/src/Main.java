import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Read input
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }

        // Create array of products
        int[] products = new int[len-1];
        for (int i = 0; i < len - 1; i++) {
            products[i] = arr[i] * arr[i + 1];
        }

        // Find max value
        int max = products[0];
        for (int i = 1; i < products.length; i++) {
            if (max < products[i]) max = products[i];
        }

        System.out.println(max);
    }
}