public class StaffUser extends LibraryUser {
    public StaffUser(String name) {
        super(name);
    }

    @Override
    public void accessLibrary() {
        System.out.println(getName() + " manages the library.");
    }
}