import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Student Management System");

        try(Scanner scanner = new Scanner(System.in)){

            int choice;

            do{
                System.out.println("___________________________________");
                System.out.println("\n---Student Management System---");
                System.out.println("1. Add Student");
                System.out.println("2. View All Student");
                System.out.println("3. Search by Student ID");
                System.out.println("4. Update Student");
                System.out.println("5. Delete Student");
                System.out.println("6. Exit");
                System.out.print("Choose an option: ");
                choice = scanner.nextInt();
                System.out.println("___________________________________");

                switch (choice) {
                    case 1:
                    System.out.println("Chosen option 1");
                    break;
                    case 2:
                    System.out.println("Chosen option 2");
                    break;
                    case 3:
                    System.out.println("Chosen option 3");
                    break;
                    case 4:
                    System.out.println("Chosen option 4");
                    break;
                    case 5:
                    System.out.println("Chosen option 5");
                    break;
                    case 6:
                    System.out.println("Exit");
                    break;
                    default: 
                    System.out.println("Invalid Option");
                }
            } while (choice != 6 );

        }
    }
}
