import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Library Management System:");
            System.out.println("1. Add Book");
            System.out.println("2. Search by Title");
            System.out.println("3. Search by Author");
            System.out.println("4. Check Out Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    catalog.addBook(new Book(title, author));
                    break;
                case 2:
                    System.out.print("Enter title: ");
                    title = scanner.nextLine();
                    catalog.searchByTitle(title);
                    break;
                case 3:
                    System.out.print("Enter author: ");
                    author = scanner.nextLine();
                    catalog.searchByAuthor(author);
                    break;
                case 4:
                    System.out.print("Enter title: ");
                    title = scanner.nextLine();
                    catalog.checkOutBook(title);
                    break;
                case 5:
                    System.out.print("Enter title: ");
                    title = scanner.nextLine();
                    catalog.returnBook(title);
                    break;
                case 6:
                    System.out.println("Exiting system...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
