import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
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
                scanner.nextLine();
                System.out.println("___________________________________");

                switch (choice) {
                    case 1:
                        System.out.println("***********************************");
                        System.out.println("Chosen option 1");

                        System.out.print("Enter Student ID: ");
                        String id = scanner.nextLine();

                        System.out.print("Enter Student Name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter Student Age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter Student Grade: ");
                        String grade = scanner.nextLine();

                        manager.addStudents(new Student(id, name, age, grade));

                        System.out.println("Student Added");

                        System.out.println("***********************************");
                        break;
                    case 2:
                        System.out.println("***********************************");

                        System.out.println("Chosen option 2");
                        System.out.println(manager.getAllStudents());

                        System.out.println("***********************************");
                        break;
                    case 3:
                        System.out.println("***********************************");
                        System.out.println("Chosen option 3");

                        System.out.print("Enter Student ID: ");
                        String Id = scanner.nextLine();

                        System.out.println("/n"+manager.searchById(Id));

                        System.out.println("***********************************");
                        break;
                    case 4:
                        System.out.println("***********************************");
                        System.out.println("Chosen option 4");

                        System.out.print("Enter a Student ID to update: ");
                        String ID = scanner.nextLine();

                        System.out.print("Enter new Student Name: ");
                        String sNmae = scanner.nextLine();

                        System.out.print("Enter new Student Age: ");
                        int sAge = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter new Student Grade: ");
                        String sGrade = scanner.nextLine();

                        if(manager.updateStudent(sNmae, ID, sAge, sGrade)){
                            System.out.println(ID + " Student edited");
                        }else {
                            System.out.println(ID + "Student not exist");
                        }

                        System.out.println("***********************************");
                        break;
                    case 5:
                        System.out.println("***********************************");
                        System.out.println("Chosen option 5");
                        
                        System.out.print("Enter Studen ID to delete: ");
                        String sId = scanner.nextLine();

                        if(manager.deleteById(sId)){
                            System.out.println(sId + " deleted");
                        } else {
                            System.out.println(sId + " not exist");
                        }
                        
                        System.out.println("***********************************");
                        break;
                    case 6:
                        System.out.println("***********************************");
                        System.out.println("Exit");
                        System.out.println("***********************************");
                        break;
                    default: 
                        System.out.println("Invalid Option");
                }
            } while (choice != 6 );

        }
    }
}
