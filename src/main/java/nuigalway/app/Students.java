package nuigalway.app;
import java.util.ArrayList;
import org.joda.time.LocalDate;
import org.joda.time.Years;

public class Students {

    private String name;
    private LocalDate dob;
    private int age;
    private int id;
    ArrayList<Modules> modules = new ArrayList();
    private Course enrolledCourses;

    public Students(String name, LocalDate dob, int age, int id, ArrayList<Modules> modules) {
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.id = id;
        this.modules = modules;
    }

    public String getUsername() {
        return name + age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDOB() {
        return dob;
    }

    public void setDOB(LocalDate dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public ArrayList<Modules> getModules() {
        return modules;
    }

    public void addModule(Modules newModule) {modules.add(newModule);}

    public void setModules(ArrayList<Modules> modules) {
        this.modules = modules;
    }

    public Course getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(Course enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }


}