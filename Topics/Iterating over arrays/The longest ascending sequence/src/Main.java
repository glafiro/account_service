import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }

        int counter = 1;
        int maxCounter = 1;
        for (int i = 1; i < len; i++) {
            if (arr[i] > arr[i - 1]) {
                counter++;
            } else {
                counter = 1;
            }
            if (counter > maxCounter) {
                maxCounter = counter;
            }
        }



        System.out.println(maxCounter);
    }
}