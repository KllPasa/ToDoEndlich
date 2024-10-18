import java.util.Scanner;

public class StartProgram {

    ToDoList list1 = new ToDoList();
    Scanner sc = new Scanner(System.in);

    public void fuehrProgam() {
        while (true) {
            try {
                System.out.println("1- Add a 'to do'.");
                System.out.println("2- Remove a 'to do'.");
                System.out.println("3- Show my 'to do' list.");
                System.out.println("4- Quit");
                System.out.print("Your choice: ");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Enter a 'to do' item:");
                        String itemToAdd = sc.nextLine().trim();
                        list1.addToDo(itemToAdd);
                        System.out.println("************************");
                        System.out.println("'" + itemToAdd + "' added to your list.\n");
                        System.out.println("************************");
                        break;

                    case 2:
                        System.out.println("Enter the 'to do' item to remove:");
                        String itemToRemove = sc.nextLine().trim();
                        list1.removeToDo(itemToRemove);
                        System.out.println("************************");
                        System.out.println("'" + itemToRemove + "' removed from your list.\n");
                        System.out.println("************************");
                        break;

                    case 3:
                        System.out.println("************************");
                        System.out.println("Your list:");
                        list1.showToDoList();
                        System.out.println("************************");
                        break;

                    case 4:
                        System.out.println("Program has been ended!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Unknown entry... Try again!");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine();
            }
        }
    }
}
