package nuigalway.app;

import java.time.LocalDate;
import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Modules> modules;
    private ArrayList<Students> students;
    private LocalDate start;
    private LocalDate end;

    public Course(String name, LocalDate start, LocalDate end) {
        setName(name);
        setStart(start);
        setEnd(end);
        modules = new ArrayList<>();
        students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Modules> getModules() {
        return modules;
    }

    public void addModule(Modules m){
        modules.add(m);
    }

    public void setModuleList(ArrayList<Modules> modules) {
        this.modules = modules;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public ArrayList<Students> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Students> students) {
        this.students = students;
    }

    public void addStudent(Students student){

        this.students.add(student);
    }
}
