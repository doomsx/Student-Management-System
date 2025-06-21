import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String choose;

        do{
            System.out.println("Yes or No");
            choose = scanner.nextLine();
            count++;
            System.out.println(count);
        } while (choose.equalsIgnoreCase("yes") );

        scanner.close();
    }
}
