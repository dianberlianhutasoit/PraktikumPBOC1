package pertemuan10;

public class Person {
    private int id;
    private String name;

    // Constructor untuk insert data baru (id auto increment)
    public Person(String n) {
        this.name = n;
    }

    // Constructor lengkap
    public Person(int i, String n) {
        this.id = i;
        this.name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}