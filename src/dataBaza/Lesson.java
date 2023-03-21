package dataBaza;

public class Lesson {
    private String name;
private int id;
private String description;
    public Lesson(int id) {
        this.id=id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name=" + name + '\'' +
                ", id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
