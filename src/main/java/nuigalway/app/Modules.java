package nuigalway.app;

import java.util.ArrayList;

public class Modules {
    private String name;
    private int id;
    private ArrayList<Students> students;
    private ArrayList<Course> courses;

    public Modules(String name, int id) {
        setName(name);
        setId(id);
        students = new ArrayList<Students>();
        courses = new ArrayList<>();
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

    public ArrayList<Students> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Students> students) {
        this.students = students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {

        this.courses.add(course);
    }

    public void addStudent(Students newStudent) {
        this.students.add(newStudent);

    }

}
