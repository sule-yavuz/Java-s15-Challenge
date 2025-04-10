package library;



public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void whoYouAre();

    // Getter & Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}