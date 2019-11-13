package nuigalway.app;

import java.time.LocalDate;

public class Students {

    private String name;
    private Integer age;
    private LocalDate dob;
    private Integer id;
    private String username;
    private String courses;
    private String registeredModules;

    public Students(String name, Integer age, LocalDate dob, Integer id, String username, String courses, String registeredModules) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public String getRegisteredModules() {
        return registeredModules;
    }

    public void setRegisteredModules(String registeredModules) {
        this.registeredModules = registeredModules;
    }
}
