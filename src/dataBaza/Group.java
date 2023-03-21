package dataBaza;

import java.util.List;

public class Group {
    private String name;
    private String description;
    private long id;
    private List<Student>students;
    private List<Lesson>lessons;

    public Group(long id,String name, String description ) {
        this.name = name;
        this.description = description;
        this.id = id;
    }

    public Group(String name, String description, long id, List<Student> students, List<Lesson> lessons) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.students = students;
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Group:\n" +
                "name: " + name +
                ", description: " + description +
                ", id:" + id +
                ", students:" + students +
                ", lessons:" + lessons +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }
}
