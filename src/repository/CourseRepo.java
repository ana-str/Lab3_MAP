package repository;
import  model.Course;
import exceptions.MyException;
import java.util.List;
/**
 * Repository Class that manages all CRUD operations for a Course Entity
 */
public class CourseRepo extends InMemoryRepository<Course> {

    public CourseRepo() {
        super();
    }

    @Override
    public Course find(Long id) throws MyException {
        if (id == null)
            throw new MyException("Invalid ID");
        for (Course course: repoList) {
            if (course.getId() == id)
                return course;
        }
        return null;


    }

    @Override
    public Course save(Course obj) throws MyException {
        if (obj == null)
            throw  new MyException ("Invalid object");
        for (Course course: repoList)
            if (course.getId() == obj.getId() )
                return obj;
        repoList.add(obj);
        return null;
    }

    @Override
    public Course update(Course obj) throws MyException {
        if (obj == null)
            throw  new MyException ("Invalid object");
        for(Course course : repoList)
            if (course.getId() == obj.getId()){
                repoList.remove(course);
                repoList.add(obj);
            }

        return null;
    }

    @Override
    public Course delete(Long id) throws MyException {
        if (id == null)
            throw  new MyException ("Invalid object");
        for (Course course : repoList)
            if (course.getId() == id) {
                repoList.remove(course);
                return course;
            }

        return null;
    }
}

