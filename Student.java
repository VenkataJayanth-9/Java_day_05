public class Student {
    private String name;
    private String id;
    private String course;

    public Student(String name, String id, String course)
    {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
