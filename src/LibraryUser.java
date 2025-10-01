public abstract class LibraryUser {
    protected String name;

    public LibraryUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void accessLibrary();
}