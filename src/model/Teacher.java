package model;
import java.util.List;
import java.util.Objects;

public class Teacher  extends Person{

    public List<Course> courses;


    public Teacher(String firstName, String lastName, List<Course> courses){
        super(firstName, lastName);
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "courses=" + courses +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), courses);
    }
}

