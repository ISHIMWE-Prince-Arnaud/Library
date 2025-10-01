public class LibraryDemo {
    public static void main(String[] args) {
        // 1. Create books
        Book b1 = new Book("Java Basics", "John Doe", true);
        Book b2 = new Book("OOP Concepts", "Jane Smith", true);

        // 2. Create student and staff
        Student student = new Student("Alice", 1, "Computer Science");
        Staff staff = new Staff("Bob", 2);

        // 3. Student borrows a book
        student.borrowBook(b1); // should succeed
        student.borrowBook(b1); // should fail (already borrowed)

        // 4. Staff removes and adds a book
        staff.manageBook(b1, false); // remove
        staff.manageBook(b1, true);  // add back

        // 5. Abstraction: accessing library
        LibraryUser user1 = new StudentUser("Alice");
        LibraryUser user2 = new StaffUser("Bob");

        user1.accessLibrary(); // Alice borrows books.
        user2.accessLibrary(); // Bob manages the library.

        // 6. Polymorphism with Person reference
        Student p1 = new Student("Charlie", 3, "Math");
        Staff p2 = new Staff("Diana", 4);

        System.out.println("Polymorphism Demo:");
        p1.borrowBook(b2);
        p2.manageBook(b2, false);
    }
}