import java.time.LocalDate;

public class Member {
    private static int nextId = 1;

    protected int id;
    protected String name;
    protected LocalDate createdDate;
    protected boolean active;

    //constructor
    public Member(String name, int i, int j) {
        this.name = name;
        createdDate = LocalDate.now();
        this.id = nextId++;
        this.active = true;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public LocalDate getHireDate() {
        return createdDate;
    }
    public boolean isActive() {
        return active;
    }

    public void fire() {
        active = false;
    }

    public void print() {
        System.out.println("Employee: "+this.name+"ID: "+this.id);
    }
}