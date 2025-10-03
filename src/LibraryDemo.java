import java.util.ArrayList;
import java.util.Scanner;

public class LibraryDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Staff> staffMembers = new ArrayList<>();

        System.out.println("📚 Welcome to the Interactive Library System!");

        int choice;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add a Book");
            System.out.println("2. Add a Student");
            System.out.println("3. Add a Staff Member");
            System.out.println("4. Student Borrow a Book");
            System.out.println("5. Staff Manage a Book");
            System.out.println("6. Access Library (Abstraction Demo)");
            System.out.println("7. Polymorphism Demo");
            System.out.println("0. Exit");
            System.out.print("👉 Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    books.add(new Book(title, author, true));
                    System.out.println("✅ Book added successfully!");
                    break;

                case 2:
                    System.out.print("Enter student name: ");
                    String sName = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    int sId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter department: ");
                    String dept = scanner.nextLine();
                    students.add(new Student(sName, sId, dept));
                    System.out.println("✅ Student added successfully!");
                    break;

                case 3:
                    System.out.print("Enter staff name: ");
                    String stName = scanner.nextLine();
                    System.out.print("Enter staff ID: ");
                    int stId = scanner.nextInt();
                    scanner.nextLine();
                    staffMembers.add(new Staff(stName, stId));
                    System.out.println("✅ Staff added successfully!");
                    break;

                case 4:
                    if (students.isEmpty() || books.isEmpty()) {
                        System.out.println("⚠️ Please add students and books first!");
                        break;
                    }
                    System.out.println("Choose a student:");
                    for (int i = 0; i < students.size(); i++)
                        System.out.println((i + 1) + ". " + students.get(i).getName());
                    int stuIndex = scanner.nextInt() - 1;

                    System.out.println("Choose a book:");
                    for (int i = 0; i < books.size(); i++)
                        System.out.println((i + 1) + ". " + books.get(i).getTitle() +
                                " (Available: " + books.get(i).isAvailable() + ")");
                    int bookIndex = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (stuIndex >= 0 && stuIndex < students.size() &&
                            bookIndex >= 0 && bookIndex < books.size()) {
                        students.get(stuIndex).borrowBook(books.get(bookIndex));
                    } else {
                        System.out.println("❌ Invalid selection.");
                    }
                    break;

                case 5:
                    if (staffMembers.isEmpty() || books.isEmpty()) {
                        System.out.println("⚠️ Please add staff and books first!");
                        break;
                    }
                    System.out.println("Choose a staff:");
                    for (int i = 0; i < staffMembers.size(); i++)
                        System.out.println((i + 1) + ". " + staffMembers.get(i).getName());
                    int staffIndex = scanner.nextInt() - 1;

                    System.out.println("Choose a book:");
                    for (int i = 0; i < books.size(); i++)
                        System.out.println((i + 1) + ". " + books.get(i).getTitle());
                    int bIndex = scanner.nextInt() - 1;
                    scanner.nextLine();

                    System.out.print("Enter 'add' to add or 'remove' to remove: ");
                    String action = scanner.nextLine();

                    if (staffIndex >= 0 && staffIndex < staffMembers.size() &&
                            bIndex >= 0 && bIndex < books.size()) {
                        Staff st = staffMembers.get(staffIndex);
                        Book bk = books.get(bIndex);
                        if (action.equalsIgnoreCase("add"))
                            st.manageBook(bk, true);
                        else if (action.equalsIgnoreCase("remove"))
                            st.manageBook(bk, false);
                        else
                            System.out.println("❌ Invalid action.");
                    } else {
                        System.out.println("❌ Invalid selection.");
                    }
                    break;

                case 6:
                    System.out.println("=== Abstraction Demo ===");
                    LibraryUser u1 = new StudentUser("DemoStudent");
                    LibraryUser u2 = new StaffUser("DemoStaff");
                    u1.accessLibrary();
                    u2.accessLibrary();
                    break;

                case 7:
                    System.out.println("=== Polymorphism Demo ===");
                    if (books.isEmpty()) {
                        System.out.println("⚠️ Add at least one book first!");
                        break;
                    }
                    Student polyStu = new Student("PolyStudent", 101, "Math");
                    Staff polyStaff = new Staff("PolyStaff", 202);
                    polyStu.borrowBook(books.get(0));
                    polyStaff.manageBook(books.get(0), false);
                    break;

                case 0:
                    System.out.println("👋 Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("❌ Invalid choice, try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}