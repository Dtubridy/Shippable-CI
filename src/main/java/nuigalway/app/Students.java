package nuigalway.app;

public class Students {

    String name;
    Integer age;
    String dob;
    Integer id;
    String username;
    String courses;
    String registeredModules;

    public Students(String name, Integer age, String dob, Integer id, String username, String courses, String registeredModules) {
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
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
