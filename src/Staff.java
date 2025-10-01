public class Staff extends Person {
    public Staff(String name, int id) {
        super(name, id);
    }

    public void manageBook(Book b, boolean add) {
        if (add) {
            b.setAvailable(true);
            System.out.println(getName() + " added " + b.getTitle());
        } else {
            b.setAvailable(false);
            System.out.println(getName() + " removed " + b.getTitle());
        }
    }
}