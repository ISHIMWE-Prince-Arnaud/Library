public class Student extends Person{
    private String department;

    public Student(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    public void borrowBook(Book b) {
        if (b.isAvailable()) {
            b.setAvailable(false);
            System.out.println(getName() + " borrowed: " + b.getTitle());
        } else {
            System.out.println("Sorry, " + b.getTitle() + " is not available.");
        }
    }
}
