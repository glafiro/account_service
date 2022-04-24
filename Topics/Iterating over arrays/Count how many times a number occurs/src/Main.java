import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // READ INPUT
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();

        int counter = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] == target) counter++;
        }

        System.out.println(counter);
    }
}