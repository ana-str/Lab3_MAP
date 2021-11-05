package repository;
import exceptions.MyException;
import model.Person;
import model.Course;

/**
 * Repository Class that manages all CRUD operations for a Person
 *
 * @param <T> generic PersonRepo
 */


public class PersonRepo <T extends Person>  extends InMemoryRepository<T>{

    public PersonRepo() {
        super();
    }

    @Override
    public T find(Long id) throws MyException {
        return null;
    }

    @Override
    public T save(T obj) throws MyException {
        return null;
    }

    @Override
    public T update(T obj) throws MyException {
        return null;
    }

    @Override
    public T delete(Long id) throws MyException {
        return null;
    }
}
